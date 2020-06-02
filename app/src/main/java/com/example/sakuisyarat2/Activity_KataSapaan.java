package com.example.sakuisyarat2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;

public class Activity_KataSapaan extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__kata_sapaan);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        RelativeLayout Apakabar;
        RelativeLayout Assalamualaikum;
        RelativeLayout Hai;
        RelativeLayout Halo;
        RelativeLayout Waalaikumsalam;

        Apakabar = findViewById(R.id.Apakabar);
        Assalamualaikum = findViewById(R.id.Assalamualaikum);
        Hai = findViewById(R.id.Hai);
        Halo = findViewById(R.id.Halo);
        Waalaikumsalam = findViewById(R.id.Waalaikumsalam);

        Apakabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataSapaan.this, Video_Apakabar.class));
            }
        });

        Assalamualaikum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataSapaan.this, Video_Assalamualaikum.class));
            }
        });

        Hai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataSapaan.this, Video_Hai.class));
            }
        });

        Halo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataSapaan.this, Video_Halo.class));
            }
        });

        Waalaikumsalam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataSapaan.this, Video_Waalaikumsalam.class));
            }
        });




    }
}
