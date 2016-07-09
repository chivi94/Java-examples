
package EjerciciosTema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GetCharFromASCIICode {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Introduce números del 00 al 255:");
            int caracter=Integer.parseInt(teclado.readLine());
            char letra=(char)caracter;
            System.out.println("El caracter perteneciente al código introducido es:"+letra);
        } catch (IOException ex) {
            Logger.getLogger(GetCharFromASCIICode.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
