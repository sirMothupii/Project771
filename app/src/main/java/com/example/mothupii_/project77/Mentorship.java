package com.example.mothupii_.project77;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Mentorship extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mentorship);
    }

    public void onClick1(View view)
    {
        Intent intent1 = new Intent(this, ResponseToQuestions.class);
        startActivity(intent1);
    }
}
