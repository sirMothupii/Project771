package com.example.mothupii_.project77;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoPlayer extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);
    }

    public void playVideo(View view)
    {


        VideoView vView= (VideoView) findViewById(R.id.videoView2);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(vView);
        Uri uri = Uri.parse("https://www.mobango.com/download-abc-poem-videos/?cid=1971215&ck=listingdnld&forceDownload=1");
        vView.setVideoURI(uri);
        vView.requestFocus();
        vView.start();

    }
}
