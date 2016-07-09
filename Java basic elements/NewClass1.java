
package Ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class NewClass1 {
    public static void main(String[] args){
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
           
            System.out.print("Dime tu nombre:");
            String nombre=teclado.readLine();
            System.out.print("Dime tus apellidos:");
            String apellidos=teclado.readLine();
            System.out.print("Dime tu edad:");
            String edad=teclado.readLine();
            System.out.println("Tu nombre es: "+nombre+" Tus apellidos son:"+apellidos+" Tu edad es:"+edad);
        } catch (IOException ex) {
            Logger.getLogger(NewClass1.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
    }
    
}
