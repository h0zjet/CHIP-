package com.example.evaluacin1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputSaldo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputSaldo = (EditText)findViewById(R.id.inputSaldo);


    }


    public void BotonActividad(View view){

        Intent intent = new Intent(this, MainActivity2.class);

        intent.putExtra( "saldo", inputSaldo.getText().toString());

        startActivity(intent);

        String a = inputSaldo.getText().toString();

        if ( Integer.parseInt(a) <= 5000){
        }

    }


}