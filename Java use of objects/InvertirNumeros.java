
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class InvertirNumeros {
    public static void main(String[] args) {
        try {
            String s1Invertida="";
            BufferedReader teclado =new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduce numero:");
            int num=Integer.parseInt( teclado.readLine());
            String s1=String.valueOf(num);
            for (int i = s1.length()-1; i >=0; i--) {
               s1Invertida = s1Invertida+s1.charAt(i);
              
            }
            System.out.println("La inversion del numero "+num+" es: "+s1Invertida);
        } catch (IOException ex) {
            Logger.getLogger(InvertirNumeros.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
            
    
}
