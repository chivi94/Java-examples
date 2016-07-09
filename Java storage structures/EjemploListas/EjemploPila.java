package Pruebas;

import java.util.*;

//Uso de una LinkedList como una pila
public class EjemploPila {

    public static String diasSemana[] = {
        "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};

    // Vamos a crear una pila con los dias de la semana
    // contenido en el array diasSemana
    public static void main(String args[]) {
        LinkedList pila = new LinkedList();

        // apilamos los elementos
        for (int i = 0; i < diasSemana.length; i++) {
            pila.addFirst(diasSemana[i]);
        }

        System.out.println("Pila = " + pila);   // muestra la lista de elementos
                                                // como fueron introducidos

        // desapilamos
        System.out.println("Desapilando:");
        while (!pila.isEmpty()) {
            // mientras haya elementos
            System.out.println(pila.removeFirst());
        }

    }
}
