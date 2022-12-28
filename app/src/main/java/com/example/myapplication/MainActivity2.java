package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String txt2 = getIntent().getStringExtra("key1");
        TextView tv2 = findViewById(R.id.tv2);
        tv2.setText(txt2);

        findViewById(R.id.btn2)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent starter = new Intent(MainActivity2.this, MainActivity.class);
                        starter.putExtra("key2", "我是Main2传入过来的数据");
                        MainActivity2.this.startActivity(starter);
                    }
                });
    }
}