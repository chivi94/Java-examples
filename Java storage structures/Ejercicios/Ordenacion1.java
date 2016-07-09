/*10. Escribe un programa Ordenacion1 que cree una lista de palabras introducidas por teclado, el tamaño de la lista se pedirá al usuario. 
 Seguidamente se imprimirá la lista por pantalla, a continuación deberás ordenar la lista por longitud de las palabras (tomando como base el método de ordenación de la burbuja)
 y finalmente imprimir la lista ordenada.*/
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ordenacion1 {

    public static void burbuja(String[] lista) {
        //Objetivo->poner la palabra de mayor longitud al final de la lista
        //Ordenación de menor a mayor
        int N = lista.length;
        for (int i = 1; i <= N - 1; i++) {//pasadas
            for (int j = 1; j <= N - i; j++) {//parejas
                if ((lista[j - 1].length()) > (lista[j].length())) {
                    String aux = lista[j - 1];
                    lista[j - 1] = lista[j];
                    lista[j] = aux;
                }

            }

        }
        imprimirArray(lista);
    }//Ya tiene incluido el método que muestra la lista 
    
    public static void imprimirArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1)+"."+array[i]);
        }
        System.out.println();
    }

    static BufferedReader teclado;

    public static void main(String[] args) {
        try {
            teclado = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Introduce tamaño de la lista de palabras:");
            int t = Integer.parseInt(teclado.readLine());

            String[] lista = new String[t];

            for (int i = 0; i < lista.length; i++) {
                System.out.print("Introduce la palabra número " + (i + 1) + " de " + lista.length + ": ");
                lista[i] = teclado.readLine();
            }
            imprimirArray(lista);
            
            burbuja(lista);
        } catch (IOException ex) {
            Logger.getLogger(Ordenacion1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
