package com.softtek.modelo;

public class Dado {

    private int valor;

    public Dado(){

        this.valor = calculoValor();
    }

    public String mostrarResultado(){


        String dibujo = "";
        switch(this.valor){

            case 1: dibujo = """
                    *
                    """;
                    break;

            case 2:
                dibujo = """
                    *   *
                    """;
                break;

            case 3:
                dibujo = """
                    *   *   *
                    """;
                break;

            case 4:
                dibujo = """
                    *   *
                    
                    *   *
                    
                    """;
                break;

            case 5:
                dibujo = """
                    *   *
                      *
                    *   *
                    
                    """;
                break;

            case 6:
                dibujo = """
                    * * *
                    * * *
                    """;
                break;

        }

        return dibujo;

    }

    public void lanzar(){

        this.valor = calculoValor();
    }

    private int calculoValor(){
        double resultado =  Math.random() * (6-1)+1;
        return (int) resultado;
    }


}
