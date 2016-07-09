package Pruebas;

import java.util.*;

// Simulacion de una cola de impresion implementada con una LinkedList:
// En esta cola se van añadiendo los archivo a imprimir por el final
// y se van imprimiendo por orden de llegada.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploCola {

    public static BufferedReader teclado;

    public static void main(String[] args) throws IOException {

        try {
            teclado = new BufferedReader(new InputStreamReader(System.in)); //acceso al teclado
            LinkedList cola = new LinkedList();

            // llenamos la cola con nombres de archivos
            String texto = "";
            System.out.println("Que archivos quieres imprimir? <fin> para terminar.");

            while (!texto.equalsIgnoreCase("fin")) {
                texto = teclado.readLine();
                if (!texto.equalsIgnoreCase("fin")) {
                    cola.addLast(texto);
                }
            }

            // mostramos el contenido de la cola
            System.out.println("Archivos pendientes de imprimir: " + cola);

            // vaciamos la cola
            String respuesta = "";
            System.out.print("Deseas imprimir? (S/N): ");
            respuesta = teclado.readLine();

            while (!respuesta.equalsIgnoreCase("N")) {
                if (respuesta.equalsIgnoreCase("S")) {
                    if (cola.size() == 0) {
                        System.out.println("Cola vacia");
                    } else {
                        System.out.println("Imprimiendo: " + cola.removeFirst());
                    }
                }

                System.out.print("Deseas imprimir? (S/N): ");
                respuesta = teclado.readLine();
            }

            System.out.println("La aplicacion ha acabado. Queda por imprimir: " + cola);

        } catch (IOException ex) {
            System.out.println("Error");
        }
    }
}
