/*
 Hacer un programa que pida al usuario una frase y una letra, y de como
 resultado el número de ocurrencias de la letra en la frase y las 
 posiciones en las que se encuentra esa letra en la frase
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adrian
 */
public class Apariciones {

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            int veces = 0;

            System.out.println("Introduce frase");
            String frase = teclado.readLine();
            System.out.println("Introduce letra");
            char letra = teclado.readLine().charAt(0);
            System.out.println("El caracter que esta buscando es " + letra);


            for ( int i = 0; i < frase.length(); i++) {



                if (frase.charAt(i) == letra) {
                    veces++;
                    System.out.println("La posicion en la palabra es " + i);
                   
                }
            }  
            System.out.println("El numero de veces que se repite es: "+veces);

        } catch (IOException ex) {
            Logger.getLogger(Apariciones.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
