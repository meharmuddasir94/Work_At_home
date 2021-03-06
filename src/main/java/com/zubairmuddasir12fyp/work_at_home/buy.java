package com.zubairmuddasir12fyp.work_at_home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class buy extends AppCompatActivity {
    TextView dayreal, dayreal1, dayreal2, realcat, describ, tok1;
    RadioButton radios;
    RadioGroup radioGroup;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        dayreal = findViewById(R.id.dayreal);
        String budget = getIntent().getStringExtra("money");
        dayreal.setText(budget);
        String tok = getIntent().getStringExtra("usertok");
        tok1 = findViewById(R.id.tok1);
        tok1.setText(tok);
        describ = findViewById(R.id.describe);
        radioGroup = findViewById(R.id.radio);
        String des = getIntent().getStringExtra("descri");
        describ.setText(des);
        dayreal1 = findViewById(R.id.dayreal1);
        dayreal2 = findViewById(R.id.dayreal2);

        String day = getIntent().getStringExtra("delivery");
        dayreal2.setText(day);
        realcat = findViewById(R.id.catreal);
        int s = Integer.parseInt(realcat.getText().toString());
        int s2 = Integer.parseInt(dayreal.getText().toString());
        btn = findViewById(R.id.btn2);
        int sum = s + s2;
        dayreal1.setText(String.valueOf(sum));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioID = radioGroup.getCheckedRadioButtonId();
                radios = findViewById(radioID);
                String ch = radios.getText().toString();
                if (radios.getText().toString().equals("one")) {
                    String tukk = tok1.getText().toString();
                    Intent intent = new Intent(buy.this, creditcard.class);
                    intent.putExtra("usertok", tukk);
                    startActivity(intent);

                }
                if (radios.getText().toString().equals("two")) {
                    Toast.makeText(buy.this, "Sorry this Option  Service is not Avaliable in your Region", Toast.LENGTH_SHORT).show();
                }

                if (radios.getText().toString().equals("three")) {
                    String tukk = tok1.getText().toString();
                    Intent intent = new Intent(buy.this, GooglePay.class);
                    intent.putExtra("usertok", tukk);
                    startActivity(intent);
                }
            }

        });
    }

    public void checkButton(View v) {
        int radioID = radioGroup.getCheckedRadioButtonId();
        radios = findViewById(radioID);

    }

    public void back(View view) {
        onBackPressed();
    }
}