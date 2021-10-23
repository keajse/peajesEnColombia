package com.peajesencolombia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class suma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
    }

    public void Suma (View view){
        EditText n1 = (EditText) findViewById(R.id.txtNumUno);
        EditText n2 = (EditText) findViewById(R.id.txtNumDos);

        TextView resultado = (TextView) findViewById(R.id.txtResultado);

        int num1 = Integer.valueOf(n1.getText().toString());
        int num2 = Integer.valueOf(n2.getText().toString());

        int suma = num1 + num2;

        resultado.setText(""+suma);


    }
}