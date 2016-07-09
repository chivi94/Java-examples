package Ejemplos;

import java.io.*;

/* Antes de ejecutar el programa:
 * crear un paquete TEMA6 (actual) y en él, una carpeta "Ficheros"
 */

public class Archivo4 {

    public static void main(String[] args) {

        File carpeta = new File("./src/TEMA6/Ficheros"); // creo un objeto que representa a un directorio existente
        File fichero1 = new File("./src/TEMA6/Ficheros/fichero1.txt"); // creo un objeto que representa a un fichero inexistente.
        
		// como vemos al crear el objeto File no crea el archivo, ni se realiza ningin chequeo sobre la existencia del fichero.
        // Lo tengo que comprobar a mano.

        if (fichero1.exists()) { // Si el fichero1 existe
            System.out.println("El fichero1.txt existe");
        } else { // sino existe le creo
            System.out.println("El fichero1.txt no existe");
            try {
                if (fichero1.createNewFile()) { // creo el fichero1.txt: posible error obligatorio manejar
                    System.out.println("fichero1.txt creado");
                }
            } catch (IOException e) {
                System.out.println("Se produjo una excepcion al crear el fichero");
            }
        }
    }
}
