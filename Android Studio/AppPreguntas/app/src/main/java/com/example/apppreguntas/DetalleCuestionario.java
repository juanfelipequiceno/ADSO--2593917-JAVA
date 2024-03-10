package com.example.apppreguntas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.apppreguntas.utils.Config;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DetalleCuestionario extends AppCompatActivity {

    TextView nombreUsuario;
    TextView fechaInicio;
    TextView cantPreguntas;
    TextView correctas;
    TextView incorrectas;
    LinearLayout contenedor;
    Config config;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_cuestionario);

        nombreUsuario = findViewById(R.id.nombreUsuario);
        fechaInicio = findViewById(R.id.fechaInicio);
        cantPreguntas = findViewById(R.id.preguntas);
        correctas = findViewById(R.id.correctas);
        incorrectas = findViewById(R.id.incorrectas);
        contenedor = findViewById(R.id.layoutPrincipal);
        config = new Config(getApplicationContext());

        Intent intent = getIntent();
        //VARIABLE DE SESION
        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);
        String id_usuario = archivo.getString("id_usuario", null);

        nombreUsuario.setText(archivo.getString("nombres", ""));
        String id = intent.getStringExtra("id");
        String fechaInicio= intent.getStringExtra("fecha_inicio");
        String cantPreguntas = intent.getStringExtra("cant_preguntas");

        consumoPost(id, fechaInicio, cantPreguntas);
    }


    public void consumoPost(String id, String fechaInicio, String cantPreguntas){

        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("ApiPreguntas/getRespuesta.php");

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    boolean valorBooleano = jsonObject.getBoolean("status");
                    if (valorBooleano){
                        imprimirDatos(jsonObject, fechaInicio);
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
                params.put("id_cuestionario", id);
                return params;
            }
        };

        queue.add(solicitud);
    }

    public void imprimirDatos(JSONObject objeto, String fecha_inicio){
        this.fechaInicio.setText(fecha_inicio);
        int contCantPreguntas = 0;
        int contOk = 0;
        int contError = 0;

        JSONArray arreglo = null;
        try {

            JSONArray respuestasArray = objeto.getJSONArray("respuestas");
            for (int i = 0; i < respuestasArray.length(); i++) {

                JSONObject respuesta = respuestasArray.getJSONObject(i);
                JSONObject pregunta = respuesta.getJSONObject("pregunta");
                int id_correcta = pregunta.getInt("id_correcta");
                int respuesta_dada = pregunta.getInt("respuesta");
                JSONArray opcionesArray = respuesta.getJSONArray("opciones");
                String estado = pregunta.getString("estado");
                String descripcion = pregunta.getString("descripcion");


                if (estado.equals("OK")){
                    contOk += 1;
                } else {
                    contError += 1;
                }
                String cantOk = String.valueOf(contOk);
                String cantError = String.valueOf(contError);
                correctas.setText(cantOk);
                incorrectas.setText(cantError);
                contCantPreguntas += 1;


                TextView titulo_preguntas = new TextView(getApplicationContext());
                String titulo = "Preguntas " + contCantPreguntas;
                LinearLayout.LayoutParams layoutParamsTitulo = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                layoutParamsTitulo.setMargins(0, 20, 0, 20);
                titulo_preguntas.setText(titulo);
                titulo_preguntas.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20);
                titulo_preguntas.setTypeface(null, Typeface.BOLD);
                titulo_preguntas.setLayoutParams(layoutParamsTitulo);


                TextView text_descripcion = new TextView(getApplicationContext());
                String descripcionInfo = descripcion;
                LinearLayout.LayoutParams layoutParamsDescripcion = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
                layoutParamsDescripcion.setMargins(0, 20, 0, 20);
                text_descripcion.setText(descripcionInfo);
                text_descripcion.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 16);
                text_descripcion.setLayoutParams(layoutParamsDescripcion);

                contenedor.addView(titulo_preguntas);
                contenedor.addView(text_descripcion);

                for (int j = 0; j < opcionesArray.length(); j++) {
                    JSONObject opcion = opcionesArray.getJSONObject(j);
                    int idOpcion = opcion.getInt("id");
                    String descripcionOpciones = opcion.getString("descripcion");


                    TextView textOpcion = new TextView(getApplicationContext());
                    LinearLayout.LayoutParams layoutParamsOpcion = new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT
                    );
                    layoutParamsOpcion.setMargins(0, 20, 0, 20);


                    String textoConcatenado = "    " + descripcionOpciones;
                    textOpcion.setText(textoConcatenado);

                    textOpcion.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);
                    textOpcion.setLayoutParams(layoutParamsOpcion);


                    if (respuesta_dada == idOpcion) {
                        if (respuesta_dada == id_correcta) {
                            textOpcion.setTextColor(Color.GREEN);
                        } else {
                            textOpcion.setTextColor(Color.RED);
                        }
                    }


                    contenedor.addView(textOpcion);
                }


            }

            String canntidad_preguntas = String.valueOf(contCantPreguntas);
            cantPreguntas.setText(canntidad_preguntas);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public void cambiarActivity(View vista){
        Intent intencion = new Intent(getApplicationContext(), Resumen.class);
        startActivity(intencion);

        finish();
    }
}