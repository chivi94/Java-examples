
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class InvertirNumeroBis {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            String sInvertida="";
            System.out.println("Introduce un número:");
            int num=Integer.parseInt(teclado.readLine());
            String s=String.valueOf(num);
            for (int i =s.length()-1; i>=0; i--) {
                sInvertida=sInvertida+s.charAt(i);
                
            }
            System.out.println("La inversion del numero "+num+" es=>"+sInvertida);
        } catch (IOException ex) {
            Logger.getLogger(InvertirNumeroBis.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }
    
}
