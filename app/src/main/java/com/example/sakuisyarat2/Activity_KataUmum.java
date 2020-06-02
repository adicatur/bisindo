package com.example.sakuisyarat2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;

public class Activity_KataUmum extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__kata_umum);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        RelativeLayout Asal ;
        RelativeLayout Baik ;
        RelativeLayout Iloveyou ;
        RelativeLayout Nama ;
        RelativeLayout Perkenalan ;
        RelativeLayout Rumah ;
        RelativeLayout Sakit ;
        RelativeLayout Samasama ;
        RelativeLayout Sehat ;
        RelativeLayout Terimakasih ;
        RelativeLayout Tidakbaik ;

        Asal = findViewById(R.id.Asal);
        Baik = findViewById(R.id.Baik);
        Iloveyou = findViewById(R.id.Iloveyoy);
        Nama = findViewById(R.id.Nama);
        Perkenalan = findViewById(R.id.Perkenalan);
        Rumah = findViewById(R.id.Rumah);
        Sakit = findViewById(R.id.Sakit);
        Samasama = findViewById(R.id.Samasama);
        Sehat = findViewById(R.id.Sehat);
        Terimakasih = findViewById(R.id.Terimakasih);
        Tidakbaik = findViewById(R.id.Tidakbaik);


        Asal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataUmum.this, Video_Asal.class));
            }
        });

        Baik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataUmum.this, Video_Baik.class));
            }
        });

        Iloveyou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataUmum.this, Video_Iloveyou.class));
            }
        });

        Nama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataUmum.this, Video_Nama.class));
            }
        });

        Perkenalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataUmum.this, Video_Perkenalan.class));
            }
        });

        Rumah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataUmum.this, Video_Rumah.class));
            }
        });

        Sakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataUmum.this, Video_Sakit.class));
            }
        });

        Samasama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataUmum.this, Video_Samasama.class));
            }
        });

        Sehat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataUmum.this, Video_Sehat.class));
            }
        });

        Terimakasih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataUmum.this, Video_Terimakasih.class));
            }
        });

        Tidakbaik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataUmum.this, Video_Tidakbaik.class));
            }
        });




    }
}
