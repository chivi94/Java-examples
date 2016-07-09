
package Ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CompararLetras {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Introducir un caracter:");
            char letra=(char) teclado.read();
            
            //String resultado=(letra>=65&&letra<=90)?"mayúscula":"minúscula";
            String resultado=(letra>=0&&letra<=127)?"no imprimible":
                    (letra>=32&&letra<=47)?"de puntuación":"otro";
           
            System.out.println("Has introducido un caracter "+resultado);
            
        } catch (IOException ex) {
            Logger.getLogger(CompararLetras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
