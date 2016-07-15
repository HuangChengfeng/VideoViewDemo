package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.Window;
import android.widget.VideoView;

public class MainActivity extends Activity {
    private String path = "http://devimages.apple.com/iphone/samples/bipbop/gear1/prog_index.m3u8";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        //监听button全屏
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a();
            }
        });
        //播放事件
        VideoView mvv = (VideoView) findViewById(R.id.videoView);
        mvv.setVideoPath(path);
        //控制条
//        mvv.setMediaController(new
//                MediaController(this)
//        );
        //获得焦点
        mvv.requestFocus();
        //播放开始
        mvv.start();
        //播放完成动作
        mvv.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                Acystart();
            }
        });
        findViewById(R.id.quanju).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Acystart();
            }
        });
    }

    @Nullable
    //横屏
    public void a() {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    //跳转页面
    public void Acystart() {
        startActivity(new Intent(this, WelconmeActivity.class));
    }
}
