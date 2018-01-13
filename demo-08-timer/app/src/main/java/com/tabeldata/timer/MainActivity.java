package com.tabeldata.timer;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000l, 1000l){

            /**
             * dijalakan setiap detik
             * @param l
             */
            @Override
            public void onTick(long l) {
                Log.i("timer", String.format("telah berjalan selama %d detik", l));
            }

            /**
             * akan berjalan selama 10 detik
             */
            @Override
            public void onFinish() {
                Log.i("timer", "scheduler telah selesai!");
            }
        }.start();
    }
}
