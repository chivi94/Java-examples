package EjerciciosTema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EstanEnOrden {

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduce número1 :");
             int num1 = Integer.parseInt(teclado.readLine());
            System.out.print("Introduce número2 :");
             int num2 = Integer.parseInt(teclado.readLine());
            System.out.print("Introduce número3 :");
             int num3 = Integer.parseInt(teclado.readLine());

            if (num1 < num2 && num2 < num3) {
                System.out.println("Los números están ordenados de forma ascendente");
            } else if (num1 > num2 && num2 > num3) {
                System.out.println("Los número están ordenados de forma descendente");

            } else {
                System.out.println("Los números están desordenados");
            }

        } catch (IOException ex) {
            Logger.getLogger(EstanEnOrden.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
