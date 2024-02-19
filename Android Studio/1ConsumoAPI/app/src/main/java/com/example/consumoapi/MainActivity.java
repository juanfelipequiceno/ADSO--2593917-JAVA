package com.example.consumoapi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    TextView etq_respuesta;
    TextView etq_respuesta_post;

     ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etq_respuesta = findViewById(R.id.etq_respuesta);
        etq_respuesta_post = findViewById(R.id.etq_respuesta_post);
        img = findViewById(R.id.img);
    }


    public void consumoGet(View vista){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = "http://10.199.145.28/APIenPHP/Obtener.php";

        JsonObjectRequest solicitud =  new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println("El servidor responde OK");
                System.out.println(response.toString());


                extratClients( response );
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor responde con un error:");
                System.out.println(error.getMessage());
            }
        });
        queue.add(solicitud);
    }

    public void consumoPOST(View vista) {
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = "http://10.199.145.28/APIenPHP/Insert.php";

        StringRequest solicitud =  new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.println("El servidor POST responde OK");
                System.out.println(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El servidor POST responde con un error:");
                System.out.println(error.getMessage());
            }
        }){
            protected Map<String, String> getParams(){
                Map<String, String> params = new HashMap<>() ;
                params.put("cedula", "107701");
                params.put("nombres", "juan felipe");
                params.put("apellidos", "quiceno");
                params.put("telefono", "313373");
                params.put("direccion", "guadal");
                params.put("email", "felipequi@");

                return params;
            }
        };

        queue.add(solicitud);
    }

    public void consumoImg(View vista){
        System.out.println("Se inicia el Consumo");
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        String url = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1.png";

        ImageRequest solicitudImagen = new ImageRequest(
                url,
                new Response.Listener<Bitmap>() {
                    @Override
                    public void onResponse(Bitmap response) {
                        System.out.println("Consumo Imagen OK:");
                    }
                },
                0, 0, null,
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        System.out.println("Error consumo Imagen: ");
                        System.out.println(error.getMessage());
                    }
                }
        );

        queue.add(solicitudImagen);
    }



    public void extratClients(@NonNull JSONObject datos){
        try {
            JSONArray arregloDatos = datos.getJSONArray("registros");
            etq_respuesta.setText(" ");
            for(int i=0; i<arregloDatos.length();i++){
                JSONObject client = arregloDatos.getJSONObject(i);

                String document = client.getString("cedula");
                String first_name = client.getString("nombres");
                String last_name = client.getString("apellidos");


                etq_respuesta.append( document+" - "+first_name+" - "+last_name+" \n ");
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }




}