/*11. Se conocen como tripletas de Pitágorás a las (x, y, z) que cumplen que x*x + y*y = z*z. Estas tripletas pueden generarse 
a partir de dos valores de la siguiente forma:
pitagoras(s,t) = (t*t-s*s, 2*t*s, t*t+s*s). 
Escribir una clase Pitágoras con campos estáticos x,y,z y un método de clase 
void pit(int s, int t) que calcule los valores de x, y, z, a partir de 2 valores (t y s) recibidos desde el teclado.*/
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ejercicio11 {
    public static void Pitágoras(int s,int t){
        
        int x=t*t-s*s;
        int y=2*t*s;
        int z=t*t+s*s;
        
        System.out.println("Las tripletas generadas para "+s+" y para "+t+" son=>"
                +"\nx="+x
                +"\ny="+y
                +"\nz="+z);
        
    }
    
    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Este programa realiza tripletas de Pitágoras:"
                    + "\n---------------------------------------------");
            
            System.out.print("Introduce la primera incógnita:");
            int s=Integer.parseInt(teclado.readLine());
            System.out.print("Introduce la segunda incógnita:");
            int t=Integer.parseInt(teclado.readLine());
            
            Pitágoras(s,t);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio11.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
