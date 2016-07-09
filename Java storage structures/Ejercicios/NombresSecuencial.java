/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivan
 */
public class NombresSecuencial {
    public static int busquedaSecuencial(String[]lista,String dato){
        int i=0;
        boolean encontrado=false;
        boolean menor=true;
        
        while((i<lista.length)&&(encontrado==false)&&(menor==true)){
            if(lista[i].compareTo(dato)==0){
                encontrado=true;
            }else if(lista[i].compareTo(dato)>0){
                menor=false;
            }
            i++;
        }
        if(encontrado){
            return i-1;
        }
        return -1;
            
                
        
        
       
        
    }
     static BufferedReader teclado;

    public static void main(String[] args) {
        try {
            String[] name = {"Juan", "Luis", "María", "Nuria", "Oscar", "Toni", "Yolanda"};
            String dato = "";
            teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduce nombre a buscar:");

            dato = teclado.readLine();

            
            int pos =busquedaSecuencial(name, dato);
            if(pos>=0){
                System.out.println("Dato encontrado en "+(pos+1));
            }else{
                System.out.println("Dato no encontrado");
            }
           
        } catch (IOException ex) {
            Logger.getLogger(Nombres.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
    
}
