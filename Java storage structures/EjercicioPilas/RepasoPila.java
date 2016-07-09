/*Partiendo de dos pilas de números enteros, la primera ordenada ascendentemente 
 desde la cima hasta el fondo, y la segunda ordenada descendentemente desde la cima
 hasta el fondo, realiza un programa que fusione ambas pilas en una tercera ordenada
 descendentemente desde la cima hasta el fondo.

 NOTAS: 
 - Los tamaños de las dos pilas iniciales, se generarán aleatoriamente entre 1 y 20.
 - Igualmente, los contenidos de las pilas de partida, se generarán aleatoriamente entre 1 y 100.
 - No se puede utilizar ninguna pila auxiliar para realizar la fusión de las pilas.*/
package EjercicioPilas;

import java.util.Collections;
import java.util.LinkedList;

public class RepasoPila {

    public static void llenar(LinkedList<Integer> pila) {
        int t = (int) (20 * Math.random() + 1);//Tamaño de la pila

        for (int i = 0; i < t; i++) {
            pila.addFirst((int) (100 * Math.random() + 1));
        }
        Collections.sort(pila);
    }//Para la pila 1

    public static void llenarDesc(LinkedList<Integer> pila) {
        llenar(pila);
        Collections.reverse(pila);

    }//Para la pila 2

    public static LinkedList<Integer> fusionar(LinkedList<Integer> pila1, LinkedList<Integer> pila2) {
        //Creamos la pila fusionada
        LinkedList<Integer> pila3 = new LinkedList();
        //Para poder fusionar las dos pilas en una pila ordenada,primero tenemos que tener las dos pilas ordenadas de la misma forma
        //Ordenamos la pila2
        Collections.sort(pila2);

        while (!pila1.isEmpty() && !pila2.isEmpty()) {
            if (pila1.getFirst() <= pila2.getFirst()) {
                pila3.addFirst(pila1.removeFirst());
            } else {
                pila3.addFirst(pila2.removeFirst());
            }
        }
            while (!pila2.isEmpty()) {
                pila3.addFirst(pila2.removeFirst());
            }
            while (!pila1.isEmpty()) {
                pila3.addFirst(pila1.removeFirst());
            }

        
        return pila3;
    }

    public static void main(String[] args) {
        LinkedList<Integer> pila1 = new LinkedList();
        LinkedList<Integer> pila2 = new LinkedList();

        llenar(pila1);
        llenarDesc(pila2);
        //Mostramos las pilas
        System.out.println("Pila 1:" + pila1);
        System.out.println("Pila 2:" + pila2);
        //Fusionamos las pilas
        LinkedList<Integer> pila3 = fusionar(pila1, pila2);
        //Mostramos la pila fusionada
        System.out.println("¡Fusión!");
        System.out.println(pila3);
    }

}
