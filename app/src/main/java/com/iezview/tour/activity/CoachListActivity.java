package com.iezview.tour.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.iezview.tour.entity.Coach;
import com.tour.ydt.R;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

/**
 * 离开景点页面
 */
@ContentView(R.layout.activity_leave)
public class CoachListActivity extends AbActivity {
    @ViewInject(R.id.lv_Coach)
    ListView lv_Coach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
}
