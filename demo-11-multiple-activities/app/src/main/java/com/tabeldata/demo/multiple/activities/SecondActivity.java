package com.tabeldata.demo.multiple.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText textUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        this.textUsername = findViewById(R.id.usernameText);

        Intent intent = getIntent();
        String usernameValue = intent.getStringExtra("username");
        this.textUsername.setText(usernameValue);
    }
}
