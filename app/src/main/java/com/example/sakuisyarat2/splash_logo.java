package com.example.sakuisyarat2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splash_logo extends AppCompatActivity {

    private static int SPLASH_SCREEN = 600;

    //Variable
    Animation CoverAnim;
    ImageView image;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_logo);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        CoverAnim = AnimationUtils.loadAnimation(this, R.anim.coveranim);

        image = findViewById(R.id.splashGif);

        image.setAnimation(CoverAnim);

        new Handler(). postDelayed(new Runnable() {
            @Override
            public void run () {
                Intent ine = new Intent(splash_logo.this, Dashboard.class);
                startActivity(ine);
                finish();
            }
        }, 3000);

    }
}
