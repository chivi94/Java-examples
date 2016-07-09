/*
 Hacer un programa que pida al usuario una frase y una subcadena, y de como
 resultado el número de ocurrencias de la subcadena en la frase y las 
 posiciones en las que se encuentra esa letra en la frase
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AparicionesSubCadena {
    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Introduzca una frase: ");
            String frase = teclado.readLine();

            System.out.print("Introduzca una letra o una subcadena de la frase anterior: ");
            String buscarfrase = teclado.readLine();

            System.out.println("Las posiciones en las que aparece la letra o subcadena elegida(" + buscarfrase + ")son:");

            int pos = frase.indexOf(buscarfrase, 0);
            int cont= 0;
            
            while (pos > -1) {
                cont++;
                System.out.println(pos+" ");
                pos = frase.indexOf(buscarfrase, pos+1);

        }
            System.out.println("La letra o subcadena (" + buscarfrase + ") ha aparecido " + cont + " veces");

        } catch (IOException ex) {
            Logger.getLogger(Apariciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    
    

