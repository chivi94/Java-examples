/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gonriniv
 */
public class Suma {
    //Método que devuelve la suma de dos enteros recibidos como parámetros
    public static int suma(int a,int b){//si se declara una variable local 'a' o 'b',el valor de dicha variable pisa al valor introducido por teclado      
        int suma=a+b;
        return suma;
    }
    
    
    
    
    //Realizacion de una suma de dos numeros introducidos por el usuario mediante un metodo
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Numero 1: ");
            int numero1=Integer.parseInt(teclado.readLine());
            
            System.out.println("Numero 2: ");
            int numero2=Integer.parseInt(teclado.readLine());
            
            int resultado=suma(numero1,numero2);
            System.out.println("La suma de los numeros introducidos por teclado es= "+resultado);
            
        } catch (IOException ex) {
            Logger.getLogger(Suma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
