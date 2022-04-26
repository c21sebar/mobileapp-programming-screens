package com.example.screens;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    Button mySecondButton;
    TextView secondTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        mySecondButton = findViewById(R.id.SecondActivityButton);
        secondTextView = findViewById(R.id.SecondActivityTextView);
        final String name = getIntent().getExtras().getString("name");
        secondTextView.setText(name);
        mySecondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBackToMain();
            }
        });
    }
    void goBackToMain(){
        finish();
    }
}
