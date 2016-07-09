
package EjerciciosTema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CalculoComplejo {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Introduce numero 1:");
            int numero1=Integer.parseInt(teclado.readLine());
            System.out.println("Introduce numero 2");   
            int numero2=Integer.parseInt(teclado.readLine());
            
            System.out.println("Elija operacion:suma,resta,multiplicacion,division o resto");
            String eleccion=teclado.readLine();
            
            float resultado=("suma".equals(eleccion))?(numero1+numero2):("resta".equals(eleccion))?(numero1-numero2):
                    ("multiplicacion".equals(eleccion))?(numero1*numero2):("division".equals(eleccion))?
                    ((float)numero1/(float)numero2):(numero1%numero2);
            System.out.println("El resultado es "+resultado);       
        } catch (IOException ex) {
            Logger.getLogger(CalculoComplejo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
