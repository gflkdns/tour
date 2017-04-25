package com.iezview.tour.adapter;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.iezview.tour.activity.CoachListActivity;
import com.iezview.tour.activity.ItemListActivity;
import com.iezview.tour.entity.Coach;
import com.iezview.tour.entity.Comment;
import com.iezview.tour.entity.Favour;
import com.iezview.tour.entity.Student;
import com.tour.ydt.R;

import org.xutils.image.ImageOptions;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobQueryResult;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SQLQueryListener;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UpdateListener;

/**
 * 教练适配器
 */
public class CoachAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater mLayoutInflater;
    private List<Coach> coaches;

    public CoachAdapter(Context context, List<Coach> coaches) {
        this.context = context;
        this.coaches = coaches;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return coaches.size();
    }

    @Override
    public Object getItem(int i) {
        return coaches.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final ViewHoulder viewHoulder;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.item_coach, parent, false);
            viewHoulder = new ViewHoulder(convertView);
            convertView.setTag(viewHoulder);
        } else {
            viewHoulder = (ViewHoulder) convertView.getTag();
        }

        Coach coach = coaches.get(position);
        viewHoulder.tv_age.setText("年龄：" + coach.getAge());
        viewHoulder.tv_name.setText("姓名：" + coach.getName());
        viewHoulder.tv_desc.setText(coach.getIntroduce());
        viewHoulder.tv_sex.setText("性别：" + coach.getSex());
        viewHoulder.tv_like.setOnClickListener(new InnerListener(position));
        viewHoulder.tv_comment.setOnClickListener(new InnerListener(position));
        viewHoulder.tv_signup.setOnClickListener(new InnerListener(position));
        ImageOptions.Builder bd = new ImageOptions.Builder();
        //加载图片失败的时候显示这个
        bd.setFailureDrawableId(R.mipmap.ic_launcher);
        bd.setFadeIn(true);
        x.image().bind(viewHoulder.iv_icon, coach.getIcon(), bd.build());
        viewHoulder.ll_comments.removeAllViews();
        if (coach.getComments() != null && coach.getComments().size() > 0) {
            for (Comment comment : coach.getComments()) {
                TextView view = new TextView(context);
                view.setText(comment.getContext());
                viewHoulder.ll_comments.addView(view);
            }
        }
        if (coach.getFavour() != null && coach.getFavour().size() > 0) {
            viewHoulder.tv_likelist.setText(coach.getFavour().toString() + "觉得很赞！");
        } else {
            viewHoulder.tv_likelist.setText("");
        }
        return convertView;
    }

    private class ViewHoulder {
        @ViewInject(R.id.tv_age)
        TextView tv_age;
        @ViewInject(R.id.iv_icon)
        ImageView iv_icon;
        @ViewInject(R.id.tv_desc)
        TextView tv_desc;
        @ViewInject(R.id.tv_sex)
        TextView tv_sex;
        @ViewInject(R.id.tv_name)
        TextView tv_name;
        @ViewInject(R.id.tv_like)
        TextView tv_like;
        @ViewInject(R.id.tv_comment)
        TextView tv_comment;
        @ViewInject(R.id.tv_signup)
        TextView tv_signup;
        @ViewInject(R.id.tv_likelist)
        TextView tv_likelist;
        @ViewInject(R.id.ll_comments)
        LinearLayout ll_comments;

        public ViewHoulder(View v) {
            x.view().inject(this, v);
        }
    }

    private class InnerListener implements View.OnClickListener {
        int index;

        public InnerListener(int index) {
            this.index = index;
        }

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.tv_like:
                    if (coaches.get(index).getFavour() == null) {
                        coaches.get(index).setFavour(new ArrayList<Favour>());
                    }
                    List<Favour> favours = coaches.get(index).getFavour();
                    Favour favour = new Favour();
                    favour.setName(BmobUser.getCurrentUser().getUsername());
                    if (favours.contains(favour)) {
                        favours.remove(favour);
                    } else {
                        favours.add(favour);
                    }
                    coaches.get(index).update();
                    notifyDataSetChanged();
                    break;
                case R.id.tv_comment:
                    comment();
                    break;
                case R.id.tv_signup:
                    if (TextUtils.isEmpty(BmobUser.getCurrentUser(Student.class).getCoachId()))
                        signUp();
                    else
                        Toast.makeText(context, "你已经报名过了！", Toast.LENGTH_SHORT).show();

                    break;
            }
        }

        private void signUp() {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage("确定报名[" + coaches.get(index).getName() + "]教练吗？");
            builder.setTitle("提示");
            builder.setNegativeButton("取消", null).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Student student = BmobUser.getCurrentUser(Student.class);
                    student.setCoachId(coaches.get(index).getObjectId());
                    student.update(new UpdateListener() {
                        @Override
                        public void done(BmobException e) {
                            if (e != null) {
                                Toast.makeText(context, "报名成功！", Toast.LENGTH_SHORT).show();
                                Activity activity = (Activity) context;
                                activity.finish();
                            } else {
                                Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            });
            builder.create().show();
        }

        private void comment() {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            final EditText et_context = new EditText(context);
            builder.setView(et_context);
            builder.setTitle("评论内容");
            builder.setNegativeButton("取消", null).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    String str = et_context.getText().toString();
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    if (coaches.get(index).getComments() == null) {
                        coaches.get(index).setComments(new ArrayList<Comment>());
                    }
                    //添加一条评论数据
                    Comment comment = new Comment();
                    comment.setContext(BmobUser.getCurrentUser().getUsername() + ":" + str);
                    comment.setLinkId(coaches.get(index).getObjectId());
                    coaches.get(index).getComments().add(comment);
                    coaches.get(index).update(new UpdateListener() {
                        @Override
                        public void done(BmobException e) {
                            if (e != null) {
                                Toast.makeText(context, "评论成功！", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            });
            builder.create().show();
        }
    }
}
