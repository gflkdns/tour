package com.iezview.tour.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


import org.xutils.x;

import java.util.Random;

/**
 * 所有activity的父类
 */
public class AbActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
    }

    /**
     * 判断字符串是不是空
     *
     * @param str
     * @return 空返回true
     */
    protected boolean isNullOrEmpty(String... str) {
        for (String s : str) {
            if (s == null) {
                return true;
            }
            if (s.equals("")) {
                return true;
            }
        }
        return false;
    }

    /**
     * 获得一个随机的颜色
     *
     * @return
     */
    protected int getRandomColor() {
        Random random = new Random();
        return Color.rgb(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }
}
