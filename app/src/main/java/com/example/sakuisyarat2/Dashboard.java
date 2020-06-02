package com.example.sakuisyarat2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.example.sakuisyarat2.Control.ModalAdapter1;
import com.example.sakuisyarat2.Control.Model;

import java.util.ArrayList;
import java.util.List;

public class Dashboard extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener{


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // background color tuk tempat kata tanya #D2C2B6

        TextView btn = (TextView) findViewById(R.id.btn_about);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick ( View v ) {
                PopupMenu pop = new PopupMenu(Dashboard.this, v);
                pop.setOnMenuItemClickListener(Dashboard.this);
                pop.inflate(R.menu.ttg1);
                pop.show();
            }
        });

        ////////////////////////////////////////////////////////////////////////////////////

        ViewPager2 seviewPager2 = findViewById(R.id.geseer_lis);
        List<Model> modelList = new ArrayList<>();

      //  https://i.ibb.co/YPpKGBh/aku2.png
      //  https://i.ibb.co/wRKrcLj/apa2.png
      //  https://i.ibb.co/313WVK3/apakabar2.png
      //  https://i.ibb.co/HCkgxCn/asal2.png
      //  https://i.ibb.co/7N9JgN3/assalamualaikum2.png

        //https://i.ibb.co/XWn2LNt/image-Assalamualaikum.png
        //https://i.ibb.co/sbr2t2B/image-Apakabar.png
        //https://i.ibb.co/Snt8w7B/image-Asal.png
        //https://i.ibb.co/h9wwHGq/imageAku.png
        //https://i.ibb.co/PZzFGzh/imageApa.png


        Model modelee = new Model();
        modelee.foto = "https://i.ibb.co/7N9JgN3/assalamualaikum2.png" ;
        modelee.tulis = "ABJAD" ;
        modelee.keterangan =  "Silahkan yang dibuka pada media pembelajaran" ;
        modelee.starRating = 26.f;
        modelList.add(modelee);

        Model modelee1 = new Model();
        modelee1.foto= "https://i.ibb.co/313WVK3/apakabar2.png" ;
        modelee1.tulis = "Kata Tanya" ;
        modelee1.keterangan =  "Silahkan yang dibuka pada media pembelajaran" ;
        modelee1.starRating = 6f;
        modelList.add(modelee1);

        Model modelee2 = new Model();
        modelee2.foto = "https://i.ibb.co/HCkgxCn/asal2.png" ;
        modelee2.tulis = "Kata Ganti Orang" ;
        modelee2.keterangan =  "Silahkan yang dibuka pada media pembelajaran" ;
        modelee2.starRating = 6f;
        modelList.add(modelee2);

        Model modelee3 = new Model();
        modelee3.foto = "https://i.ibb.co/YPpKGBh/aku2.png" ;
        modelee3.tulis = "Kata Umum" ;
        modelee3.keterangan =  "Silahkan yang dibuka pada media pembelajaran" ;
        modelee3.starRating = 11f;
        modelList.add(modelee3);

        Model modelee4 = new Model();
        modelee4.foto = "https://i.ibb.co/wRKrcLj/apa2.png" ;
        modelee4.tulis = "Kata Sapaan" ;
        modelee4.keterangan =  "Silahkan yang dibuka pada media pembelajaran" ;
        modelee4.starRating = 5f;
        modelList.add(modelee4);

        seviewPager2.setAdapter(new ModalAdapter1(modelList));

        seviewPager2.setClipChildren(false);
        seviewPager2.setClipToPadding(false);
        seviewPager2.setOffscreenPageLimit(5);
        seviewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_NEVER);

        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(1));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage ( @NonNull View page , float position ) {
                float r = 1 - Math.abs(position);
                page.setScaleY(0.95f + r * 0.08f);
            }
        });

        seviewPager2.setPageTransformer(compositePageTransformer);


        ///////////////////////////////////////////////////////////////////////////////////////////
    }

    @Override
    public boolean onMenuItemClick ( MenuItem item ) {
        switch (item.getItemId()){
            case R.id.opt:
                startActivity(new Intent(this, tentang.class));
            default:
            return false;
        }
    }

}
