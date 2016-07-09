package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Personas {

    public static void imprimePersonas(String[] personas) {
        System.out.println("Estas son las personas dentro del array");
        for (int i = 0; i < personas.length; i++) {
            System.out.println(i + "." + personas[i]);
        }

    }

    public static void pares(String[] personas) {
        System.out.println("Estas son las personas en posiciones pares del array");
        for (int i = 0; i < personas.length; i++) {

            if (i % 2 == 0) {
                System.out.println(i + "." + personas[i]);
                
            }

        }
       
    }

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            String[] persona = new String[20];

            for (int i = 0; i < persona.length; i++) {

                System.out.print("Introduce el nombre de la persona "+(i+1)+" de "+persona.length+":");
                persona[i] = teclado.readLine();

            }
            imprimePersonas(persona);
            pares(persona);
        } catch (IOException ex) {
            Logger.getLogger(Personas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
