package Ejercicio3_Calculadora;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Calculadora {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static String dividir(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("Error. Divisor 0");
        }
        NumberFormat nf=NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(9);
        return nf.format(a / b);
    }
}
