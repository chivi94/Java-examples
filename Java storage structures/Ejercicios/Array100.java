/* Crea un array de 100 enteros con los 100 primeros números naturales, 
 a continuación imprime el array. */
package Ejercicios;

/**
 *
 * @author Ivan
 */
public class Array100 {

    public static void main(String[] args) {
        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = i + 1;

        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }

}
