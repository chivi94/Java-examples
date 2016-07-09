
package Ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SignoNumero {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduce un número:");
            double numero1=Double.parseDouble(teclado.readLine());
            if(numero1>0) System.out.println("Positivo");
            if(numero1<0)System.out.println("Negativo");
            if(numero1==0)System.out.println("El numero es 0");//comprueba las 3,pero solo muestra la que se cumple
            
        } catch (IOException ex) {
            Logger.getLogger(SignoNumero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
