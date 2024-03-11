package com.example.pruebarecicle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView((R.layout.activity_main));

        List<Persona> listado = new ArrayList<>();
        listado.add( new Persona("Felipe", "Quiceno","25", "M", "Guadalcanal", "33333333", "defauk.png"));
        listado.add( new Persona("Ana", "Quiceno","25", "M", "Guadalcanal", "33333333", "defauk.png"));
        listado.add( new Persona("Andres", "Quiceno","25", "M", "Guadalcanal", "33333333", "defauk.png"));
        listado.add( new Persona("Cristias", "Quiceno","25", "M", "Guadalcanal", "33333333", "defauk.png"));

        recycler = findViewById(R.id.recyclerContactos);

        AdaptadorContacto adaptador =  new AdaptadorContacto(listado);
        recycler.setAdapter(adaptador);
        recycler.setLayoutManager( new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));
    }
}