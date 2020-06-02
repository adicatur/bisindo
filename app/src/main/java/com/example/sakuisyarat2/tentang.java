package com.example.sakuisyarat2;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.WindowManager;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

import java.util.Objects;

public class tentang extends AppCompatActivity {


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);


        Toolbar teeel = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(teeel);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        TextView te = (TextView) findViewById(R.id.nele);

        te.setMovementMethod(LinkMovementMethod.getInstance());




    }
}
