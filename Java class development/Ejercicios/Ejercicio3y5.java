//﻿3. Escribir un método llamado toFahrenheit que convierta una temperatura dada en grados Celsius a grados Fahrenheit. 
//La fórmula de conversión es:
//F = 9 / 5 C + 32
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ejercicio3y5 {
    
    public static double toFarenheit(double gradosC){
        
        double f=((double)9 / 5)*gradosC+ 32; 
        return f;
    }
    
    /* 5.Escribir un método llamado par que dado un número entero devuelva un booleano con valor true si dicho número es par y false en caso 
      contrario.*/
     
    public static boolean par(int n){
        boolean esPar=true;
        
        if(n%2!=0){
            esPar=false;
        }
        return esPar;
    }
    public static boolean par2(int n){
        
        
        if(n%2!=0){
            return false;
        }
        return true;
    }
    public static boolean par3(int n){
        boolean esPar;
        
        if(n%2==0){
            esPar=true;
        }else{
            esPar=false;
        }
        return esPar;
    }
    
    
    
    //Prueba de los métodos creados anteriormente
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Introduce grados centígrados: ");
            
            double c=Double.parseDouble(teclado.readLine());
            System.out.println("Grados Farenheit equivalentes: "+ toFarenheit(c));
            String s=(par((int)c)==true)?"Si":"No";
            System.out.println("¿Ese número de grados es par?: "+ s);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio3y5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
