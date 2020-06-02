package com.example.sakuisyarat2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Activity_KataTanya extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__kata_tanya);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        RelativeLayout Apa ;
        RelativeLayout Bagaimana ;
        RelativeLayout Dimana ;
        RelativeLayout Kapan ;
        RelativeLayout Kenapa ;
        RelativeLayout Siapa ;

        Apa = findViewById(R.id.Apa);
        Bagaimana = findViewById(R.id.Bagaimana);
        Dimana = findViewById(R.id.Dimana);
        Kapan = findViewById(R.id.Kapan);
        Kenapa = findViewById(R.id.Kenapa);
        Siapa = findViewById(R.id.Siapa);


        Apa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataTanya.this, Video_Apa.class));

            }
        });

        Bagaimana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataTanya.this, Video_Bagaimana.class));
            }
        });

        Dimana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataTanya.this, Video_Dimana.class));
            }
        });

        Kapan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataTanya.this, Video_Kapan.class));
            }
        });

        Kenapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataTanya.this, Video_Kenapa.class));
            }
        });

        Siapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                startActivity(new Intent(Activity_KataTanya.this, Video_Siapa.class));
            }
        });



    }
}
