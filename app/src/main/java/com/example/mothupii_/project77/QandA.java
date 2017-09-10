package com.example.mothupii_.project77;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class QandA extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qand);
    }

    public void onClick001(View view)
    {
        Intent intent1 = new Intent(QandA.this, AskAPro.class);
        startActivity(intent1);
        Toast.makeText(this, " Thanks ", Toast.LENGTH_LONG).show();
    }

    public void onClick002(View view)
    {
        Intent intent1 = new Intent(QandA.this, AskAPro.class);
        startActivity(intent1);
        Toast.makeText(this, " Thanks For your feedback we will make sure we improve our service ", Toast.LENGTH_LONG).show();
    }
}
