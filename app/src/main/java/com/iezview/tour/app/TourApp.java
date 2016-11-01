package com.iezview.tour.app;

import android.app.Application;

import org.xutils.x;

/**
 * Created by IEZ on 2016/11/1.
 */

public class TourApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
