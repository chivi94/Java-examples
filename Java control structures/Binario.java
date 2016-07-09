
package EjerciciosTema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Binario {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduce primer número:");
            int b1=Integer.parseInt(teclado.readLine());
            System.out.println("Introduce segundo número:");
            int b2=Integer.parseInt(teclado.readLine());
            System.out.println("Introduce tercer número:");
            int b3=Integer.parseInt(teclado.readLine());
            int suma=0;
            if(b1==0||b1==1){
                suma=b1;
            }else{
                System.out.print("El número introducido "+b1+" no es válido"
                        + "introduce un 0 ó un 1");
            }
            if(b2==0||b2==1){
                suma=(2*1*b2)+b1;
            }else{
                System.out.print("El número introducido "+b2+" no es válido"
                        + " introduce un 0 ó un 1");
            }
            if(b3==0||b3==1){
                suma=(2*2*b3)+(2*1*b2)+b1;
                System.out.print("El número binario "+b1+b2+b3+" pasado a decimal es el número="+suma);
            }else{
                System.out.println("El número introducido "+b3+" no es válido"
                        + "introduce un 0 ó un 1");
            }
           
            
            
            
            
            
        } catch (IOException ex) {
            System.err.println("Error");
        }
    }
    
}
