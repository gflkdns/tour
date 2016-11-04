package com.iezview.tour.other;

import com.squareup.otto.Bus;

/**
 * Created by miqt on 2016/11/1.
 * otto总线通讯公交车
 */

public class AppBus extends Bus {
    private volatile static AppBus instance;

    public static AppBus getInstance() {
        if (instance == null) {
            synchronized (AppBus.class) {
                if (instance == null) {
                    instance = new AppBus();
                }
            }
        }
        return instance;
    }
}
