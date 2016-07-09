
package EjerciciosTema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Nota {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduce nota");
            int nota=Integer.parseInt(teclado.readLine());
            
            if (nota>100){
                System.out.println("Alta");
            }else{
                System.out.println("Baja");
            }
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Nota.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }
    
}
