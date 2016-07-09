/*4. Escribir un método que devuelva el divisor más grande de un entero dado (distinto del propio entero).
 NOTA: un número es divisor de otro si el resto de la división entre ambos es 0.*/
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio4 {

    public static double Divisor(int numero) {
        int mayor = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                mayor = i;
            }

        }
        return mayor;
    }
    //Otra forma de hacer el ejercicio:

    public double Divisor2(int numero) {
        int i = numero - 1;
        boolean divisor = false;
        while (i > 0 && !(divisor)) {
            if ((numero % i) == 0) {
                divisor = true;
            } else {
                i--;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduzca número:");
            int opcion = Integer.parseInt(teclado.readLine());

            System.out.println("El mayor divisor del número introducido por teclado es: " + Divisor(opcion));
            Ejercicio4 ejer4 = new Ejercicio4();//al ser un metodo no estatico,para hacer uso de el necesitamos crear un objeto
            System.out.println("El mayor divisor del número introducido por teclado es: " + ejer4.Divisor2(opcion));
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio4.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
