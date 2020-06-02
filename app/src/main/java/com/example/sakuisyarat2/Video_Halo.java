package com.example.sakuisyarat2;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video_Halo extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video__halo);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        VideoView videoView = findViewById(R.id.video_Halo);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.halo;
        Uri uri49 = Uri.parse(videoPath);
        videoView.setVideoURI(uri49);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);


    }
}
