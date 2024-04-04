package com.softtek.modelo;

import java.util.Scanner;

public class Alumno {
    private double[] parciales;
    private String nombreCompleto;

    public Alumno(String nombre, int numParciales){
        this.nombreCompleto = nombre;
        this.parciales = new double[numParciales];
        rellenarParciales(this.parciales, numParciales);
    }
    
    private void rellenarParciales(double[] parciales, int numParciales){
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < numParciales; i++){

            System.out.println("Introduzca nota del parcial " + i);
            this.parciales[i] = input.nextInt();
            input.nextLine();

        }

    }
    
    public double calcularMedia(){
        double total = 0;
        double media = 0;

        for (double nota : this.parciales) {
            total += nota;
        }

        media = total/this.parciales.length;

        return media;
    }

    public String mostrar(){
        String resultados = this.nombreCompleto + " |";


        for(double notas: this.parciales){

            resultados += notas + " ";

        }

        return resultados;
    }
    
    

}
