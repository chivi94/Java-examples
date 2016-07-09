package EjerciciosTema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SistemaEcuaciones {

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Queremos resolver el siguiente sistema de ecuaciones\n"
                    + "ax + by = c\n"
                    + "dx + ey= f");
            System.out.println("Introduce valor para el coeficiente a:");

            int a = Integer.parseInt(teclado.readLine());
            System.out.print("Introduce valor para el coeficiente b:");
            int b = Integer.parseInt(teclado.readLine());
            System.out.print("Introduce valor para el coeficiente c");
            int c = Integer.parseInt(teclado.readLine());
            System.out.print("Introduce valor para el coeficiente d");
            int d = Integer.parseInt(teclado.readLine());
            System.out.print("Introduce valor para el coeficiente e");
            int e = Integer.parseInt(teclado.readLine());
            System.out.print("Introduce valor para el coeficiente f");
            int f = Integer.parseInt(teclado.readLine());
            int x, y;


            y = ((a * f) - (b * c)) / ((a * e) - (b * d));
            x = (c - (b * y) / a);



            System.out.println("El resultado del sistema es \n" + "x=" + x + "\n" + "y=" + y);







        } catch (IOException ex) {
            Logger.getLogger(SistemaEcuaciones.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
