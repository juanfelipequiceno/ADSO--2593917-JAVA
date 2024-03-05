package com.example.apppreguntas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.apppreguntas.utils.Config;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PreguntasCuestionarios extends AppCompatActivity {
    TextView nombre_usuario;
    TextView fecha_inicio;
    TextView pregunta_actual;
    Config config;
    LinearLayout layoutPrincipal;
    TextView descripcionPreguntas;
    ImageView consumo_imagen;
    RadioGroup radio_group;
    String id_pregunta;
    String fecha_actual;
    String id_respuesta_corecta;
    TextView cant_pregunta;
    String id_cuestionario;
    int cont = 0;
    int preguntas_db;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas_cuestionarios);

        nombre_usuario = findViewById(R.id.usuario);
        fecha_inicio = findViewById(R.id.fecha_inicio);
        pregunta_actual = findViewById(R.id.pregunta_actual);
        descripcionPreguntas = findViewById(R.id.descripcion_pregunta);
        consumo_imagen = findViewById(R.id.imgen_consumo);
        layoutPrincipal = findViewById(R.id.layout_principal);
        cant_pregunta = findViewById(R.id.pregunta_actual);
        radio_group = findViewById(R.id.radio_group);
        config = new Config(getApplicationContext());


        Intent intent = getIntent();
        //VARIABLE DE SESION
        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);
        String id_usuario = archivo.getString("id_usuario", null);

        nombre_usuario.setText(archivo.getString("nombres", ""));
        id_cuestionario = intent.getStringExtra("id");
        fecha_actual= intent.getStringExtra("fecha_actual");

        nombre_usuario.setText(archivo.getString("nombres", ""));
        fecha_inicio.setText(fecha_actual);

        consumoPreguntas();

    }

    public void consumoPreguntas(){
        // CONSUMO GET PARA TRAER LOS CUESTIONARIOS
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("API-Preguntas/getOtherPregunta.php");

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    System.out.println("El servidor POST responde OK");
                    JSONObject jsonObject = new JSONObject(response);
                    boolean valorBooleano = jsonObject.getBoolean("status");

                    if (valorBooleano){
                        imprimirPreguntas(jsonObject);
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
                params.put("id_cuestionario", id_cuestionario);
                return params;
            }
        };

        queue.add(solicitud);
    }
    public void imprimirPreguntas(JSONObject jsonObject){
        cont += 1;
        String contString = String.valueOf(cont);
        cant_pregunta.setText(contString);

        try {
            preguntas_db = jsonObject.getInt("cant_preguntas");
            JSONObject preguntaJson = jsonObject.getJSONObject("preguntas");
            JSONArray opcionesJson = jsonObject.getJSONArray("opciones");


            // Crear TextView para la descripción de la pregunta
            String descripcionPregunta = preguntaJson.getString("descripcion");
            id_pregunta = preguntaJson.getString("id");
            String id_correcta = preguntaJson.getString("id_correcta");

            descripcionPreguntas.setText(descripcionPregunta);


            // Obtener la URL de la imagen
            String urlImagen = preguntaJson.getString("url_imagen");

            // Solicitar la imagen
            RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
            ImageRequest solicitud = new ImageRequest(
                    urlImagen,
                    new Response.Listener<Bitmap>() {
                        @Override
                        public void onResponse(Bitmap bitmap) {
                            // Set the image in the ImageView.
                            consumo_imagen.setImageBitmap(bitmap);
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
            radio_group.removeAllViews();
            for (int i = 0; i < opcionesJson.length(); i++) {
                JSONObject opcionJson = opcionesJson.getJSONObject(i);
                String id_opcion = opcionJson.getString("id");
                String descripcionOpcion = opcionJson.getString("descripcion");

                if (id_correcta.equals(id_opcion)){
                    id_respuesta_corecta = descripcionOpcion;
                }

                RadioButton radioButton = new RadioButton(getApplicationContext());
                radioButton.setText(descripcionOpcion);
                radioButton.setLayoutParams(new RadioGroup.LayoutParams(
                        RadioGroup.LayoutParams.MATCH_PARENT,
                        RadioGroup.LayoutParams.WRAP_CONTENT));
                radioButton.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20); // Establecer tamaño de texto

                radio_group.addView(radioButton);

            }


        } catch (JSONException e) {
            System.out.println("Error al procesar el JSON: " + e.getMessage());
        }


    }

    public void cambiarPregunta(View view){

        if (cont == preguntas_db){
            String estado;
            int id_radio = radio_group.getCheckedRadioButtonId();
            RadioButton seleccionado = findViewById(id_radio);
            if (seleccionado != null) {
                String respuesta_radio = seleccionado.getText().toString();

                if (respuesta_radio.equals(id_respuesta_corecta)){
                    estado = "OK";
                }else{
                    estado = "ERROR";
                }
                RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
                String url = config.getEndpoint("API-Preguntas/createRespuesta.php");

                StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            System.out.println("El servidor POST responde OK");
                            JSONObject jsonObject = new JSONObject(response);
                            boolean valorBooleano = jsonObject.getBoolean("status");

                            if (valorBooleano){
                                consumoPreguntas();
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
                        params.put("id_cuestionario", id_cuestionario);
                        params.put("id_pregunta", id_pregunta);
                        params.put("respuesta", respuesta_radio);
                        params.put("estado", estado);
                        params.put("fecha", fecha_actual);
                        return params;
                    }
                };
                queue.add(solicitud);
            } else {
                // Si no se seleccionó ningún RadioButton
                System.out.println("Ninguna opción seleccionada");
            }
            Intent intencion = new Intent(getApplicationContext(), DetalleCuestionario.class);
            startActivity(intencion);
            finish();
        }else {
            String estado;
            int id_radio = radio_group.getCheckedRadioButtonId();
            RadioButton seleccionado = findViewById(id_radio);
            if (seleccionado != null) {
                String respuesta_radio = seleccionado.getText().toString();

                if (respuesta_radio.equals(id_respuesta_corecta)){
                    estado = "OK";
                }else{
                    estado = "ERROR";
                }
                RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
                String url = config.getEndpoint("API-Preguntas/createRespuesta.php");

                StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            System.out.println("El servidor POST responde OK");
                            JSONObject jsonObject = new JSONObject(response);
                            boolean valorBooleano = jsonObject.getBoolean("status");

                            if (valorBooleano){
                                consumoPreguntas();
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
                        params.put("id_cuestionario", id_cuestionario);
                        params.put("id_pregunta", id_pregunta);
                        params.put("respuesta", respuesta_radio);
                        params.put("estado", estado);
                        params.put("fecha", fecha_actual);
                        return params;
                    }
                };
                queue.add(solicitud);
            } else {
                // Si no se seleccionó ningún RadioButton
                System.out.println("Ninguna opción seleccionada");
            }
        }

    }


}