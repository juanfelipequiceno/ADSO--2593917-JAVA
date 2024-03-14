package com.example.apipokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    String urlNext;
    String urlPrevious;
    AdaptadorPokemon adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.listadoPokemon);
        urlNext = null;
        urlPrevious = null;
        /*ImageView loadListaPokemon = findViewById(R.id.loadListaPokemon);
        Glide.with(this)
                        .asGif()
                        .load(R.drawable.loading_pokeball)
                        .into(loadListaPokemon);*/

        pokemonData("https://pokeapi.co/api/v2/pokemon?limit=20");
    }

    public void pokemonData(String url){
        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());

        JsonObjectRequest request =  new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println("El Servidor responde con un ok");
                System.out.println(response.toString());
                try {
                    urlNext = response.getString("next");
                    urlPrevious = response.getString("previous");

                    JSONArray results = response.getJSONArray("results");

                    List<Pokemon> pokemonList = new ArrayList<>();
                    for (int i = 0; i < results.length(); i++) {
                        JSONObject pokemonObjet = results.getJSONObject(i);
                        String name = pokemonObjet.getString("name");
                        String url = pokemonObjet.getString("url");

                        pokemonList.add(new Pokemon(name, url));

                        adapter = new AdaptadorPokemon(pokemonList);
                        recycler.setAdapter(adapter);
                        recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    }

                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("El Servidor responde con un Error");
                System.out.println(error.getMessage());
            }
        });
        queue.add(request);
    }
    public void cargarDatosSiguientes(View vista){
        pokemonData(urlNext);
    }

    public void cargarDatosAnteriores(View vista){
        pokemonData(urlPrevious);
    }
}