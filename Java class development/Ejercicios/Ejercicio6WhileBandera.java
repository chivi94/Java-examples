/*Escribir un programa Areas que permita al usuario elegir el cálculo del área de cualquiera de las siguientes figuras geométricas: círculo, cuadrado, rectángulo o triángulo, 
 mediante métodos. Para ello muestra al usuario un menú.*/
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio6WhileBandera {

    public static double Circulo(double radio) {

        double areaC = Math.PI * (Math.pow(radio, 2));
        return areaC;
    }

    public static double Cuadrado(double lado) {

        double areaCu = Math.pow(lado, 2);
        return areaCu;
    }

    public static double Rectangulo(double base, double altura) {

        double areaR = (double) base * (double) altura;
        return areaR;
    }

    public static double Triangulo(double base, double altura) {

        double areaT = ((double) base * (double) altura) / 2;
        return areaT;
    }

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            String respuesta = null;
            boolean continua = true;

            while (continua) {
                System.out.print("------------------------------"
                        + "\n¿Qué área quieres calcular?:"
                        + "\nCírculo"
                        + "\nCuadrado"
                        + "\nRectángulo"
                        + "\nTriángulo"
                        + "\nIntroduce cualquier otra cosa para terminar el programa(vale un ENTER)"
                        + "\nNo pongas tildes ni signos de puntuación."
                        + "Introduce petición:");
                respuesta = teclado.readLine();

                if ("circulo".equals(respuesta)) {
                    System.out.println("HAS ELEGIDO CALCULAR AREA DEL CIRCULO"
                            + "\n------------------------------");
                    System.out.print("Introduce el radio del círculo:");
                    double radio = Double.parseDouble(teclado.readLine());

                    System.out.println("Siendo la fórmula del cálculo del área del círculo 'pi x radio^2',el resultado es= " + Circulo(radio));
                } else if ("cuadrado".equals(respuesta)) {
                    System.out.println("HAS ELEGIDO CALCULAR AREA DEL CUADRADO"
                            + "\n------------------------------");
                    System.out.print("Introduce el lado del cuadrado:");
                    double lado = Double.parseDouble(teclado.readLine());

                    System.out.println("Siendo la fórmula del cálculo del área del cuadrado 'lado x lado',el resultado es= " + Cuadrado(lado));
                } else if ("rectangulo".equals(respuesta)) {
                    System.out.println("HAS ELEGIDO CALCULAR AREA DEL RECTANGULO"
                            + "\n------------------------------");

                    System.out.print("Introduce la base del rectángulo:");
                    double base = Double.parseDouble(teclado.readLine());
                    System.out.print("Introduce la altura del rectángulo:");
                    double altura = Double.parseDouble(teclado.readLine());

                    System.out.println("Siendo la fórmula del cálculo del área del rectángulo 'base x altura',el resultado es= " + Rectangulo(base, altura));
                } else if ("triangulo".equals(respuesta)) {
                    System.out.println("HAS ELEGIDO CALCULAR AREA DEL TRIANGULO"
                            + "\n------------------------------");

                    System.out.print("Introduce la base del triángulo:");
                    double base = Double.parseDouble(teclado.readLine());

                    System.out.print("Introduce la altura del triángulo:");
                    double altura = Double.parseDouble(teclado.readLine());

                    System.out.println("Siendo la fórmula del cálculo del área del triángulo '(base x altura)/2',el resultado es= " + Triangulo(base, altura));

                } else {
                    continua = false;
                    System.out.println("Fin del programa");
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(Ejercicio6WhileBandera.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
