package Ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Anidados {

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));//ejercicio del signo numero con if-else anidados
            System.out.print("Introduce un número:");
            double numero1 = Double.parseDouble(teclado.readLine());

            if (numero1 > 0) {
                System.out.println("Numero positivo");
            } else if (numero1 < 0) {
                System.out.println("Numero negativo");
            } else {
                System.out.println("El numero es nulo");
            }




        } catch (IOException ex) {
            Logger.getLogger(Anidados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
