
package EjerciciosTema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ejercicio19 {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            int cont=0;
            System.out.println("Introduce la frase que quieras: ");
            String frase=teclado.readLine();
            cont++;
            System.out.println("¿Quieres continuar S/N? ");
            char respuesta=teclado.readLine().charAt(0);
            
            
            while(respuesta=='S'||respuesta=='s'){
                System.out.println("Introduce la frase que quieras: ");
                frase=teclado.readLine();
                cont++;
                System.out.println("¿Quieres continuar S/N? ");
                respuesta=teclado.readLine().charAt(0);
                
            
        }
            System.out.println("Fin del programa.El número de frases introducidas es= "+cont);   
            
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio19.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
