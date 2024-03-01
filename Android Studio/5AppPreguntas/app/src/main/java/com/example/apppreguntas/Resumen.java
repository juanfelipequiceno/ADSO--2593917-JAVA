package com.example.apppreguntas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.apppreguntas.utils.Config;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Resumen extends AppCompatActivity {
    TextView nombre_usuario;
    LinearLayout contenedor;

    Config config;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        //EXTRACION ETIQUETAS POR ID
        nombre_usuario = findViewById(R.id.nombre_usuario);
        config = new Config(getApplicationContext());
        contenedor = findViewById(R.id.contenedor_cuestionarios);

        //INTENCION PARA ACAMBIAR DE ACTIVITY
        Intent intencion = getIntent();

        //VARIABLE DE SESION
        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);
        String id_usuario = archivo.getString("id_usuario", null);

        nombre_usuario.setText(archivo.getString("nombres", ""));

        // CONSUMO GET PARA TRAER LOS CUESTIONARIOS
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("ApiPreguntas/getCuestionario.php");

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    boolean valorBooleano = jsonObject.getBoolean("status");
                    if (valorBooleano){
                        agregarCuestionario(jsonObject);
                        //String id_usuario = jsonObject.getJSONObject("usuario").getString("id_usuario");
                        //String nombres = jsonObject.getJSONObject("usuario").getString("nombres");

                        //cambiarActivity(id_usuario, nombres);
                    }else{
                        System.out.println("Error en el estado");
                    }

                } catch (JSONException e) {
                    System.out.println("El servidor POST responde con un error:");
                    System.out.println(e.getMessage());
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        }){
            protected Map<String, String> getParams(){
                Map<String, String> params = new HashMap<String, String>();
                params.put("id_usuario", id_usuario);
                return params;
            }
        };

        queue.add(solicitud);

        queue.add(solicitud);

    }

    public void cerrarSesion(View vista){
        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);
        SharedPreferences.Editor editor = archivo.edit();
        editor.clear();
        editor.commit();

        Intent intencion = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intencion);

        finish();

    }

    public void agregarCuestionario(JSONObject objeto){
        JSONArray arreglo = null;
        try {
            arreglo = objeto.getJSONArray("cuestionarios");

            for (int i = 0; i < arreglo.length(); i++) {
                JSONObject cuestionario = arreglo.getJSONObject(i);

                TextView textView = new TextView(getApplicationContext());
                // Concatenar los datos en una cadena

                String texto = "ID: " + cuestionario.getString("id") + "\n" +
                        "CANT PREGUNTAS: " + cuestionario.getString("cant_preguntas") + "\n" +
                        "CANT OK: " + cuestionario.getString("cant_ok") + "\n" +
                        "CANT ERROR: " + cuestionario.getString("cant_error") + "\n" +
                        "FECHA DE INICIO: " + cuestionario.getString("fecha_inicio") + "\n" +
                        "FECHA DE FIN: " + cuestionario.getString("fecha_fin");
                int color = ContextCompat.getColor(this, R.color.verde_claro);
                textView.setBackgroundColor(color);
                textView.append(texto);
                contenedor.addView(textView);

            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}