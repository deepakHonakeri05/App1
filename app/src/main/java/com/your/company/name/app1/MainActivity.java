package com.your.company.name.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    TextView countTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countTextView = (TextView) findViewById(R.id.countTextView);;
    }

    @SuppressLint("ResourceAsColor")
    public void displayToastMessage(View V)
    {
        Toast.makeText(getApplicationContext(), "Hello there!", Toast.LENGTH_LONG).show();
        V.setBackgroundColor(R.color.colorPrimaryDark);
    }

    public void increaseCount(View V)
    {
        count++;
        countTextView.setText(count+"");
    }
}