package com.maryanto.dimas.udemy.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signin(View view) {
        EditText usernameInput = findViewById(R.id.usernameInput);
        EditText passwordInput = findViewById(R.id.passwordInput);

        Toast.makeText(this, String.format("security: { username: %s, password: %s }",
                usernameInput.getText().toString(),
                passwordInput.getText().toString()
        ), Toast.LENGTH_SHORT).show();
    }
}
