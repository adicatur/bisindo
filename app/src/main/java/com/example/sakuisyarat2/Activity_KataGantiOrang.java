package com.example.sakuisyarat2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;

public class Activity_KataGantiOrang extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__kata_ganti_orang);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        RelativeLayout Aku;
        RelativeLayout Dia;
        RelativeLayout Kami;
        RelativeLayout Kamu;
        RelativeLayout Kita;
        RelativeLayout Mereka;

        Aku = findViewById(R.id.Aku);
        Dia = findViewById(R.id.Dia);
        Kami = findViewById(R.id.Kami);
        Kamu = findViewById(R.id.Kamu);
        Kita = findViewById(R.id.Kita);
        Mereka = findViewById(R.id.Mereka);



        Aku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataGantiOrang.this, Video_Aku.class));
            }
        });

        Dia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataGantiOrang.this, Video_Dia.class));
            }
        });

        Kami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataGantiOrang.this, Video_Kami.class));
            }
        });

        Kamu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataGantiOrang.this, Video_Kamu.class));
            }
        });

        Kita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataGantiOrang.this, Video_Kita.class));
            }
        });

        Mereka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataGantiOrang.this, Video_Mereka.class));
            }
        });

    }
}
