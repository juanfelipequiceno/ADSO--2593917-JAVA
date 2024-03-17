package com.example.pokeapi;

public class PesaAltura {

    String altura;
    String peso;

    public PesaAltura(String altura, String peso) {
        this.altura = altura;
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
}
