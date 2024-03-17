package com.example.pokeapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DetallePokemon extends AppCompatActivity {


    List<Imagenes> imagenesList =  new ArrayList<>();

    List<Habilidades> habilidadeslist = new ArrayList<>();
    TextView etq_nombre;

    TextView idAltura;
    TextView idPeso;
    RecyclerView recycler;
    RecyclerView recycles2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_pokemon);
        recycler = findViewById(R.id.recycler_imagenes);
        recycles2 = findViewById(R.id.recyclerHabilidades);
        idAltura = findViewById(R.id.idAltura);
        idPeso =  findViewById(R.id.idPeso);
        Intent intencion = getIntent();
        String nombrePpkemon = intencion.getStringExtra("nombre");
        String url = intencion.getStringExtra("url");
        etq_nombre = findViewById(R.id.etq_nombre);
        etq_nombre.setText(nombrePpkemon);
        cargarDatos(url);
    }


    public void cargarDatos(String url){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

        StringRequest solicitud =  new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                try {
                    JSONObject jsonObject = new JSONObject(response);
                    System.out.println(response);
                    String altura = jsonObject.getString("height");
                    idAltura.setText(altura);
                    String peso = jsonObject.getString("weight");
                    idPeso.setText(peso);

                    JSONObject sprites = jsonObject.getJSONObject("sprites");
                    String back_default = sprites.getString("back_default");
                    String back_shiny = sprites.getString("back_shiny");
                    String front_default = sprites.getString("front_default");
                    String front_shiny = sprites.getString("front_shiny");

                    imagenesList.add(new Imagenes(back_default));
                    imagenesList.add(new Imagenes(back_shiny));
                    imagenesList.add(new Imagenes(front_default));
                    imagenesList.add(new Imagenes(front_shiny));


                    JSONArray abilities = jsonObject.getJSONArray("abilities");

                    for (int i = 0; i < abilities.length(); i++){
                        JSONObject habilidades = abilities.getJSONObject(i);
                        JSONObject ability = habilidades.getJSONObject("ability");
                        String habilities = ability.getString("name");
                        System.out.println(habilities);
                        habilidadeslist.add(new Habilidades(habilities));
                        AdaptadorHablidades adaptadorH = new AdaptadorHablidades(habilidadeslist);
                        recycles2.setAdapter(adaptadorH);
                        recycles2.setLayoutManager(new LinearLayoutManager(DetallePokemon.this));

                    }

                    AdaptadorImagnes adaptador = new AdaptadorImagnes(imagenesList);
                    recycler.setAdapter(adaptador);
                    recycler.setLayoutManager(new LinearLayoutManager(DetallePokemon.this, LinearLayoutManager.HORIZONTAL, false));

                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
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






}