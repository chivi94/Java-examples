
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Letra_alternativa {

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
           

            System.out.println("Introduce un nombre");
            String s1 = teclado.readLine();
            int inicio = 0;
            int fin = s1.length() - 1;
            while(inicio<=fin){
                if(inicio!=fin){
                System.out.print(s1.charAt(inicio));
                inicio++;
                
                System.out.print(s1.charAt(fin));
                fin--;
                }else{
                    System.out.println(s1.charAt(inicio));
                    inicio++;
                }
                
            }

        } catch (IOException ex) {
            Logger.getLogger(Letra_alternativa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}