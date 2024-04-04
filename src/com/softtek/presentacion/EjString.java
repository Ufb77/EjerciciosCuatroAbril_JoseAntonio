package com.softtek.presentacion;

public class EjString {

    public static void main(String[] args){
    /*
        Crear la cadena de texto: “Nunca mates una mosca sobre la cabeza de un tigre.”
        • Mostrar la cadena toda en mayúsculas
        • Mostrar la cadena en minúsculas
        • Mostrar solo la palabra Nunca
        • Mostrar solo la palabra mosca
        • Mostrar la palabra cabeza
        • Mostrar la posición de la letra primera m
        • Devolver la longitud de la cadena
         */

        String cadena = "Nunca mates una mosca sobre la cabeza de un tigre.";

        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.substring(0,6));
        System.out.println(cadena.substring(16, 21));
        System.out.println(cadena.substring(31, 37));
        System.out.println(cadena.indexOf("m"));
        System.out.println(cadena.length());



    }
}
