package com.example.sakuisyarat2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.VideoView;

public class Activity_Abjad extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__abjad);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

       CardView A = findViewById(R.id.A);
       A.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
               startActivity(new Intent(Activity_Abjad.this, Video_A.class));
           }
       });

       CardView B = findViewById(R.id.B);
       B.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
               startActivity(new Intent(Activity_Abjad.this, Video_B.class));
           }
       });

       CardView C = findViewById(R.id.C);
       C.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
               startActivity(new Intent(Activity_Abjad.this, Video_C.class));
           }
       });


       CardView D = findViewById(R.id.D);
       D.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
               startActivity(new Intent(Activity_Abjad.this, Video_D.class));
           }
       });


       CardView E = findViewById(R.id.E);
       E.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
               startActivity(new Intent(Activity_Abjad.this, Video_E.class));
           }
       });


       CardView F = findViewById(R.id.F);
       F.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
               startActivity(new Intent(Activity_Abjad.this, Video_F.class));
           }
       });


       CardView G = findViewById(R.id.G);
       G.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
               startActivity(new Intent(Activity_Abjad.this, Video_G.class));
           }
       });


       CardView H = findViewById(R.id.H);
       H.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
               startActivity(new Intent(Activity_Abjad.this, Video_H.class));
           }
       });


       CardView I = findViewById(R.id.I);
       I.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
               startActivity(new Intent(Activity_Abjad.this, Video_I.class));
           }
       });

       CardView J = findViewById(R.id.J);
       J.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
               startActivity(new Intent(Activity_Abjad.this, Video_J.class));
           }
       });

       CardView K =findViewById(R.id.K);
       K.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
               startActivity(new Intent(Activity_Abjad.this, Video_K.class));
           }
       });

       CardView L = findViewById(R.id.L);
       L.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
               startActivity(new Intent(Activity_Abjad.this, Video_L.class));
           }
       });

       CardView M = findViewById(R.id.M);
       M.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
               startActivity(new Intent(Activity_Abjad.this, Video_M.class));

           }
       });

       CardView N = findViewById(R.id.N);
       N.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
               startActivity(new Intent(Activity_Abjad.this, Video_N.class));

           }
       });

       CardView O = findViewById(R.id.O);
       O.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
                startActivity(new Intent(Activity_Abjad.this, Video_O.class));
           }
       });

       CardView P = findViewById(R.id.P);
       P.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
               startActivity(new Intent(Activity_Abjad.this, Video_P.class));
           }
       });

       CardView Q = findViewById(R.id.Q);
       Q.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
                startActivity(new Intent(Activity_Abjad.this, Video_Q.class));
           }
       });


       CardView Rr = findViewById(R.id.R);
       Rr.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
                startActivity(new Intent(Activity_Abjad.this, Video_R.class));
           }
       });


       CardView S = findViewById(R.id.S);
       S.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
                startActivity(new Intent(Activity_Abjad.this, Video_S.class));
           }
       });


       CardView T = findViewById(R.id.T);
       T.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
                startActivity(new Intent(Activity_Abjad.this, Video_T.class));
           }
       });


       CardView U = findViewById(R.id.U);
       U.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
                startActivity(new Intent(Activity_Abjad.this, Video_U.class));
           }
       });


       CardView V = findViewById(R.id.V);
       V.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
                startActivity(new Intent(Activity_Abjad.this, Video_V.class));
           }
       });

       CardView W =findViewById(R.id.W);
       W.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
                startActivity(new Intent(Activity_Abjad.this, Video_W.class));
           }
       });

       CardView X = findViewById(R.id.X);
       X.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
               startActivity(new Intent(Activity_Abjad.this, Video_X.class));
           }
       });


       CardView Y = findViewById(R.id.Y);
       Y.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
               startActivity(new Intent(Activity_Abjad.this, Video_Y.class));
           }
       });

       CardView Z = findViewById(R.id.Z);
       Z.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick ( View v ) {
                startActivity(new Intent(Activity_Abjad.this, Video_Z.class));
           }
       });


    }
}
