
package EjerciciosTema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ejercicio20 {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
               System.out.println("Introduce S/N ");
               char respuesta=teclado.readLine().charAt(0);
               
               while(respuesta!='S'&&respuesta!='N'){
                   System.out.println("Incorrecto.Solo reconozco S/N");
                   System.out.println("Introduce S o N:");
                   respuesta=teclado.readLine().charAt(0);
               }
        } catch (IOException ex) {
            System.err.println("Error");
        }
    }
    
}
