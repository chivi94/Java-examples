/*16. Escribir un programa que calcule la potencia entera de un número entero leído por teclado 
 de forma ITERATIVA y de forma RECURSIVA.*/
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio16 {

    public static int iterativa(int base, int exp) {
        int potencia = 1;
        for (int i = 1; i <= exp; i++) {
            potencia *= base;
        }
        return potencia;
    }

    public static int pot(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * pot(base, exp - 1);

    }

    public static void main(String[] args) {

        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduce base:");
            int base = Integer.parseInt(teclado.readLine());
            System.out.print("Introduce exponente:");
            int exp = Integer.parseInt(teclado.readLine());

            //Forma Iterativa
            System.out.println("El resultado de " + base + " elevado a " + exp + " es: " + iterativa(base, exp));
            //Forma recursiva

            System.out.println("El resultado de " + base + " elevado a " + exp + " es: " + pot(base, exp));

        } catch (IOException ex) {
            Logger.getLogger(Ejercicio16.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
