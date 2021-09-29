package com.example.evaluacin1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView labelSaldo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        labelSaldo = findViewById(R.id.labelSaldo);

        String newText = getIntent().getStringExtra("saldo");

        labelSaldo.setText("Su saldo es: " + newText);


    }
}