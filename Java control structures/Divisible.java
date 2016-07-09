package Ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Divisible {

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduce numero 1:");
            int numero1 = Integer.parseInt(teclado.readLine());
            System.out.println("Introduce numero 2:");
            int numero2 = Integer.parseInt(teclado.readLine());
            
            int resto=numero1%numero2;
            if(resto==0){
                System.out.println("El numero "+numero1+" es divisible entre el numero "+numero2);
             }else{
                System.out.println("No es divisible");
                
            } 
        }catch (IOException ex) {
             System.err.println("Error");
            Logger.getLogger(Divisible.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
