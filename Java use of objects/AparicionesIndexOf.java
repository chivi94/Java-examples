package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AparicionesIndexOf {

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));



            System.out.print("Introduzca una frase: ");
            String frase = teclado.readLine();

            System.out.print("Introduzca una letra: ");
            char letra = teclado.readLine().charAt(0);

            System.out.println("Las posiciones en las que aparece la letra elegida (" + letra + ")");

            int pos = frase.indexOf(letra, 0);
            int cont= 0;
            
            while (pos > -1) {
                cont++;
                System.out.println(pos+" ");
                pos = frase.indexOf(letra, pos + 1);

        }
            System.out.println("La letra (" + letra + ") ha aparecido " + cont + " veces");

        } catch (IOException ex) {
            Logger.getLogger(Apariciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


    
