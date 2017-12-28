package com.maryanto.dimas.udemy.demo5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void fade(View view) {
        ImageView fifa17 = findViewById(R.id.fifa17);
        fifa17.animate().alpha(0f).setDuration(5000);

        ImageView fifa18 = findViewById(R.id.fifa18);
        fifa18.animate().alpha(1f).setStartDelay(5000).setDuration(5000);

    }

    public void resetImage(View view) {
        ImageView fifa17 = findViewById(R.id.fifa17);
        fifa17.setAlpha(1f);

        ImageView fifa18 = findViewById(R.id.fifa18);
        fifa18.setAlpha(0f);
    }
}
