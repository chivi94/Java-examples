package Ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EjemploTeclado {

    public static void main(String[] args) {
        try {

//            System.out.println("Introduce nombre: ");
//            char letra = (char) System.in.read();//lee un caracter
//            System.out.println("Has introducido el nombre " + letra);//muestra un caracter

            //leemos cadenas de caracteres
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Introduce nombre: ");
            String nombre=teclado.readLine();
            System.out.print("Introduce apellidos: ");
            String apellidos=teclado.readLine();
            System.out.println("Has introducido el nombre "+nombre+" "+apellidos);
            
            
                   

        } catch (IOException ex) {
            Logger.getLogger(EjemploTeclado.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
