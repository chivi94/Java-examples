package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Nombres {

    static BufferedReader teclado;

    public static void main(String[] args) {
        try {
            String[] name = {"Juan", "Luis", "María", "Nuria", "Oscar", "Toni", "Yolanda"};
            String dato = "";
            teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduce nombre a buscar:");

            dato = teclado.readLine();

            
            int pos = Arrays.binarySearch(name, dato);
            if(pos>=0){
                System.out.println("Dato encontrado en la posición "+(pos+1));
            }else{
                System.out.println("Dato no encontrado");
            }
           
        } catch (IOException ex) {
            Logger.getLogger(Nombres.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
