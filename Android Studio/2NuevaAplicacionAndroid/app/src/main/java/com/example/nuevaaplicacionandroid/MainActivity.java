package com.example.nuevaaplicacionandroid;


import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    TextView etq_respuestaTexView;

    EditText campo_nombre, campo_apellido, campo_telefono, campo_direccion, campo_correo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etq_respuestaTexView = findViewById(R.id.etq_respuesta);

        campo_nombre = findViewById(R.id.campo_nombre);
        campo_apellido = findViewById(R.id.campo_apellido);
        campo_telefono= findViewById(R.id.campo_telefono);
        campo_direccion = findViewById(R.id.campo_direccion);
        campo_correo = findViewById(R.id.campo_correo);



    }

    public void imprimirSaludo(View vista){

        etq_respuestaTexView.setText("");

        String nombre = campo_nombre.getText().toString();
        String apellido = campo_apellido.getText().toString();
        String telefono = campo_telefono.getText().toString();
        String direccion = campo_direccion.getText().toString();
        String correo = campo_correo.getText().toString();


        etq_respuestaTexView.append("Nombre: "+nombre+"\n") ;
        etq_respuestaTexView.append("Apellido: "+apellido+"\n");
        etq_respuestaTexView.append("Telefono: "+telefono+"\n");
        etq_respuestaTexView.append("Direccion: "+direccion+"\n");
        etq_respuestaTexView.append("Correo: "+correo+"\n");


        // codigo para mandar los datos a la segunda Actividad
        Intent intencion =  new Intent(getApplicationContext(), SegundaActividad.class);
        intencion.putExtra("Nombre", nombre);
        intencion.putExtra("Apilledo", apellido);
        intencion.putExtra("Telefono", telefono);
        intencion.putExtra("Direccion", direccion);
        intencion.putExtra("Correo", correo);
        startActivity(intencion);


    }

}