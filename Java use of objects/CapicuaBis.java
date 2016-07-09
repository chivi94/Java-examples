
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CapicuaBis {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduce el numero: ");
            int num=Integer.parseInt((teclado.readLine()));
            String sNum=String.valueOf(num);
            
            int longCadena=sNum.length();
            
            boolean capicua=true;
            for(int i=0;i<(longCadena/2);i++){
                if(sNum.charAt(i)!=sNum.charAt(longCadena-1-i)){
                    capicua=false;
                }
            }
            if(capicua) System.out.println("El numero "+num+" es capicua");
            else System.out.println("El numero "+num+" no es capicua");
        } catch (IOException ex) {
            Logger.getLogger(CapicuaBis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
