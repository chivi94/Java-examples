package Practicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CombinacionesYPermutaciones {

    public static void main(String[] args) {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        String opcion = null;
        try {
            do {
                //Pedimos al usuario que es lo que quiere hacer
                System.out.print("¿Que quieres hacer,combinación(con repetición) o permutación(sin repetición),de los números"
                        + " 1,2,3 y 4:");
                opcion = teclado.readLine();

                //Si el usuario introduce algo distinto a esto,vuelve a pedir que introduzca lo que quiere hacer 
            } while (!"permutacion".equals(opcion) && !"Permutacion".equals(opcion)
                    && !"combinacion".equals(opcion) && !"Combinacion".equals(opcion));

            //Bucles para los números del 1 al 4,ambos inclusive
            for (int i = 1; i <= 5; i += 1) {
                for (int j = 1; j <= 5; j += 1) {
                    for (int k = 1; k <= 5; k += 1) {
                        for (int l = 1; l <= 5; l += 1) {
                            for (int m =1 ; m <= 5; m += 1) {

                                //Permutación
                                if ("permutacion".equals(opcion) || "Permutacion".equals(opcion)) {
                                    if (i != j && i != k && i != l && i != m && j != k && j != l && j != m && k != l && k != m && l != m) {
                                        System.out.println(i + " " + j + " " + k + " " + l + " " + m);
                                    }
                                } else {//Opción de combinación
                                    System.out.println(i + " " + j + " " + k + " " + l + " " + m);

                                }//else de la combinacion

                            }//for del número 4
                        }//for del número 3

                    }//for del número 2

                }//for del número 1
            }

        } catch (IOException ex) {
            Logger.getLogger(CombinacionesYPermutaciones.class.getName()).log(Level.SEVERE, null, ex);
        }//catch
    }//psvm
}//class
