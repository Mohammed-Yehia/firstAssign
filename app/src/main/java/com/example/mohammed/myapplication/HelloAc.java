package com.example.mohammed.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloAc extends AppCompatActivity {
    private TextView countView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        countView = (TextView) findViewById(R.id.textView2);

        Intent intent = getIntent();
        int count = intent.getIntExtra(MainActivity.COUNT, 0);

        countView.setText(count + "");
    }
}
