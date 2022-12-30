package com.example.chapter03;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TextColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_color);

        TextView tv_code_sys = findViewById(R.id.tv_code_sys);

        tv_code_sys.setTextColor(Color.GREEN);

    }
}