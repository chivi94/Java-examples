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

public class Pila {

    




    public static void llenarPilaAsc(LinkedList<Integer> pila) {
        int t = (int) (20 * Math.random() + 1);
        for (int i = 0; i < t; i++) {           
            pila.addFirst((int) (100 * Math.random() + 1));
        }
        Collections.sort(pila);
    }

    public static void llenarPilaDesc(LinkedList<Integer> pila) {
        llenarPilaAsc(pila);
        Collections.reverse(pila);
    }

    //Método que recibe pila1 (Asc) y pila2 (Desc)
    //y devuelve una nueva pila3 (Desc) fusión de las dos anteriores
    public static LinkedList<Integer> fusionarPilas(LinkedList<Integer> pila1, LinkedList<Integer> pila2) {
        LinkedList<Integer> pila3 = new LinkedList();

        //ordenamos la pila2 ascendentemente
        Collections.sort(pila2);

        //ahora partimos de las pila1 y pila2 ordenadas ascendentemente
        //y las fusionamos en la pila3  
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

        llenarPilaAsc(pila1);
        llenarPilaDesc(pila2);

        System.out.println("Pila1: " + pila1);
        System.out.println("Pila2: " + pila2);

        LinkedList<Integer> pila3 = fusionarPilas(pila1, pila2);
        System.out.println("Pila3 (fusión): " + pila3);
    }
}
    

