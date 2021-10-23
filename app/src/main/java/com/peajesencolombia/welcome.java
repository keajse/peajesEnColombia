package com.peajesencolombia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        SharedPreferences preferencia = getSharedPreferences("datos", MODE_PRIVATE);

        //Capturar datos
        TextView usuario = (TextView) findViewById(R.id.textUsuario);
        TextView nombres = (TextView) findViewById(R.id.textNombres);
        TextView apellidos= (TextView) findViewById(R.id.textApellidos);
        TextView correo = (TextView) findViewById(R.id.textCorreo);

        usuario.setText(preferencia.getString("usuario",""));
        nombres.setText(preferencia.getString("nombres",""));
        apellidos.setText(preferencia.getString("apellidos",""));
        correo.setText(preferencia.getString("correo",""));
    }
}