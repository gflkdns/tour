package com.iezview.tour.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.iezview.tourdemo.R;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;

@ContentView(R.layout.activity_model)
public class ModelActivity extends BaseActivity {

    @ViewInject(R.id.activity_model)
    RelativeLayout activity_model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Event(
            value = {
                    R.id.jingdian,
                    R.id.guiji,
                    R.id.shangchuan,
                    R.id.xianlu,
                    R.id.pinglun,
            },
            type = View.OnClickListener.class
    )
    private void OnClickX(View view) {
        switch (view.getId()) {
            case R.id.jingdian:
                activity_model.setBackgroundResource(R.drawable.test1);
                break;
            case R.id.guiji:
                activity_model.setBackgroundResource(R.drawable.test3);
                break;
            case R.id.shangchuan:
                break;
            case R.id.xianlu:
                activity_model.setBackgroundResource(R.drawable.test2);
                break;
            case R.id.pinglun:
                break;
        }
    }
}
