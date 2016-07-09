
package Excepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ejemplo {
    
    static BufferedReader teclado;
    //método que devuelve cierto si el parámetro recibido en un número y falso en caso contrario
    public static boolean esNumero(String s){
        try{
            Integer.parseInt(s);
            return true;//devuelve cierto si lo introducido por teclado es un valor númerico
        }catch(NumberFormatException ex){//la excepción salta si el parseado falla(si lo introducido no es un número)
            return false;
        }
        
    }
    
    public static void main(String[] args) {
        try {
            teclado=new BufferedReader(new InputStreamReader(System.in));
            String s;
            do{//Repite esto mientras el método esNumero sea falso(que lo introducido por teclado no sea un número)
            System.out.print("Introduce un número:");
            s=teclado.readLine();
            }while(esNumero(s)==false);
            
            System.out.print("Introduce edad:");
            //int edad=pedirNumero();
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Ejemplo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
