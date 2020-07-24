package com.example.sharedpreferencepractices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SPActivity extends AppCompatActivity {

    private static final String SP_KEY = "content";
    SharedPreferences sharedPref;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp);

        sharedPref = this.getPreferences(Context.MODE_PRIVATE);

        editText = findViewById(R.id.content);
        editText.setText(sharedPref.getString(SP_KEY, ""));

        Button btn = findViewById(R.id.btn_submit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveToSharedPref();
            }
        });
    }

    private void saveToSharedPref() {
        String content = editText.getText().toString();
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(SP_KEY, content);
        editor.commit();
    }
}