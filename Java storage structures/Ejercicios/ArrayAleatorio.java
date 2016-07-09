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
public class ArrayAleatorio {

    public static void main(String[] args) {
        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) ((Math.random() * 10) + 1);
            for (int j = 0; j < i; j++) {
                if (numeros[i] == numeros[j]) {
                    i--;
                }
            }

        }

        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }
    }
}
