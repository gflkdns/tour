package com.iezview.tour.app;

import android.app.Application;

import org.xutils.x;

import cn.bmob.v3.Bmob;

/**
 * Created by IEZ on 2016/11/1.
 */

public class TourApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        // 初始化  SDK
        Bmob.initialize(this, "c1c33cab990cdba551b1fdd60aa66e59");
    }
}
