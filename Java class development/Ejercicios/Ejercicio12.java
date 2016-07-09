/*12. Escribir un programa Coordenadas que utilice métodos para convertir coordenadas polares en rectangulares.
Donde O es el origen de coordenadas, r es la distancia de O al punto P (dado por las coordenadas x e y) y ө es el ángulo 
formado por el vector que apunta a P y el eje X (en radianes).
La conversión de coordenadas se hace mediante las fórmulas:
x = r cos ө
y = r sen ө
Se recibirá por teclado la distancia al punto (r) y el ángulo en grados*/
package Ejercicios;

import java.io.*;

public class Ejercicio12 {

    public static double obtenerX(double distancia, double ang) {        
        return distancia * Math.cos(ang);
    }

    public static double obtenerY(double distancia, double ang) {        
        return distancia * Math.sin(ang);
    }

    public static void main(String args[]) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Distancia al punto: ");
            double r = Double.parseDouble(teclado.readLine());

            System.out.print("Angulo en grados: ");
            double angulo = Double.parseDouble(teclado.readLine());

            double radianes = Math.toRadians(angulo); //convertimos el angulo de grados a radianes

            //mostramos el resultado
            System.out.println("(x,y)=(" + obtenerX(r, radianes) + "," + obtenerY(r, radianes) + ")");
        } catch (IOException ex) {
            System.err.println("Error");
        }
    } 
} 

