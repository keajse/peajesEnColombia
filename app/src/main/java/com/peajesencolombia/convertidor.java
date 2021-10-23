package com.peajesencolombia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class convertidor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convertidor);
    }
    public void convertidor (View view){
        EditText pesos = (EditText) findViewById(R.id.eTxtPesos);
        TextView dolares = (TextView) findViewById(R.id.txtDolares);

        int pes = Integer.valueOf(pesos.getText().toString());

        int convertidor = pes / 3763;

        dolares.setText(""+convertidor);
    }

    public void conver(View view){

        EditText pesos = (EditText) findViewById(R.id.eTxtPesos);

        if (pesos.equals("")) {
            return;
        }

        int pes = Integer.parseInt(pesos.getText().toString());
        int convertidor = pes / 3763;

        Intent intent = new Intent(this, resultadoConversion.class);

        intent.putExtra("conversion", convertidor);
        startActivity(intent);
    }
}