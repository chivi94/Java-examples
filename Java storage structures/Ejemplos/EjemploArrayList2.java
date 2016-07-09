package Ejemplos;

import java.util.*;

// Cosas que se pueden hacer con las listas
public class EjemploArrayList2 {

    public static void main(String[] args) {

        // Creamos un ArrayList
        List lista = new ArrayList();

        // Consultamos si la coleccion esta vacia
        System.out.println("Esta vacia? " + lista.isEmpty()); // true

        // La llenamos de objetos (cadenas)
        lista.add(new String("uno"));
        lista.add(new String("dos"));
        lista.add(new String("cuatro"));
        lista.add(2, new String("tres"));   // añadimos la cadena "tres" en la
                                            // tercera posicion del ArrayList
                                            // al igual que los arrays, tambien estan basados en 0
        lista.add(0, new String("cero"));   // añadimos la cadena "cero" en la
                                            // primera posicion del ArrayList

        // IMPORTANTE: observar que al insertar un objeto en una posicion
        // ya ocupada, el objeto existente no se sobreescribe, sino
        // que se desplaza una posicion para dejar espacio al nuevo objeto

        System.out.println("Lista de elementos");
        System.out.println(lista);

        // Consultamos el numero de elementos de la coleccion
        System.out.println("Numero de elementos: " + lista.size()); // 4

        // Accedemos a un elemento determinado -> Método get
        System.out.println("Primer elemento: " + lista.get(0)); // Acceso al primer elemento

        // Recorremos la lista con un iterador: ListIterator
        System.out.println("Lista de elementos: ListIterator");

        ListIterator it = lista.listIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Buscamos en la lista un objeto determinado
        System.out.println("Esta \"cinco\"? " + lista.indexOf("cinco")); // -1 (no encontrado)
        System.out.println("El objeto \"dos\" se encuentra en la posicion: "
                + lista.indexOf("dos"));

        System.out.println("Esta \"tres\"? " + lista.contains("tres")); // true

        // Eliminamos el primer objeto y lo comprobamos viendo si devuelve true
        System.out.print("Eliminamos el primer objeto: ");
        boolean borrado = lista.remove("cero");
        System.out.println(borrado);

        // Sustituimos un elemento por otro: quitamos "tres" y ponemos en su
        // lugar "3"
        String nuevo = "3";
        String antiguo = (String) lista.set(2, nuevo);
        System.out.println("Hemos cambio el elemento " + antiguo + " por "
                + nuevo);

        // Eliminamos un elemento mas de la lista, pero ahora indicando su
        // posicion
        lista.remove(1); // Elimina el elemento de la posici�n 1 -> dos

        System.out.println("Lista de elementos");
        System.out.println(lista);

    }
}
