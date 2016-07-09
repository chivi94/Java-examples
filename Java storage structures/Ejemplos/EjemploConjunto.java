package Ejemplos;

import java.util.*;

public class EjemploConjunto {

    public static void pruebaConjunto(Set s) {
        //Añadimos al conjunto elementos
        s.add("uno");
        s.add("dos");
        s.add("dos");
        s.add("tres");
        s.add("tres");
        s.add("tres");

        //Le imprimimos
        System.out.println("Conjunto = " + s);

        //Buscamos un elemento
        System.out.println(s.getClass().toString() + ".contains \"uno\": " + s.contains("uno"));

    }

    public static void main(String[] args) {

        System.out.println("Prueba HashSet");
        Set tabla = new HashSet();
        pruebaConjunto(tabla);

        System.out.println();

        System.out.println("Prueba TreeSet");
        Set arbol = new TreeSet();
        pruebaConjunto(arbol);

    }
}
