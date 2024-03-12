package com.example.apipokemon;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorPokemon extends RecyclerView.Adapter<AdaptadorPokemon.ViewHolder> {
    List<Pokemon> pokemonList;
    OnItemClickListener listener;


    public AdaptadorPokemon(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pokemon, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Pokemon pokemon = pokemonList.get(position);
        holder.textViewName.setText(pokemon.getName());
        holder.pokemonImage.setOnClickListener(v -> {
            if (listener != null) {
                listener.onItemClick(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return pokemonList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        ImageView pokemonImage;
        ViewHolder(View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.listadoPokemon);
            pokemonImage = itemView.findViewById(R.id.pokemonImage);
        }

    }
    public interface OnItemClickListener {
        void onItemClick(int position);
    }
}