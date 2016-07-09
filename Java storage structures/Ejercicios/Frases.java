/*4. Crea un programa Frases que almacene en un array unidimensional 5 frases que se introducen por teclado. Diseña los siguientes métodos:
 a. imprimeFrases: imprime por pantalla el contenido del array.
 b. mayorFrase: imprime por pantalla la frase de mayor longitud y la posición que ocupa en el array.
 c. menorFrase: imprime por pantalla la frase más pequeña y la posición que ocupa.*/
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Frases {

    static BufferedReader teclado;

    public static void imprimeFrases(String[] frase) {
        System.out.println("Contenido del array:");
        for (int i = 0; i < frase.length; i++) {
            System.out.println((i + 1) + "." + frase[i]);
        }

    }

    public static void mayorFrase(String[] frase) {
        String aux = "";
        int numAux = 0;
        System.out.println("Frase de mayor longitud:");
        for (int i = 1; i < frase.length; i++) {

            if (frase[i].length() > aux.length()) {
                aux = frase[i];
                numAux = i;
            }

        }
        System.out.println((numAux + 1) + "." + aux);
    }

     public static void menorFrase(String[] frase) {
        String aux = frase[0];
        int numAux = 0;
        System.out.println("Frase de menor longitud:");
        for (int i = 1; i < frase.length; i++) {
            
            if (frase[i].length() < aux.length()) {
                aux=frase[i];
                numAux = i;
            }

        }
        System.out.println((numAux + 1) + "." + aux);
    }
  

    public static void main(String[] args) {
        try {
            teclado = new BufferedReader(new InputStreamReader(System.in));

            String[] frases = new String[5];

            for (int i = 0; i < frases.length; i++) {
                System.out.println("Introduce frase " + (i + 1) + " de " + frases.length + ":");

                frases[i] = teclado.readLine();

            }

            imprimeFrases(frases);
            mayorFrase(frases);
            menorFrase(frases);
        } catch (IOException ex) {
            Logger.getLogger(Frases.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
