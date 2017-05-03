package com.iezview.tour.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.iezview.tour.adapter.SparringAdapter;
import com.iezview.tour.adapter.SparringAdapter;
import com.iezview.tour.entity.Sparring;
import com.iezview.tour.entity.Sparring;
import com.tour.ydt.R;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

@ContentView(R.layout.activity_sparring)
public class SparringActivity extends AppCompatActivity {
    @ViewInject(R.id.lv_spar)
    ListView lv_spar;
    private SparringAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BmobQuery<Sparring> query = new BmobQuery<>();
        //返回50条数据，如果不加上这条语句，默认返回10条数据
        query.setLimit(50);
        //执行查询方法
        query.findObjects(new FindListener<Sparring>() {
            @Override
            public void done(List<Sparring> object, BmobException e) {
                if (e == null) {
                    adapter = new SparringAdapter(SparringActivity.this, object);
                    lv_spar.setAdapter(adapter);
                } else {
                    Log.i("bmob", "失败：" + e.getMessage() + "," + e.getErrorCode());
                }
            }
        });
    }
}
