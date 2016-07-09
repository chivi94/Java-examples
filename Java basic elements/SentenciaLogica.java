
package EjerciciosTema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SentenciaLogica {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Introduzca número deseado: ");
            
            int x=Integer.parseInt(teclado.readLine());
            
            boolean menorCero=(x<0);
            boolean entreCeroYCien=(0<=x)&&(x<=100);
            boolean mayorCien=(x>100);
            
            System.out.println(x+"<0: "+menorCero);
            System.out.println(">=0 "+x+" <=100: "+entreCeroYCien);
            System.out.println(x+">100: "+mayorCien);
//            String tipo=(x<0)?x+"<0":((x>=0)&&(x<=100))?"0<="+x+"<=100":x+">100";
            
//            System.out.print("El numero introducido se clasifica dentro del grupo:\n"+tipo);
        } catch (IOException ex) {
            Logger.getLogger(SentenciaLogica.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
