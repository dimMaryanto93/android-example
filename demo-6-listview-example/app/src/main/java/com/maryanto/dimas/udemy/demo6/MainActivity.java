package com.maryanto.dimas.udemy.demo6;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.names);
        List<String> names = Arrays.asList("Dimas Maryanto", "Muhamad Yusuf", "Hadi");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        arrayAdapter.addAll(names);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Object itemAtPosition = adapterView.getItemAtPosition(position);
                Toast.makeText(
                        MainActivity.this,
                        "Item cliked at " + position + ", the value is " + itemAtPosition,
                        Toast.LENGTH_SHORT
                ).show();
            }
        });
    }
}
