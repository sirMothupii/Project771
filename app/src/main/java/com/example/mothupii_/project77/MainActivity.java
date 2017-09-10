package com.example.mothupii_.project77;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view)
    {
        Intent intent1 = new Intent(MainActivity.this, OfflineLibrary.class);
        startActivity(intent1);
    }

    public void onClick4(View view)
    {
        Intent intent1 = new Intent(MainActivity.this, Mentorship.class);
        startActivity(intent1);
    }
}
