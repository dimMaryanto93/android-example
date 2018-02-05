package com.maryanto.dimas.udemy.demo4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText textRupiah = findViewById(R.id.rupiahText);
    }

    public void convertToIDR(View view) {
        EditText textDolar = findViewById(R.id.dolarText);
        EditText textRupiah = findViewById(R.id.rupiahText);

        Integer dolar = Integer.valueOf(textDolar.getText().toString());
        BigDecimal nilarRupiah = new BigDecimal("14285.71").multiply(new BigDecimal(dolar));
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));


        textRupiah.setText(numberFormat.format(nilarRupiah));
    }
}
