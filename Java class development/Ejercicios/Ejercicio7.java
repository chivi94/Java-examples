//7. Escribir un programa Primo que muestre si un número dado por el usuario es primo o no. Crear para ello un método llamado esPrimo.
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio7 {
        //Metodo que devuelve true o false en funcion del tipo de numero que se introduce por teclado
  public static boolean esPrimo (int num){
        /*Recorro todos los numeros entre el 1 y el numero (no incluidos)
         * en el momento que uno de esos numeros sea divisible por el numero a comprobar,
         * el numero no es primo (salgo del bucle):NO ES NECESARIO LLEGAR HASTA EL FINAL
         */
     
        boolean continua=true;
        int prim=2;
        while ((prim < num) && (continua==true)) {
            if(num%prim==0){
                continua=false;
            } else {
                prim++;//comprobamos el siguiente número
            }
        }
         return continua ;
    }

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduce un numero:");
            int opcion = Integer.parseInt(teclado.readLine());

            String primos = (esPrimo(opcion) == true) ? "primo" : "no primo";
            System.out.println("El numero introducido por teclado es " + primos);

        } catch (IOException ex) {
            Logger.getLogger(Ejercicio7.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
