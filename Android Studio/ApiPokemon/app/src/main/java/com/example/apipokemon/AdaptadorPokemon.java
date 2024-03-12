package com.example.apipokemon;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;
import java.util.concurrent.TimeoutException;

public class AdaptadorPokemon extends RecyclerView.Adapter<AdaptadorPokemon.ViewHolder> {
    List<Pokemon> pokemonList;




    public AdaptadorPokemon(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;

    }

    @NonNull
    @Override
    public AdaptadorPokemon.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listado_pokemon, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Pokemon pokemon = pokemonList.get(position);
        holder.cargarDatos(pokemon);

    }

    @Override
    public int getItemCount() {
        return pokemonList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView namePokemon;
        ImageView imagenBoton;

        Context contexto;
        ViewHolder(View itemView) {
            super(itemView);
            contexto = itemView.getContext();
            namePokemon = itemView.findViewById(R.id.namePokemon);
            imagenBoton = itemView.findViewById(R.id.imagenBoton);

        }

        public void cargarDatos(Pokemon pokemon){
            namePokemon.setText(pokemon.getName());
            String name = pokemon.getName();
            String url = pokemon.getUrl();
            imagenBoton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cambiarActivity(name, url);
                }
            });

        }

        public void cambiarActivity(String name, String url){
            Intent intencion = new Intent(contexto, DetallesPokemon.class);
            intencion.putExtra("name",name);
            intencion.putExtra("url",url);

            contexto.startActivity(intencion);
        }
    }


}