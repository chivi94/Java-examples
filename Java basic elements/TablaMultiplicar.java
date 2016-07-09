
package EjerciciosTema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TablaMultiplicar {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            
            System.out.print("Introduce el número: ");
            int numero=Integer.parseInt(teclado.readLine());
            
            int multiplicando0=numero*0;
            int multiplicando1=numero*1;
            int multiplicando2=numero*2;
            int multiplicando3=numero*3;
            int multiplicando4=numero*4;
            int multiplicando5=numero*5;
            int multiplicando6=numero*6;
            int multiplicando7=numero*7;
            int multiplicando8=numero*8;
            int multiplicando9=numero*9;
            int multiplicando10=numero*10;
            
            System.out.println("La tabla de multiplicar del "+numero+" es:\n"
                    +numero+"*"+"0="+multiplicando0+"\n"
                    +numero+"*"+"1="+multiplicando1+"\n"
                    +numero+"*"+"2="+multiplicando2+"\n"
                    +numero+"*"+"3="+multiplicando3+"\n"
                    +numero+"*"+"4="+multiplicando4+"\n"
                    +numero+"*"+"5="+multiplicando5+"\n"
                    +numero+"*"+"6="+multiplicando6+"\n"
                    +numero+"*"+"7="+multiplicando7+"\n"
                    +numero+"*"+"8="+multiplicando8+"\n"
                    +numero+"*"+"9="+multiplicando9+"\n"
                    +numero+"*"+"10="+multiplicando10);
        } catch (IOException ex) {
            Logger.getLogger(TablaMultiplicar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
