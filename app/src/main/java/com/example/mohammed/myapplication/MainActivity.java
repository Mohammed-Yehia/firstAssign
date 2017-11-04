package com.example.mohammed.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String COUNT = "Count";
    private Button countBtn;
    private Button helloBtn;
    private TextView countView;
    private int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countBtn = (Button) findViewById(R.id.countBtn);
        helloBtn = (Button) findViewById(R.id.helloBtn);
        countView = (TextView) findViewById(R.id.countTv);


        countBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countView.setText(++count + "" );
            }
        });


        helloBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HelloAc.class);
                intent.putExtra(COUNT, count);
                startActivity(intent);
            }
        });

    }
}
