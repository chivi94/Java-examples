package Pruebas;

import java.util.*;

public class OrdenarBuscarEnLista {

    public static void main(String[] args) {

        //Creamos la lista
        List lista = new ArrayList();

        //La llenamos
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");
        lista.add("cinco");

        //Mostramos la lista creada
        System.out.println("Lista inicial: " + lista + "\n");

        //Desordenamos aleatoriamente la lista
        //con el metodo shuffle
        Collections.shuffle(lista); //desordenamos aleatoriamente la lista
        System.out.println("Despues de desordenar: " + lista + "\n");

        //Ordenamos la lista con el metodo sort
        Collections.sort(lista);
        System.out.println("Despues de ordenar: " + lista + "\n");

        //Buscamos en la lista un elemento con el metodo bynarySearch.
        //Para que funcione correctamente este metodo la lista tiene que estar ordenada
        String clave = "uno"; //elemento a buscar
        int indice = Collections.binarySearch(lista, clave);
        System.out.println("Posicion de " + clave + " es " + indice);

    }
}
