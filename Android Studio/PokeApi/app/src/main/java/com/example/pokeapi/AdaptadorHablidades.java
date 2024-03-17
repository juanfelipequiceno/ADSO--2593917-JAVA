package com.example.pokeapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class AdaptadorHablidades extends RecyclerView.Adapter<AdaptadorHablidades.ViewHolder>{

    List<Habilidades> litaHabilidad;

    public AdaptadorHablidades(List<Habilidades> habilidadeslist) {
        this.litaHabilidad = habilidadeslist;
    }

    @NonNull
    @Override
    public AdaptadorHablidades.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_habilidad, parent, false);
        return new AdaptadorHablidades.ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHablidades.ViewHolder holder, int position) {
        Habilidades temporal = litaHabilidad.get(position);
        holder.cargarDatos(temporal);
    }
    @Override
    public int getItemCount() {
        return litaHabilidad.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView etq_habilidades;
        Context contexto;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contexto = itemView.getContext();
            etq_habilidades = itemView.findViewById(R.id.etq_habilidades);
        }

        public void cargarDatos(Habilidades temporal) {
            etq_habilidades.setText(temporal.getHabiladad());
        }
    }
}
