package com.softtek.modelo;

public class TablasMult {

    private int valor;

    public TablasMult(int num){

        this.valor = num;

    }

    public String mostrarTabla(){
        String resultados = "";
        for(int i = 0; i <= 10; i++){
            resultados += String.valueOf(this.valor * i) + "\n";
        }

        return resultados;
    }
}
