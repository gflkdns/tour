package com.iezview.tour.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.iezview.tour.adapter.CoachAdapter;
import com.iezview.tour.entity.Coach;
import com.tour.ydt.R;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

@ContentView(R.layout.activity_leave)
public class CoachListActivity extends AbActivity {
    @ViewInject(R.id.lv_Coach)
    ListView lv_Coach;
    private CoachAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BmobQuery<Coach> query = new BmobQuery<>();
        //返回50条数据，如果不加上这条语句，默认返回10条数据
        query.setLimit(50);
        //执行查询方法
        query.findObjects(new FindListener<Coach>() {
            @Override
            public void done(List<Coach> object, BmobException e) {
                if (e == null) {
                    adapter = new CoachAdapter(CoachListActivity.this, object);
                    lv_Coach.setAdapter(adapter);
                } else {
                    Log.i("bmob", "失败：" + e.getMessage() + "," + e.getErrorCode());
                }
            }
        });
    }
}
