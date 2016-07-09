package Ejemplos;

import java.util.Arrays;

/**
 *
 * @author Ivan
 */
public class ArrayAlturas {

    public static void main(String[] args) {

        int t = 25;

        double[] alturas;//declaración del array;
        alturas = new double[t];//creación del array;

//        alturas[0] = 1.70;
//
//        alturas[8] = 1.50;
//        
//        System.out.println(alturas[0]);
//        System.out.println(alturas[8]);
        
        //Mostrar el contenido de todo el array
        for (int i = 0; i < alturas.length; i++) {
            System.out.println(alturas[i]);
        }
        
        double[] alturas2={1.20,1.50,1.75};
        System.out.println("Tamaño del array "+alturas2.length);
        
        Arrays.fill(alturas,1.5);
        System.out.println(Arrays.toString(alturas));
        }
    }


