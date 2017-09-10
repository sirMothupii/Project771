package com.example.mothupii_.project77;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActiveSessionPicker extends AppCompatActivity {

    TextView curTutor = (TextView) findViewById(R.id.tutorText);
    TextView actStud = (TextView) findViewById(R.id.ActiveStudentsText);
    TextView timeSess = (TextView) findViewById(R.id.timeSessT);
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active_session_picker);
    }

    public void joinGroup(View view)
    {

    }
    public void nextSession(View view)
    {

        count = count + 1;
        curTutor.setText("Tutor" + count + "");
        actStud.setText("Active Students : " + count * 2);
        timeSess.setText("Time Session : " + " 12: " + count * 7/30  );
    }
    public void prevSession(View view)
    {
        count = count - 1;
        curTutor.setText("Tutor" + count + "");
        actStud.setText("Active Students : " + count * 2);
        timeSess.setText("Time Session : " + " 12: " + count * 7/30  );
    }

}
