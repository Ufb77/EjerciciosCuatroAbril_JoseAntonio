package com.softtek.modelo;

public class Areas {

    public Areas(){};


    public double calcularAreaCirculo(double radio){

        return (Math.pow(radio, 2.0)*Math.PI);
    }

    public double calcularAreaRectangulo(double base, double altura){
        return base * altura;
    }
}
