package Ejemplos;

import java.util.*;

public class EjemploMapa {

    public static void pruebaMapa(Map m) {
        // Metemos pares (clave-valor) en el mapa
        m.put(1, "Cliente1");
        m.put(2, "Cliente2");
        m.put(3, "Cliente3");
        m.put(4, "Cliente4");

        // Mostramos las claves del mapa
        escribirClaves(m);
        // Mostramos los valores del mapa
        escribirValores(m);
        // Mostramos el contenido del mapa
        System.out.println(m);

        // Buscamos en el mapa por clave y por valor
        int clave = 3;
        String valor = "Cliente5";
        System.out.println("m.containsKey(\"" + clave + "\"): "
                + m.containsKey(clave));//se busca por clave
        System.out.println("m.get(\"" + clave + "\"):" + m.get(clave));

        System.out.println("m.containsvalue (\"" + valor + "\") : "
                + m.containsValue(valor));//se busca por valor

        // Vaciamos el mapa
        m.clear();
        System.out.println("m.isEmpty (): " + m.isEmpty());

    }

    // Produciendo un conjunto de claves:
    public static void escribirClaves(Map m) {
        System.out.print("Tamaño del mapa = " + m.size() + ", ");
        System.out.print("Claves: ");
        System.out.println(m.keySet());
    }

    // Produciendo una Coleccion de valores:
    public static void escribirValores(Map m) {
        System.out.print("Valores: ");
        System.out.println(m.values());
    }

    public static void main(String[] args) {

        System.out.println("Prueba HashMap");
        Map mapa1 = new HashMap();
        pruebaMapa(mapa1);

        System.out.println();

        System.out.println("Prueba TreeMap");
        Map mapa2 = new TreeMap();
        pruebaMapa(mapa2);
    }
}
