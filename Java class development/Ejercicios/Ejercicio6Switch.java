package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio6Switch {

    public static double areaCirculo(double r) {
        double area = Math.PI * Math.pow(r, 2);
        return area;
    }

    public static double areaCuadrado(double l) {
        double area = Math.pow(l, 2);
        return area;
    }

    public static double areaRectangulo(double b, double h) {
        double area = b * h;
        return area;
    }

    public static double areaTriangulo(double b, double h) {
        double area = ((double) b * (double) h) / 2.0;
        return area;
    }

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            String opcion = "";

            do {
                System.out.print("Elija una de las siguientes opciones:\n"
                        + "\nCirculo"
                        + "\nCuadrado"
                        + "\nRectangulo"
                        + "\nTriangulo"
                        + "\n\nENTER para salir"
                        + "\n\n\nOpcion: ");
                opcion = teclado.readLine();
                if (!"".equals(opcion)) {
                    switch (opcion) {
                        case "Circulo":
                        case "circulo":
                            System.out.print("\nIntroduzca el radio del circulo: ");
                            double r = Double.parseDouble(teclado.readLine());

                            System.out.println("El area del circulo de radio " + r + " es: " + areaCirculo(r) + "\n\n");
                            break;
                        case "Cuadrado":
                        case "cuadrado":
                            System.out.print("\nIntroduzca el lado del cuadrado: ");
                            double l = Double.parseDouble(teclado.readLine());

                            System.out.println("El area del cuadrado de lado " + l + " es: " + areaCuadrado(l) + "\n\n");
                            break;
                        case "Rectangulo":
                        case "rectangulo":
                            System.out.print("\nIntroduzca la base del rectangulo: ");
                            double b = Double.parseDouble(teclado.readLine());

                            System.out.print("Introduzca la altura del rectangulo: ");
                            double h = Double.parseDouble(teclado.readLine());

                            System.out.println("El area del rectangulo de base " + b + " y altura " + h + " es: " + areaRectangulo(b, h) + "\n\n");
                            break;
                        case "Triangulo":
                        case "triangulo":
                            System.out.print("\nIntroduzca la base del triangulo: ");
                            double bTri = Double.parseDouble(teclado.readLine());

                            System.out.print("Introduzca la altura del triangulo: ");
                            double hTri = Double.parseDouble(teclado.readLine());

                            System.out.println("El area del triangulo de base " + bTri + " y altura " + hTri + " es: " + areaTriangulo(bTri, hTri) + "\n\n");
                            break;
                        default:
                            System.out.println("\nError. Opción no válida.\n\n");
                    }
                }
            } while (!"".equals(opcion));

            System.out.println("Fin del programa.");

        } catch (IOException ex) {
            Logger.getLogger(Ejercicio6Switch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
