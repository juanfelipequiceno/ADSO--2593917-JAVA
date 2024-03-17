package com.example.pokeapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;

    String urlNext;
    String urlPrevious;

    Button btnAnterior, btnSiguiente;

    ImageView loadListaPokemon;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        urlNext = null;
        urlPrevious = null;

        btnAnterior = findViewById(R.id.btnAnterior);
        btnSiguiente = findViewById(R.id.btnSiguiente);

        recycler = findViewById(R.id.recycler_listado);

        cargarDatos("https://pokeapi.co/api/v2/pokemon/?offset=0&limit=20");

    }

    public void cargarDatos(String url){
        loadListaPokemon = findViewById(R.id.loadListaPokemon);
        Glide.with(this)
                .asGif()
                .load(R.drawable.loading_pokeball)
                .into(loadListaPokemon);
        loadListaPokemon.setVisibility(View.VISIBLE);
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

        JsonObjectRequest solicitud =  new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println("El servidor responde OK");
                System.out.println(response.toString());
                loadListaPokemon.setVisibility(View.GONE);
                try {

                    urlPrevious = response.getString("previous");
                    urlNext = response.getString("next");

                    // Accediendo al arreglo "results"
                    JSONArray resultsArray = response.getJSONArray("results");

                    List<Pokemon> listado = new ArrayList<>();
                    for (int i = 0; i < resultsArray.length(); i++) {
                        // Accediendo al primer objeto dentro del arreglo "results"
                        JSONObject Resultado = resultsArray.getJSONObject(i);
                        String nombre = Resultado.getString("name");
                        String url = Resultado.getString("url");

                        listado.add(new Pokemon("0000", nombre, url));

                        AdaptadorItem adaptador = new AdaptadorItem(listado);
                        recycler.setAdapter(adaptador);
                        recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                        btnSiguiente.setEnabled(!"null".equals(urlNext));
                        btnAnterior.setEnabled((!"null".equals(urlPrevious)));
                    }

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

    public void cargarSiguiente(View vista){

        cargarDatos(urlNext);
    }

    public void cargarAnterior(View vista){

        cargarDatos(urlPrevious);
    }

}