package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.utils.Utils;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.tv);
        String txt2 = getIntent().getStringExtra("key2");
        if (TextUtils.isEmpty(txt2)) {
            tv.setText("您好，世界");
        } else {
            tv.setText(txt2);
        }

        MaterialButton btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent starter = new Intent(MainActivity.this, MainActivity2.class);
                starter.putExtra("key1", "我是传过来的参数");
                MainActivity.this.startActivity(starter);
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // 代码的方式设置布局参数
                TextView tv_color = findViewById(R.id.tv_color);
                ViewGroup.LayoutParams layoutParams = tv_color.getLayoutParams();
                layoutParams.width = Utils.dip2px(MainActivity.this, 400);
                tv_color.setLayoutParams(layoutParams);
            }
        }, 3000);

        // new Thread() {
        //     @Override
        //     public void run() {
        // try {
        //     Thread.sleep(3000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        // // 代码的方式设置布局参数
        // TextView tv_color = findViewById(R.id.tv_color);
        // ViewGroup.LayoutParams layoutParams = tv_color.getLayoutParams();
        // layoutParams.width = Utils.dip2px(MainActivity.this, 400);
        // tv_color.setLayoutParams(layoutParams);
        // }
        // }.start();

    }
}