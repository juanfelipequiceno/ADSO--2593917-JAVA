package com.example.apipokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarException;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    List<Pokemon> pokemonList =  new ArrayList<>();

    int currentPage = 0;
    int totalPages;
    Button btnAtras, btnSiguiente ;

    AdaptadorPokemon adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAtras = findViewById(R.id.btnAtras);
        btnSiguiente = findViewById(R.id.btnSiguiente);
        recycler = findViewById(R.id.listadoPokemon);
        recycler.setLayoutManager( new LinearLayoutManager(this));
        adapter = new AdaptadorPokemon(pokemonList);
        recycler.setAdapter(adapter);
        pokemonData();
    }


    public void pokemonData(){
        String url = "https://pokeapi.co/api/v2/pokemon";
        JsonObjectRequest request =  new JsonObjectRequest(Request.Method.GET,url, null, response -> {
            try {
                JSONArray results = response.getJSONArray("results");

                for (int i = 0; i < results.length();i++){
                    JSONObject pokemonObjet = results.getJSONObject(i);
                    String name = pokemonObjet.getString("name");
                    String urlp = pokemonObjet.getString("url");
                    pokemonList.add(new Pokemon(name, urlp));



                }
            }catch (JSONException e){
                e.printStackTrace();

            }
        },
                error -> Toast.makeText(MainActivity.this,"Error Data", Toast.LENGTH_SHORT).show());
        Volley.newRequestQueue(this).add(request);

    }

    public void onbtnAtrasClick(View view) {
        if (currentPage < totalPages - 1) {
            currentPage++;

        }
    }

    public void onbtnSiguienteClick(View view) {
        if (currentPage > 0) {
            currentPage--;

        }
    }


}