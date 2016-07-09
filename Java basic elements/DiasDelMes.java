
package EjerciciosTema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DiasDelMes {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduce número de mes:");
            int mes=Integer.parseInt(teclado.readLine());
            
            String resultado=(mes==1||mes==3)||(mes==5||mes==7)||(mes==8
                    ||mes==10)||(
                    mes==12)?"31":(mes==4||mes==6)||(mes==9||mes==11)
                    ?"30":"28";
            
            System.out.println("El número de días del mes introducido son:"+resultado);
             
        } catch (IOException ex) {
            Logger.getLogger(DiasDelMes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    
}
