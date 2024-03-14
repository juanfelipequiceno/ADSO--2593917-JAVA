package com.example.apipokemon;

public class Pokemon {

    String numero;
    String name;
    String url;

    public Pokemon(String numero, String name) {
        this.numero = numero;
        this.name = name;
        this.url = url;
    }

    public String getNumero() {
        return numero;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

