package com.example.apppreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;
import com.example.apppreguntas.utils.Config;

public class Resumen extends AppCompatActivity {

    TextView campo_datos;
    Config config;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);
        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);
        config = new Config(getApplicationContext());

        campo_datos = findViewById(R.id.campo_datos);
        campo_datos.setText(archivo.getString("nombres",""));
    }

    public void mostrarImagen(View vista){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("ApiPreguntas/mostrarImagen.php");

        ImageRequest solicitud = new ImageRequest(
                url,
                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap bitmap) {
                        // Set the image in the ImageView.

                    }
                },
                0, 0, null, // maxWidth, maxHeight, decodeConfig;
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        System.out.println("El servidor responde con un error:");
                        System.out.println(error.getMessage());
                    }
                });

        queue.add(solicitud);
    }
    public void cerrarSession(View vista){
        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);
        SharedPreferences.Editor editor = archivo.edit();
        editor.clear();
        editor.commit();

        Intent intencion = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intencion);
        finish();
    }

}