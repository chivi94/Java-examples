
package EjerciciosTema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio25 {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Introduce número deseado:");
            int num=Integer.parseInt(teclado.readLine());
            int pot=1;
            
            while(num>10||num<1){
                System.out.print("Incorrecto,introduce número entre 1 y 10:");
                num=Integer.parseInt(teclado.readLine());
                
                }
            
            while(pot<=1000){
                if (num == 1) {
                    System.out.println(pot);
                    pot = 10000;
                }else{
                System.out.println("El número introducido "+num+" tiene como pontencias menores de 1000="+pot);
                pot*=num;
                }
            }
                
              
          
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio25.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
