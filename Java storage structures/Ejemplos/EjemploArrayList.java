package Ejemplos;

import java.util.*;

// Cosas que se pueden hacer con todas las colecciones
public class EjemploArrayList {

    public static void main(String[] args) {

        // creamos un ArrayList
        Collection <String> lista = new ArrayList <String> () ; // puede contener objetos de
                                            // cualquier tipo (Object)

        // consultamos si la coleccion esta vacia
        System.out.println("Esta vacia? " + lista.isEmpty()); // true

        // la llenamos de objetos (cadenas)
        // al igual que los arrays, las colecciones tambien estan basadas en 0
        lista.add(new String("uno"));
        lista.add(new String("dos"));
        lista.add(new String("tres"));
        lista.add(new String("cuatro"));

        // mostramos el contenido del ArrayList
        System.out.println(lista);

        System.out.println("Numero de elementos: " + lista.size()); // 4

        // Convertimos la lista en un array de objetos (String).
        // Primero creamos el array y luego le llenamos con el metodo apropiado
        Object arr[] = new String[lista.size()];
        arr = lista.toArray();

        System.out.println("Contenido del array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Elemento " + i + ": " + arr[i].toString());
        }

        // Añadimos una nueva coleccion a la ya creada

        Collection lista2 = new ArrayList();
        lista2.add(new String("cinco"));
        lista2.add(new String("seis"));

        lista.addAll(lista2);

        System.out.println(lista);

        // Buscamos en la lista un objeto determinado
        System.out.println("Esta \"cinco\"? " + lista.contains(("cinco"))); // true

        // Buscamos una coleccion en otra
        System.out.println("Esta lista2 en lista? " + lista.containsAll(lista2)); // true
        System.out.println("Esta lista en lista2? " + lista2.containsAll(lista)); // false

        // Eliminamos un elemento de la lista
        System.out.println("Eliminado \"uno\"?: " + lista.remove("uno"));
        System.out.println("Eliminado \"nueve\"?: " + lista.remove("nueve"));

        System.out.println(lista);

        // Eliminamos una coleccion de otra
        lista.removeAll(lista2);
        System.out.println(lista);

        // Recorremos la lista con un iterador
        System.out.println("Lista de elementos: Iterator");

        Iterator it = lista.iterator();

        while (it.hasNext()) {
            // hacemos casting
            System.out.println(it.next());
        }

        // Vaciamos la lista
        lista.clear();
        System.out.println(lista);
    }
}
