package EjerciciosTema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinarioAnidado {

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduzca el primer dígito de un número binario de 3 bits");
            int num2 = Integer.parseInt(teclado.readLine());

            if (num2 != 1 && num2 != 0) {
                System.out.println("El número introducido debe de ser un 0 ó un 1");

            } else {
                System.out.println("Introduzca el segundo dígito de un número binario de 3 bits");
                int num1 = Integer.parseInt(teclado.readLine());
                if (num1 != 0 && num1 != 1) {
                    System.out.println("El número introducido debe de ser un 0 ó un 1");
                } else {
                    System.out.println("Introduzca el tercer dígito de un número binario de 3 bits");
                    int num0 = Integer.parseInt(teclado.readLine());
                    if (num0 != 1 && num0 != 0) {
                        System.out.println("El número introducido debe de ser un 0 ó un 1");
                    } else {

                        int suma = (2 * 2 * num2) + (2 * 1 * num1) + num0;
                        System.out.println("El número binario(" + num2 + num1 + num0 + ")en decimal es el número=" + suma);
                    }
                }

            }

        } catch (IOException ex) {
            Logger.getLogger(BinarioAnidado.class.getName()).log(Level.SEVERE, null, ex);
        }



    }
}