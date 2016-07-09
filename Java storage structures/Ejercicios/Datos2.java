/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Ivan
 */
public class Datos2 {

    public static void sumaPares(int[] enteros) {
        int suma = 0;
        int cont=0;
        for (int i = 0; i < enteros.length; i++) {
            if (enteros[i] % 2 == 0) {
                System.out.println(i+"->"+enteros[i]);
                suma += enteros[i];
                cont++;
            }

        }
        System.out.println("Suma de las posiciones impares:" + suma);
        System.out.println("Cuenta:" + cont);
    }
    static int[] entero;

    public static void main(String[] args) {

        entero = new int[10];
        for (int i = 0; i < 10; i++) {
            entero[i] = i + 1;
        }
        sumaPares(entero);
    }

}
