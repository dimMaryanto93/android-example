package com.tabeldata.demo7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private SeekBar timesTableSeekBar;

    private ListView timesTableListView;

    public void generateTimesTable(Integer timesTable) {
        ArrayList<String> timesTableContent = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            timesTableContent.add(Integer.toString(i * timesTable));
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, timesTableContent);
        timesTableListView.setAdapter(arrayAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.timesTableListView = findViewById(R.id.timesTableListView);
        this.timesTableSeekBar = findViewById(R.id.timesTableSeekBar);
        this.timesTableSeekBar.setMax(20);
        this.timesTableSeekBar.setProgress(10);
        this.timesTableSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Log.i("value", String.format("values selected is %d", i));
                generateTimesTable(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}
