package com.softtek.modelo;

public class Campos {

    private int valor;

    public Campos(int valor){

        this.valor = valor;

    }

    public int incrementa(){
        return this.valor + 1;
    }

    public int muestra(){
        return this.valor;
    }
}
