package com.softtek.presentacion;

public class Abril03 {

    public static void main(String[] args) {

        //calcular area de un cuadrado cuyo lado mide 6
        //calcular el area de un circulo cuyo radio es 3
        //calcular el perimetro de un rectangulo cuya base es
        //4 y altura 3


        int ladoCuadrado = 6;
        int radioCirculo = 3;
        int baseRectangulo = 4;
        int alturaRectangulo = 3;


        System.out.println(ladoCuadrado * ladoCuadrado);
        System.out.println(Math.pow(radioCirculo, 2.0) * Math.PI);


        int baseAltura = baseRectangulo+alturaRectangulo;
        System.out.println(baseAltura * 2);
    }
}
