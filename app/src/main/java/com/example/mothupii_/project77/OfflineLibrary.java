package com.example.mothupii_.project77;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OfflineLibrary extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline_library);
    }

    public void onClick(View view)
    {
        Intent intent1 = new Intent(this, OfflineLibraryContent.class);
        startActivity(intent1);
    }

    public void onClick01(View view)
    {
        Intent intent1 = new Intent(this, VideoPlayer.class);
        startActivity(intent1);
    }
}
