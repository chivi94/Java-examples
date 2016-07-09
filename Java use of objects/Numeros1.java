package TEMA13;

import java.text.*;
import java.util.*;

//Programa que muestra como formatear un numero decimal
//usando la clase NumberFormat
public class Numeros1 {

    public static void main(String[] args) {

        double cantidad = 1234.567; //numero sin formatear

        System.out.println("Formato de numeros y moneda espaniol");

        NumberFormat formateadorNum = NumberFormat.getInstance(); //caracteristicas regionales de numero
        formateadorNum.setMaximumFractionDigits(2); //maximo 2 decimales
        System.out.println(formateadorNum.format(cantidad));

        formateadorNum = NumberFormat.getCurrencyInstance(); //aniade simbolo euro
        System.out.println(formateadorNum.format(cantidad));

        formateadorNum = NumberFormat.getIntegerInstance(); //redondea a cantidad entera
        System.out.println(formateadorNum.format(cantidad));

        formateadorNum = NumberFormat.getPercentInstance(); //multiplica por 100 y aniade %
        System.out.println(formateadorNum.format(cantidad));

        System.out.println("\nFormato de numeros y moneda americano");

        formateadorNum = NumberFormat.getInstance(Locale.US); //caracteristicas regionales de numero
        System.out.println(formateadorNum.format(cantidad));

        formateadorNum = NumberFormat.getCurrencyInstance(Locale.US); //aniade simbolo dolar
        System.out.println(formateadorNum.format(cantidad));

        formateadorNum = NumberFormat.getIntegerInstance(Locale.US); //redondea
        System.out.println(formateadorNum.format(cantidad));

        formateadorNum = NumberFormat.getPercentInstance(Locale.US); //multiplica por 100 y aniade %
        System.out.println(formateadorNum.format(cantidad));
    }
}
