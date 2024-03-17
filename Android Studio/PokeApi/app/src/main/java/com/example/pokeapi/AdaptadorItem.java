package com.example.pokeapi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdaptadorItem extends RecyclerView.Adapter<AdaptadorItem.ViewHolder> {

    List<Pokemon> listaPokemons;


    public AdaptadorItem(List<Pokemon> lista){
        this.listaPokemons = lista;

    }

    @NonNull
    @Override
    public AdaptadorItem.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_pokemon, parent, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorItem.ViewHolder holder, int position) {
        Pokemon temporal = listaPokemons.get(position);
        holder.cargarDatos(temporal);
    }

    @Override
    public int getItemCount() {
        return listaPokemons.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView numero_pokemon;
        TextView nombre_pokemon;
        ImageView img_pokeball;

        Context context;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            numero_pokemon = itemView.findViewById(R.id.numero_pokemon);
            nombre_pokemon = itemView.findViewById(R.id.nombre_pokemon);
            img_pokeball = itemView.findViewById(R.id.img_pokeball);
        }

        public void cargarDatos(Pokemon dato){
            numero_pokemon.setText(dato.getNum_pokemon());
            nombre_pokemon.setText(dato.getNombre());
            String nombre = dato.getNombre();
            String url = dato.getUrl();

            img_pokeball.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    cambiarActivity(nombre, url);
                }
            });

        }

        public void cambiarActivity(String nombre, String url){
            Intent intencion = new Intent(context, DetallePokemon.class);
            intencion.putExtra("nombre",nombre);
            intencion.putExtra("url", url);
            System.out.println(nombre+url);
            context.startActivity(intencion);
        }


    }
}
