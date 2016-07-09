package EjerciciosTema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculo {

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduce primer numero:");
            float numero1 = Float.parseFloat(teclado.readLine());
            System.out.println("Introduce segundo numero:");
            float numero2 = Float.parseFloat(teclado.readLine());

            float suma = numero1 + numero2;
            float resta = numero1 - numero2;
            float multiplicacion = numero1 * numero2;
            float division = numero1 / numero2;
            float resto = numero1 % numero2;

            System.out.println("El resultado de los numeros es el siguiente:\n"
                    + "Suma:" + suma + " Resta:" + resta + " Multiplicacion:" + multiplicacion
                    + " Division:" + division + " Resto de la division:" + resto);







        } catch (IOException ex) {
            Logger.getLogger(Calculo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
