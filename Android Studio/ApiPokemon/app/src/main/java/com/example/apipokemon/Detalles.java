package com.example.apipokemon;

public class Detalles {

    String name;
    String altura;
    String peso;
    String habilidades;

    public Detalles(String name, String altura, String peso, String habilidades) {
        this.name = name;
        this.altura = altura;
        this.peso = peso;
        this.habilidades = habilidades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }
}
