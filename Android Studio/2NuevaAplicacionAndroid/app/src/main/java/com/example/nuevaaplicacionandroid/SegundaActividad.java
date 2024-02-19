package com.example.nuevaaplicacionandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaActividad extends AppCompatActivity {
    TextView campo_datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        campo_datos = findViewById(R.id.campo_datos);
        campo_datos.setText("");

        Intent intencion = getIntent();
        Bundle datos = intencion.getExtras();

        // codigo para mandar a llamar los datos de la MainActivity estar bien escrito como en el otro lado

        String nombre = datos.getString("Nombre");
        String apellido = datos.getString("Apellido");
        String telefono = datos.getString("Telefono");
        String direccion = datos.getString("Direccion");
        String correo = datos.getString("Correo");


        campo_datos.append("Nombre: "+nombre+"\n"); ;
        campo_datos.append("Apellido: "+apellido+"\n");
        campo_datos.append("Telefono: "+telefono+"\n");
        campo_datos.append("Direccion: "+direccion+"\n");
        campo_datos.append("Correo: "+correo+"\n");

    }
}