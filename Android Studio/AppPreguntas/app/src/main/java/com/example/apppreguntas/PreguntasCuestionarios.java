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
    TextView nombreUsuario;
    TextView fechaInicio;
    TextView preguntaActual;
    Config config;
    LinearLayout layoutPrincipal;
    TextView descripcionPreguntas;
    ImageView consumoImagen;
    RadioGroup radioGroup;
    String idPregunta;
    String fechaActual;
    String idRespuestaCorecta;
    TextView cantPregunta;
    String idCuestionario;
    int cont = 0;
    int preguntas_db;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas_cuestionarios);

        nombreUsuario = findViewById(R.id.usuario);
        fechaInicio = findViewById(R.id.fechaInicio);
        preguntaActual = findViewById(R.id.preguntaActual);
        descripcionPreguntas = findViewById(R.id.descripcionPregunta);
        consumoImagen = findViewById(R.id.imgenConsumo);
        layoutPrincipal = findViewById(R.id.layoutPrincipal);
        cantPregunta = findViewById(R.id.preguntaActual);
        radioGroup = findViewById(R.id.radioGroup);
        config = new Config(getApplicationContext());


        Intent intent = getIntent();

        SharedPreferences archivo = getSharedPreferences("app-preguntas", MODE_PRIVATE);
        String idUsuario = archivo.getString("id_usuario", null);

        nombreUsuario.setText(archivo.getString("nombres", ""));
        idCuestionario = intent.getStringExtra("id");
        fechaActual= intent.getStringExtra("fecha_actual");

        nombreUsuario.setText(archivo.getString("nombres", ""));
        fechaInicio.setText(fechaActual);

        consumoPreguntas();

    }

    public void consumoPreguntas(){

        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = config.getEndpoint("ApiPreguntas/getObtenerPregunta.php");

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
                params.put("id_cuestionario", idCuestionario);
                return params;
            }
        };

        queue.add(solicitud);
    }
    public void imprimirPreguntas(JSONObject jsonObject){
        cont += 1;
        String contString = String.valueOf(cont);
        cantPregunta.setText(contString);

        try {
            preguntas_db = jsonObject.getInt("cant_preguntas");
            JSONObject preguntaJson = jsonObject.getJSONObject("preguntas");
            JSONArray opcionesJson = jsonObject.getJSONArray("opciones");


            // Crear TextView para la descripción de la pregunta
            String descripcionPregunta = preguntaJson.getString("descripcion");
            idPregunta = preguntaJson.getString("id");
            String id_correcta = preguntaJson.getString("id_correcta");

            descripcionPreguntas.setText(descripcionPregunta);



            String urlImagen = preguntaJson.getString("url_imagen");


            RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
            ImageRequest solicitud = new ImageRequest(
                    urlImagen,
                    new Response.Listener<Bitmap>() {
                        @Override
                        public void onResponse(Bitmap bitmap) {
                            // Set the image in the ImageView.
                            consumoImagen.setImageBitmap(bitmap);
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
            radioGroup.removeAllViews();
            for (int i = 0; i < opcionesJson.length(); i++) {
                JSONObject opcionJson = opcionesJson.getJSONObject(i);
                String id_opcion = opcionJson.getString("id");
                String descripcionOpcion = opcionJson.getString("descripcion");

                if (id_correcta.equals(id_opcion)){
                    idRespuestaCorecta = descripcionOpcion;
                }

                RadioButton radioButton = new RadioButton(getApplicationContext());
                radioButton.setText(descripcionOpcion);
                radioButton.setLayoutParams(new RadioGroup.LayoutParams(
                        RadioGroup.LayoutParams.MATCH_PARENT,
                        RadioGroup.LayoutParams.WRAP_CONTENT));
                radioButton.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 20);

                radioGroup.addView(radioButton);

            }


        } catch (JSONException e) {
            System.out.println("Error al procesar el JSON: " + e.getMessage());
        }


    }

    public void cambiarPregunta(View view) {

        view.setEnabled(false);

        int idRadio = radioGroup.getCheckedRadioButtonId();
        RadioButton seleccionado = findViewById(idRadio);

        if (seleccionado != null) {
            String respuestaRadio = seleccionado.getText().toString();
            String estado = respuestaRadio.equals(idRespuestaCorecta) ? "OK" : "ERROR";

            // Enviar respuesta al servidor
            RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
            String url = config.getEndpoint("ApiPreguntas/crearRespuesta.php");

            StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    // Habilitar el botón nuevamente después de completar la solicitud
                    view.setEnabled(true);

                    try {
                        System.out.println("El servidor POST responde OK");
                        JSONObject jsonObject = new JSONObject(response);
                        boolean valorBooleano = jsonObject.getBoolean("status");

                        if (valorBooleano){
                            cont++;

                            if (cont <= preguntas_db) {

                                consumoPreguntas();
                            } else {


                                Intent intent = new Intent(getApplicationContext(), Resumen.class);
                                startActivity(intent);
                                finish();
                            }

                        } else {
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
                    // Habilitar el botón nuevamente en caso de error
                    view.setEnabled(true);

                    System.out.println("El servidor POST responde con un error:");
                    System.out.println(error.getMessage());
                }
            }){
                protected Map<String, String> getParams(){
                    Map<String, String> params = new HashMap<String, String>();
                    params.put("id_cuestionario", idCuestionario);
                    params.put("id_pregunta", idPregunta);
                    params.put("respuesta", respuestaRadio);
                    params.put("estado", estado);
                    params.put("fecha", fechaActual);
                    return params;
                }
            };
            queue.add(solicitud);
        } else {
            // Habilitar el botón nuevamente en caso de que ninguna opción esté seleccionada
            view.setEnabled(true);
            System.out.println("Ninguna opción seleccionada");
        }
    }








}