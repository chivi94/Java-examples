package Ejemplos;

import java.io.*;

public class Archivo6 {

    public static void main(String[] args) {

        // creacion de un archivo temporal
        File temporal = null;
        try {
            temporal = File.createTempFile("prueba", null); // creamos archivo temporal vacio <nombre.extension>
            temporal.deleteOnExit(); // borrar el archivo temporal cuando finalice el programa

            if (temporal.exists()) {
                System.out.println(temporal.getAbsolutePath());
                // Aqui podemos abrir el fichero y escribir cosas en él
                // para leerlas más adelante, donde nos haga falta
            }

        } catch (IOException e) {
            System.out.println("Error en la creacion del archivo");
        }
    }
}
