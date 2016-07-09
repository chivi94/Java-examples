/*11. Escribe un programa Ordenacion2 que cree una lista de N palabras introducidas por teclado (N es un entero que se pedirá al usuario). 
 Imprime la lista, ordénala alfabéticamente (método de la burbuja) e imprímela de nuevo. 
 Crea un método que devuelva el número de palabras de la lista que empiezan por un carácter que se solicita al usuario*/
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ordenacion2 {

    public static void burbuja(String[] lista) {
        int N = lista.length;
        for (int i = 1; i <= N - 1; i++) {//pasadas
            for (int j = 1; j <= N - i; j++) {//parejas
                if (lista[j - 1].compareTo(lista[j]) > 0) {
                    String aux = lista[j - 1];
                    lista[j - 1] = lista[j];
                    lista[j] = aux;
                }

            }

        }
        imprimirArray(lista);
    }//Ya tiene incluido el método que muestra la lista 

    public static void imprimirArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + "." + array[i]);
        }
        System.out.println();
    }

    public static void buscarCaracter(String[] lista, char letra) {
        int N = lista.length;
        int cont=0;
        for (int i = 0; i <= N - 1; i++) {//pasadas
            if((lista[i].charAt(0))==letra){
                cont++;
            }

        }
        System.out.println("El numero de palabras que empiezan por la letra introducida "+letra+" es "+ cont);
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

            System.out.print("Introduce caracter a buscar:");
            char caracter = teclado.readLine().charAt(0);

            buscarCaracter(lista, caracter);

        } catch (IOException ex) {
            Logger.getLogger(Ordenacion1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
