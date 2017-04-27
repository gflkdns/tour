package com.iezview.tour.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.iezview.tour.activity.dummy.DummyContent;
import com.iezview.tour.entity.Comment;
import com.iezview.tour.entity.Favour;
import com.tour.ydt.R;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.CountListener;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SaveListener;
import cn.bmob.v3.listener.UpdateListener;

@ContentView(R.layout.activity_model)
public class ModelActivity extends AbActivity {

    @ViewInject(R.id.ll_content)
    LinearLayout ll_content;
    @ViewInject(R.id.bt_like)
    Button bt_like;
    /**
     * 驾校的id
     */
    private String id;
    /**
     * 点赞的数量
     */
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        id = getIntent().getStringExtra(ItemDetailFragment.ARG_ITEM_ID);
        BmobQuery<Comment> query = new BmobQuery<>();
        query.addWhereEqualTo("linkId", id);
        query.findObjects(new FindListener<Comment>() {
            @Override
            public void done(List<Comment> list, BmobException e) {
                if (e == null) {
                    if (list != null && list.size() > 0) {
                        for (int i = 0; i < list.size(); i++) {
                            addView(list.get(i).getContext());
                        }
                    }
                } else {
                    Toast.makeText(ModelActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        BmobQuery<Favour> query2 = new BmobQuery<>();
        query2.addWhereEqualTo("linkid", id);
        query2.count(Favour.class, new CountListener() {
            @Override
            public void done(Integer integer, BmobException e) {
                if (e == null) {
                    count = integer;
                    bt_like.setText("[" + count + "]赞");
                }
            }
        });
    }

    @Event(
            value = {
                    R.id.bt_commit,
                    R.id.bt_like,
            },
            type = View.OnClickListener.class
    )
    private void OnClickX(View view) {
        switch (view.getId()) {
            case R.id.bt_commit:
                comment();
                break;
            case R.id.bt_like:
                BmobQuery<Favour> query = new BmobQuery<>();
                query.addWhereEqualTo("name", BmobUser.getCurrentUser().getUsername());
                query.addWhereEqualTo("linkid", id);
                query.findObjects(new FindListener<Favour>() {
                    @Override
                    public void done(List<Favour> list, BmobException e) {
                        if (e == null) {
                            if (list != null && list.size() > 0) {
                                Toast.makeText(ModelActivity.this, "已经点过赞了！", Toast.LENGTH_SHORT).show();
                            } else {
                                Favour favour = new Favour();
                                favour.setName(BmobUser.getCurrentUser().getUsername());
                                favour.setLinkid(id);
                                favour.save(new SaveListener<String>() {
                                    @Override
                                    public void done(String s, BmobException e) {
                                        if (e == null) {
                                            ++count;
                                            bt_like.setText("[" + count + "]赞");
                                        } else {
                                            Toast.makeText(ModelActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });
                            }
                        } else {
                            Toast.makeText(ModelActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                break;
        }
    }

    private void comment() {
        AlertDialog.Builder builder = new AlertDialog.Builder(ModelActivity.this);
        final EditText et_context = new EditText(ModelActivity.this);
        builder.setView(et_context);
        builder.setTitle("评论内容");
        builder.setNegativeButton("取消", null).setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, final int i) {
                String str = et_context.getText().toString();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                final Comment comment = new Comment();
                comment.setContext(BmobUser.getCurrentUser().getUsername() + ":" + str);
                comment.setLinkId(id);
                comment.save(new SaveListener<String>() {
                    @Override
                    public void done(String s, BmobException e) {
                        if (e == null) {
                            Toast.makeText(ModelActivity.this, "评论成功！", Toast.LENGTH_SHORT).show();
                            addView(comment.getContext());
                        } else
                            Toast.makeText(ModelActivity.this, e.toString(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
        builder.create().show();
    }

    private void addView(String str) {
        TextView textView = new TextView(getApplicationContext());
        textView.setTextColor(Color.BLACK);
        textView.setText(str);
        ll_content.addView(textView);
    }
}
