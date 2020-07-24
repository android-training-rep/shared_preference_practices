package com.example.sharedpreferencepractices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toSpBtn = findViewById(R.id.btn_to_sp);
        toSpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toSpPage();
            }
        });
    }

    private void toSpPage() {
        Intent intent = new Intent(this, SPActivity.class);
        startActivity(intent);
    }
}