package com.example.jh.jpushtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.jpush.android.api.JPushInterface;

/**
 * 这次不下载官网快速集成的demo test，因为下载的话等于这个key被用了。
 *
 * appkey:  8bfc8d7c5ca6cec93ec82b5f
 *
 * 经过测试已经可以连通极光的官网，通知与自定义消息均可以收到，测试ok
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
