package com.zubairmuddasir12fyp.work_at_home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class open_news extends AppCompatActivity {
    TextView tv, realdes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_news);
        tv = findViewById(R.id.tv);
        realdes = findViewById(R.id.desreal);
        String de = getIntent().getStringExtra("userdes");
        String day = getIntent().getStringExtra("usertime");
        tv.setText(de);
        realdes.setText(day);
    }

    public void back(View view) {
        onBackPressed();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(open_news.this, HomeActivity2.class);

        startActivity(intent);

    }
}