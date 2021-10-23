package com.peajesencolombia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public void registro(View view){
        Intent welcome = new Intent(this, welcome.class);


        //Capturar los datos
        EditText usuario = (EditText) findViewById(R.id.txtUsuario);
        EditText nombres = (EditText) findViewById(R.id.txtNombres);
        EditText correo = (EditText) findViewById(R.id.txtCorreo);
        EditText apellidos = (EditText) findViewById(R.id.txtApellidos);

        //Convertir a String
        String usu = usuario.getText().toString();
        String nom = nombres.getText().toString();
        String ape = apellidos.getText().toString();
        String email = correo.getText().toString();

        //Compartir valores globales en el aplicación.
        SharedPreferences preferencia = getSharedPreferences("datos", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferencia.edit();

        editor.putString("usuario", usu);
        editor.putString("nombres", nom);
        editor.putString("apellidos", ape);
        editor.putString("correo", email);

        editor.commit();
        finish();


        //Redireccionar a la vista Welcome
        startActivity(welcome);

    }
}