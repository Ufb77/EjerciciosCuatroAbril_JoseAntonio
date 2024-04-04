package com.softtek.presentacion;

import com.softtek.modelo.Dado;

public class Ej7 {

    public static void main(String [] args){

        Dado d1 = new Dado();

        System.out.println(d1.mostrarResultado());
        d1.lanzar();
        System.out.println("---------------------------------");
        System.out.println(d1.mostrarResultado());




    }
}
