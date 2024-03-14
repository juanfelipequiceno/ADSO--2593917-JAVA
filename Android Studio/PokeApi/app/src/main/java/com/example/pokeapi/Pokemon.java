package com.example.pokeapi;

public class Pokemon {

    String num_pokemon;
    String nombre;
    String url;

    public Pokemon(String num_pokemon, String nombre, String url){
        this.num_pokemon = num_pokemon;
        this.nombre = nombre;
        this.url = url;
    }

    public String getNum_pokemon() {
        return num_pokemon;
    }
    public void setNum_pokemon(String num_pokemon) {
        this.num_pokemon = num_pokemon;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
