package com.example.mothupii_.project77;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OfflineLibraryContent extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline_library_content);

    }

    public void onClick2(View view)
    {
        Intent intent1 = new Intent(OfflineLibraryContent.this, Downloads.class);
        startActivity(intent1);
    }

    public void onClick3(View view)
    {
        Intent intent1 = new Intent(OfflineLibraryContent.this, Uploads.class);
        startActivity(intent1);
    }

}
