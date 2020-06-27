package com.zubairmuddasir12fyp.work_at_home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class guest_seeallcat extends AppCompatActivity {
    LinearLayout l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, lv11, lv12, lv13, lv14, lv15, lv16, lv17, lv18, lv19, lv20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_seeallcat);
        install();
    }

    public void install() {
        l1 = findViewById(R.id.lvv);
        l2 = findViewById(R.id.lvv1);
        l3 = findViewById(R.id.lvv2);
        l4 = findViewById(R.id.lvv3);
        l5 = findViewById(R.id.lvv4);
        l6 = findViewById(R.id.lvv5);
        l7 = findViewById(R.id.lvv6);
        l8 = findViewById(R.id.lvv7);
        l9 = findViewById(R.id.lvv8);
        l10 = findViewById(R.id.lvv9);
        lv11 = findViewById(R.id.lvv10);
        lv12 = findViewById(R.id.lvv11);
        lv13 = findViewById(R.id.lvv12);
        lv14 = findViewById(R.id.lvv13);
        lv15 = findViewById(R.id.lvv14);
        lv16 = findViewById(R.id.lvv15);
        lv17 = findViewById(R.id.lvv16);
        lv18 = findViewById(R.id.lvv17);
        lv19 = findViewById(R.id.lvv18);
        lv20 = findViewById(R.id.lvv19);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guest_seeallcat.this, guest_gig.class);
                intent.putExtra("full", getString(R.string.logod));
                startActivity(intent);
            }
        });
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guest_seeallcat.this, guest_gig.class);
                intent.putExtra("full", getString(R.string.logoA));
                startActivity(intent);
            }
        });
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guest_seeallcat.this, guest_gig.class);
                intent.putExtra("full", getString(R.string.busc));
                startActivity(intent);
            }
        });
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guest_seeallcat.this, guest_gig.class);
                intent.putExtra("full", getString(R.string.traf));
                startActivity(intent);
            }
        });
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guest_seeallcat.this, guest_gig.class);
                intent.putExtra("full", getString(R.string.soc));
                startActivity(intent);
            }
        });
        l6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guest_seeallcat.this, guest_gig.class);
                intent.putExtra("full", getString(R.string.tshir));
                startActivity(intent);
            }
        });
        l7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guest_seeallcat.this, guest_gig.class);
                intent.putExtra("full", getString(R.string.voice));
                startActivity(intent);
            }
        });
        l8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guest_seeallcat.this, guest_gig.class);
                intent.putExtra("full", getString(R.string.seo));
                startActivity(intent);
            }
        });
        l9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guest_seeallcat.this, guest_gig.class);
                intent.putExtra("full", getString(R.string.photo));
                startActivity(intent);
            }
        });
        l10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guest_seeallcat.this, guest_gig.class);
                intent.putExtra("full", getString(R.string.artic));
                startActivity(intent);
            }
        });
        lv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guest_seeallcat.this, guest_gig.class);
                intent.putExtra("full", getString(R.string.word));
                startActivity(intent);
            }
        });
        lv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guest_seeallcat.this, guest_gig.class);
                intent.putExtra("full", getString(R.string.ill));
                startActivity(intent);
            }
        });

        lv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guest_seeallcat.this, guest_gig.class);
                intent.putExtra("full", getString(R.string.mob));
                startActivity(intent);
            }
        });
        lv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guest_seeallcat.this, guest_gig.class);
                intent.putExtra("full", getString(R.string.cra));
                startActivity(intent);
            }
        });
        lv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guest_seeallcat.this, guest_gig.class);
                intent.putExtra("full", getString(R.string.websd));
                startActivity(intent);
            }
        });
        lv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guest_seeallcat.this, guest_gig.class);
                intent.putExtra("full", getString(R.string.inte));
                startActivity(intent);
            }
        });
        lv17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guest_seeallcat.this, guest_gig.class);
                intent.putExtra("full", getString(R.string.res));
                startActivity(intent);
            }
        });
        lv18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guest_seeallcat.this, guest_gig.class);
                intent.putExtra("full", getString(R.string.vid));
                startActivity(intent);
            }
        });
        lv19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guest_seeallcat.this, guest_gig.class);
                intent.putExtra("full", getString(R.string.mus));
                startActivity(intent);
            }
        });
        lv20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(guest_seeallcat.this, guest_gig.class);
                intent.putExtra("full", getString(R.string.other));
                startActivity(intent);
            }
        });


    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(guest_seeallcat.this, Guest_Home.class));
        Animatoo.animateSlideLeft(this);
    }
}