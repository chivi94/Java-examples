
package EjerciciosTema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Minutos {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduzca un número de segundos:");
            
            int segundos_inicio=Integer.parseInt(teclado.readLine());
            int minutos=segundos_inicio/60;
            int segundos=segundos_inicio%60;
            System.out.println(segundos_inicio+" segundos,pasados a minutos y segundos son: "+minutos+"m "+segundos+"s ");
            
           
            
            
            
                    
            System.out.println("El resultado en minutos y segundo es:");
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Minutos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
