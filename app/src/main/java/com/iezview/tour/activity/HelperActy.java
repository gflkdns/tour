package com.iezview.tour.activity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;

import com.tour.ydt.R;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

import java.io.IOException;
import java.io.InputStream;

@ContentView(R.layout.activity_helper_acty)
public class HelperActy extends AbActivity {

    @ViewInject(R.id.wv_helper)
    WebView wv_helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  wv_helper.loadUrl("http://jingyan.baidu.com/article/ff411625b8921312e4823721.html");
        wv_helper.loadUrl("file:///android_asset/html/tips.htm");
    }
    public void back(View view){
        finish();
    }
}
