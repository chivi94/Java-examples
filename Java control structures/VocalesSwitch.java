
package EjerciciosTema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class VocalesSwitch {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Introduce un caracter:");
            char letra=teclado.readLine().charAt(0);
            
            switch (letra){
                case 'a':
                    System.out.println("La letra introducida "+letra+" es una vocal");
                    break;//si no se pone el break,no se cierra el caso,hasta que encuentra un break
                case 'e':
                    System.out.println("La letra introducida "+letra+" es una vocal");
                    break;
                case 'i':
                    System.out.println("La letra introducida "+letra+" es una vocal");
                    break;
                case 'o':
                    System.out.println("La letra introducida "+letra+" es una vocal");
                    break;
                case 'u':
                    System.out.println("La letra introducida "+letra+" es una vocal");
                    break;
                case 'A':
                    System.out.println("La letra introducida "+letra+" es una vocal");
                    break;
                case 'E':
                    System.out.println("La letra introducida "+letra+" es una vocal");
                    break;
                case 'I':
                    System.out.println("La letra introducida "+letra+" es una vocal");
                    break;
                case'O':
                    System.out.println("La letra introducida "+letra+" es una vocal");
                    break;
                case'U':
                    System.out.println("La letra introducida "+letra+" es una vocal");
                    break;
                default:
                    System.out.println("Error");
                    
                
                
                
                
            }
            
        } catch (IOException ex) {
            Logger.getLogger(VocalesSwitch.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
