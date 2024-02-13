
package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText campo_id;
    EditText campo_nombre;
    EditText campo_correo;
    EditText btn_registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campo_id = findViewById(R.id.campo_id);
        campo_nombre = findViewById(R.id.campo_nombre);
        campo_correo = findViewById(R.id.campo_correo);
        btn_registrar = findViewById(R.id.add);
    }

    public void registrarPersona(View vista){
        String id = campo_id.getText().toString();
        String nombre = campo_nombre.getText().toString();
        String correo = campo_correo.getText().toString();
        Intent intencion = new Intent(getApplicationContext(), SegundaActividad.class);
        startActivity(intencion);
        finish();
    }
}

