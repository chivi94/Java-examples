/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejemplos;

import java.util.Arrays;

/**
 *
 * @author Ivan
 */
public class BusquedaBinaria {
    
    public static void main(String[] args) {
        int[]array={1,3,5,7,9};
        //int[]array={3,5,1,9,2};binarySearch()para desordenado
        
        int dato=3;
        //int dato=2;dato que no está en el array ordenado.Devuelve un número negativo
        int pos=Arrays.binarySearch(array, dato);
        System.out.println(pos);
        
    }
    
}
