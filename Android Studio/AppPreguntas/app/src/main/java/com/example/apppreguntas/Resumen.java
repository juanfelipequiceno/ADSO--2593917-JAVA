package com.example.apppreguntas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

import kotlin.reflect.KFunction;

public class Resumen extends AppCompatActivity {
    TextView nombreUsuario;
    LinearLayout contenedor;

    Config config;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        //EXTRACION ETIQUETAS POR ID
        nombreUsuario = findViewById(R.id.nombreUsuario);
        config = new Config(getApplicationContext());
        contenedor = findViewById(R.id.contenedorCuestionarios);

        //INTENCION PARA ACAMBIAR DE ACTIVITY
        Intent intencion = getIntent();

        //VARIABLE DE SESION
        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);
        String id_usuario = archivo.getString("id_usuario", null);

        nombreUsuario.setText(archivo.getString("nombres", ""));

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
                String id = cuestionario.getString("id");
                String fecha_inicio = cuestionario.getString("fecha_inicio");
                String cant_preguntas = cuestionario.getString("cant_preguntas");
                TextView textView = new TextView(getApplicationContext());

                String texto = "ID: " + cuestionario.getString("id") + "\n" +
                        "CANT PREGUNTAS: " + cuestionario.getString("cant_preguntas") + "\n" +
                        "CANT OK: " + cuestionario.getString("cant_ok") + "\n" +
                        "CANT ERROR: " + cuestionario.getString("cant_error") + "\n" +
                        "FECHA DE INICIO: " + cuestionario.getString("fecha_inicio") + "\n" +
                        "FECHA DE FIN: " + cuestionario.getString("fecha_fin");

                // diseño para el TextView
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                layoutParams.setMargins(0, 20, 0, 20);

                textView.setText(texto);
                textView.setLayoutParams(layoutParams);

                int color = ContextCompat.getColor(this, R.color.verde_claro);
                textView.setBackgroundColor(color);

                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        detalleCuestionario(id, fecha_inicio, cant_preguntas);
                    }
                });

                contenedor.addView(textView);
            }






        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public void detalleCuestionario(String id, String fecha_inicio, String cant_preguntas){
        Intent intencion = new Intent(getApplicationContext(), DetalleCuestionario.class);
        intencion.putExtra("id",id);
        intencion.putExtra("fecha_inicio",fecha_inicio);
        intencion.putExtra("cant_preguntas",cant_preguntas);
        startActivity(intencion);

        finish();
    }

    public void CrearCuestionario(View view) {
        Intent intencion = new Intent(getApplicationContext(), CrearCuestionario.class);
        startActivity(intencion);

        finish();
    }
}