package com.iezview.tour.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.tour.ydt.R;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;

import cn.bmob.v3.BmobUser;

@ContentView(R.layout.activity_main)
public class MainActivity extends AbActivity {

    private BmobUser mUser;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
                    | WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
            window.setNavigationBarColor(Color.TRANSPARENT);
        }

    }

    @Event(
            value = {
                    R.id.text1,//四个按钮
                    R.id.text2,
                    R.id.text3,
                    R.id.text4,
            },
            type =
                    View.OnClickListener.class
    )
    private void OnClick_X(View v) {
        switch (v.getId()) {
            case R.id.text1://报考须知
                startActivity(new Intent(this, HelperActy.class));
                break;
            case R.id.text2://找教练
                startActivity(new Intent(this, LeaveActivity.class));
                break;
            case R.id.text3://找学校
                startActivity(new Intent(this, OnWayActivity.class));
                break;
            case R.id.text4://找陪练
                startActivity(new Intent(this, ItemListActivity.class));

                break;
        }
    }
}
