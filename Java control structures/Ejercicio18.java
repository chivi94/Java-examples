
package EjerciciosTema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ejercicio18 {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduce un número cualquiera:");
            int num=Integer.parseInt(teclado.readLine());
            
            int unidad=1;
            while(unidad<=num){
                System.out.println(unidad);
                unidad++;
            }
            
            
            
        } catch (IOException ex) {
            System.err.println("Error");
        }
        
        
    }
    
}
