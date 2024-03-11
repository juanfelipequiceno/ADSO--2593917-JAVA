package com.example.pruebarecicle;

import android.content.Context;
import android.service.controls.actions.FloatAction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class AdaptadorContacto extends RecyclerView.Adapter<AdaptadorContacto.ViewHolder> {


    List<Persona> listaContactos;

    public AdaptadorContacto(List<Persona> listaContactos) {
        this.listaContactos = listaContactos;
    }


    @NonNull
    @Override
    public AdaptadorContacto.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contactos, parent, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorContacto.ViewHolder holder, int position) {
        Persona temporal = listaContactos.get(position);
        holder.cargarDatos(temporal);
    }

    @Override
    public int getItemCount() {
        return listaContactos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imgContacto;
        TextView nombreContacto;
        TextView edadContacto;
        TextView generoContacto;
        TextView direccionContacto;
        TextView telefonoContacto;
        FloatingActionButton btnDetalle;

        Context contexto;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            contexto = itemView.getContext();
            imgContacto = itemView.findViewById(R.id.imgContacto);
            nombreContacto = itemView.findViewById(R.id.nombreContacto);
            edadContacto = itemView.findViewById(R.id.edadContacto);
            generoContacto = itemView.findViewById(R.id.generoContacto);
            direccionContacto = itemView.findViewById(R.id.direccionContacto);
            telefonoContacto = itemView.findViewById(R.id.telefonoContacto);
            btnDetalle = itemView.findViewById(R.id.btnVer);

        }

        public void cargarDatos(Persona datos){

            nombreContacto.setText( datos.getNombres()+" "+datos.getApellidos());
            edadContacto.setText( datos.getEdad());
            generoContacto.setText( datos.getGenero());
            direccionContacto.setText(datos.getDireccion());
            telefonoContacto.setText(datos.getTelefono());

            btnDetalle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(contexto, datos.getNombres(), Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
