
package EjerciciosTema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GetASCIICodeFromChar {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduce una palabra:");
            char letra=teclado.readLine().charAt(0);
            int ASCII=(int)letra;
            
            
            
            System.out.println("El código ASCII del primer caracter de la palabra es:"+ASCII);
        } catch (IOException ex) {
            Logger.getLogger(GetASCIICodeFromChar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
