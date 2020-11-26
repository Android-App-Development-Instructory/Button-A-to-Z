package com.alaminkarno.buttonatoz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView;
    Button button,button01,button02;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.buttonID);
        button01 = findViewById(R.id.buttonID1);
        button02 = findViewById(R.id.buttonID2);

        button01.setOnClickListener(this);
        button02.setOnClickListener(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                textView.setText("Button Clicked "+count+" Times.");
            }
        });
    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.buttonID1){
            textView.setText("Login Sucessful.");
        }
        if(view.getId() == R.id.buttonID2){
            textView.setText("Logout");
        }
    }

    public void xmlbutton(View view) {

        textView.setText("XML Button Clicked");
    }
}