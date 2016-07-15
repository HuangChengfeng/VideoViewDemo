package com.example.administrator.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

/**
 * Created by Administrator on 2016/7/14 0014.
 */
public class WelconmeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        new Thread(){
            @Override
            public void run() {
                SystemClock.sleep(2500);
                AcyStart();
                super.run();
            }
        }.start();
    }
    public void  AcyStart(){
        startActivity(new Intent(this,MainActivity.class));
    }
}
