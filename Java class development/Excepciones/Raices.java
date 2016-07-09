package Excepciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Raices {

    static BufferedReader teclado;

    public static void main(String[] args) throws Exception {
        //acceso al teclado
        teclado = new BufferedReader(new InputStreamReader(System.in));
        double a, b, c;

        // Pedimos los coeficientes de la ecuacion de 2º grado.
        System.out.println("Coeficientes de la ecuacion de 2º grado");

        System.out.print("a= ");
        a = Double.parseDouble(teclado.readLine());

        System.out.print("b= ");
        b = Double.parseDouble(teclado.readLine());

        System.out.print("c= ");
        c = Double.parseDouble(teclado.readLine());

        try {
            calcularRaices(a, b, c);
        } catch (NoRaicesReales e) {
            System.out.println(e.getMessage());
        } catch (CoeficienteAcero e) {
            System.out.println(e.getMessage());
        }

    }

    public static void calcularRaices(double a, double b, double c) throws NoRaicesReales,
            CoeficienteAcero {

        double discr;
        double r1, r2;

        if (b * b - 4 * a * c < 0) {
            throw new NoRaicesReales(" discriminante negativo", a, b, c);
        }

        if (a == 0) {
            throw new CoeficienteAcero("No ecuacion de segundo grado");
        }

        //todo bien llegamos hasta este punto
        discr = Math.sqrt(b * b - 4 * a * c);
        r1 = (-b + discr) / (2 * a);
        r2 = (-b - discr) / (2 * a);

        System.out.println("Raices de la ecuacion");
        System.out.println("r1= " + r1 + " r2= " + r2);

    }
}
