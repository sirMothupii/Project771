package com.example.mothupii_.project77;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AskAPro extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_apro);
    }

    public void onClick8(View view)
    {
        Intent intent1 = new Intent(AskAPro.this, ResponseToQuestions.class);
        startActivity(intent1);
    }

    public void onClick7(View view)
    {
        Intent intent1 = new Intent(AskAPro.this, StudyInspiration.class);
        startActivity(intent1);
    }


}
