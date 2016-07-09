
package EjerciciosTema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Notas {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduce una calificación:");
            int nota=Integer.parseInt(teclado.readLine());
            
            switch(nota){
                case 0:case 1:case 2:
                    System.out.println("MD");
                    break;
                case 3: case 4: 
                    System.out.println("I");
                    break;
                case 5:
                    System.out.println("A");
                    break;
                case 6:
                    System.out.println("B");
                    break;
                case 7: case 8:
                    System.out.println("N");
                    break;
                case 9: case 10:
                    System.out.println("SB");
                    break;
                default:
                    System.out.println("Error");
                
            }
            
            
            
            
            
            
        } catch (IOException ex) {
            System.out.println("Error");
        }
        
    }
    
}
