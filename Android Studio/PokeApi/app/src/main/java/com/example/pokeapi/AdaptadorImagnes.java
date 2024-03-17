package com.example.pokeapi;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class AdaptadorImagnes  extends  RecyclerView.Adapter<AdaptadorImagnes.ViewHolder> {
    List<Imagenes> listaImagnes;

    public AdaptadorImagnes(List<Imagenes> lista){this.listaImagnes = lista;}
    @NonNull
    @Override
    public AdaptadorImagnes.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_imagen, parent, false);
        return new AdaptadorImagnes.ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorImagnes.ViewHolder holder, int position) {
        Imagenes temporal = listaImagnes.get(position);
        holder.cargarDatos(temporal);
    }

    @Override
    public int getItemCount() {
        return listaImagnes.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView item_imagen;

        Context context;
        @SuppressLint("WrongViewCast")
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item_imagen = itemView.findViewById(R.id.item_imagen);
        }

        public void cargarDatos(Imagenes dato){
            String listaImg = dato.getImg();
            Picasso.get().load(listaImg).into(item_imagen);
        }

    }

}
