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

public class DetallesPokemon extends RecyclerView.Adapter<DetallesPokemon.ViewHolder> {
    List<Detalles> detallesPokemon;




    public DetallesPokemon(List<Detalles> detallesPokemon) {
        this.detallesPokemon = detallesPokemon;
    }

    @NonNull
    @Override
    public DetallesPokemon.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pokemon, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Detalles detalles = detallesPokemon.get(position);
        holder.cargarDetalles(detalles);

    }

    @Override
    public int getItemCount() {
        return detallesPokemon.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView pokemonName;
        TextView peso;
        TextView altura;
        Context contexto;

        ViewHolder(View itemView) {
            super(itemView);
            contexto = itemView.getContext();
            pokemonName = itemView.findViewById(R.id.pokemonName);
            altura = itemView.findViewById(R.id.altura);
            peso = itemView.findViewById(R.id.peso);

        }


        public void cargarDetalles(Detalles detalles){



        }


    }


}