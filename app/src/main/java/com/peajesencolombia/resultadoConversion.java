package com.peajesencolombia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class resultadoConversion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_conversion);

        Intent intent = getIntent();
        int conversion = intent.getIntExtra("conversion", 0);

        TextView textView = findViewById(R.id.txtResultadoCon);

        String mensaje = "La cantidad en dolares es: " + conversion;

        textView.setText(mensaje);
    }
}