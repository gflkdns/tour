package com.iezview.tour.adapter;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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

import com.iezview.tour.entity.Sparring;
import com.iezview.tour.entity.Comment;
import com.iezview.tour.entity.Favour;
import com.iezview.tour.entity.Sparring;
import com.iezview.tour.entity.Student;
import com.tour.ydt.R;

import org.xutils.image.ImageOptions;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.UpdateListener;

/**
 * Created by Administrator on 2017/5/3.
 */

public class SparringAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater mLayoutInflater;
    private List<Sparring> Sparringes;

    public SparringAdapter(Context context, List<Sparring> Sparringes) {
        this.context = context;
        this.Sparringes = Sparringes;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return Sparringes.size();
    }

    @Override
    public Object getItem(int i) {
        return Sparringes.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final SparringAdapter.ViewHoulder viewHoulder;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.item_sparring, parent, false);
            viewHoulder = new SparringAdapter.ViewHoulder(convertView);
            convertView.setTag(viewHoulder);
        } else {
            viewHoulder = (SparringAdapter.ViewHoulder) convertView.getTag();
        }

        Sparring Sparring = Sparringes.get(position);
        viewHoulder.tv_age.setText("年龄：" + Sparring.getAge());
        viewHoulder.tv_name.setText("姓名：" + Sparring.getName());
        viewHoulder.tv_desc.setText(Sparring.getDesc());
        viewHoulder.tv_sex.setText("性别：" + Sparring.getSex());
        viewHoulder.tv_like.setOnClickListener(new SparringAdapter.InnerListener(position));
        viewHoulder.tv_comment.setOnClickListener(new SparringAdapter.InnerListener(position));
        viewHoulder.tv_signup.setOnClickListener(new SparringAdapter.InnerListener(position));
        ImageOptions.Builder bd = new ImageOptions.Builder();
        //加载图片失败的时候显示这个
        bd.setFailureDrawableId(R.mipmap.ic_launcher);
        bd.setFadeIn(true);
        bd.setRadius(10000);
        x.image().bind(viewHoulder.iv_icon, Sparring.getImage(), bd.build());
        viewHoulder.ll_comments.removeAllViews();
        if (Sparring.getComments() != null && Sparring.getComments().size() > 0) {
            for (Comment comment : Sparring.getComments()) {
                TextView view = new TextView(context);
                view.setText(comment.getContext());
                viewHoulder.ll_comments.addView(view);
            }
        }
        if (Sparring.getFavours() != null && Sparring.getFavours().size() > 0) {
            viewHoulder.tv_likelist.setText(Sparring.getFavours().toString() + "觉得很赞！");
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
                    if (Sparringes.get(index).getFavours() == null) {
                        Sparringes.get(index).setFavours(new ArrayList<Favour>());
                    }
                    List<Favour> favours = Sparringes.get(index).getFavours();
                    Favour favour = new Favour();
                    favour.setName(BmobUser.getCurrentUser().getUsername());
                    if (favours.contains(favour)) {
                        favours.remove(favour);
                    } else {
                        favours.add(favour);
                    }
                    Sparringes.get(index).update();
                    notifyDataSetChanged();
                    break;
                case R.id.tv_comment:
                    comment();
                    break;
                case R.id.tv_signup:
                    if (TextUtils.isEmpty(BmobUser.getCurrentUser(Student.class).getSparringId()))
                        signUp();
                    else
                        Toast.makeText(context, "你已经选择过陪练了！", Toast.LENGTH_SHORT).show();

                    break;
            }
        }

        private void signUp() {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setMessage("确定选择[" + Sparringes.get(index).getName() + "]陪练吗？");
            builder.setTitle("提示");
            builder.setNegativeButton("取消", null).setPositiveButton("确定", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Student student = BmobUser.getCurrentUser(Student.class);
                    student.setSparringId(Sparringes.get(index).getObjectId());
                    student.update(new UpdateListener() {
                        @Override
                        public void done(BmobException e) {
                            if (e != null) {
                                Toast.makeText(context, "选择成功！", Toast.LENGTH_SHORT).show();
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
                    if (Sparringes.get(index).getComments() == null) {
                        Sparringes.get(index).setComments(new ArrayList<Comment>());
                    }
                    //添加一条评论数据
                    Comment comment = new Comment();
                    comment.setContext(BmobUser.getCurrentUser().getUsername() + ":" + str);
                    comment.setLinkId(Sparringes.get(index).getObjectId());
                    Sparringes.get(index).getComments().add(comment);
                    Sparringes.get(index).update(new UpdateListener() {
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
