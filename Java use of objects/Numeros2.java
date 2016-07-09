package TEMA13;

import java.util.*;
import java.text.*;

//Programa que muestra como formatear un numero decimal
//usando la clase DecimalFormat y plantillas,
//usando el formato espaniol y el formato americano
public class Numeros2 {

    public static void main(String[] args) {

        double cantidad1 = 123456.78;
        double cantidad2 = 123.45;
        double cantidad3 = -.23;
        double cantidad4 = -123;

        System.out.println("Formato espaniol");

        DecimalFormat formateadorDec = new DecimalFormat("#,##0.0#;(#,##0.0#)");

        System.out.println(formateadorDec.format(cantidad1));
        System.out.println(formateadorDec.format(cantidad2));
        System.out.println(formateadorDec.format(cantidad3));
        System.out.println(formateadorDec.format(cantidad4));

        System.out.println("\nFormato americano");

        Locale fAmericano = new Locale("en", "us", "Traditional_WIN");
        DecimalFormatSymbols dfSAmericano = new DecimalFormatSymbols(fAmericano);
        formateadorDec = new DecimalFormat("#,##0.0#", dfSAmericano);

        System.out.println(formateadorDec.format(cantidad1));
        System.out.println(formateadorDec.format(cantidad2));
        System.out.println(formateadorDec.format(cantidad3));
        System.out.println(formateadorDec.format(cantidad4));

    }
}
