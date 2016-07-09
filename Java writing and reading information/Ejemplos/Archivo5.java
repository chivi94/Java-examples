package Ejemplos;

import java.io.*;

public class Archivo5 {

    public static void main(String[] args) {

        // mostramos por pantalla las unidades de disco
        File unidades[] = File.listRoots(); // devuelve un array de objetos File con las unidades que hay en disco
        System.out.println("Unidades en disco");
        for (int i = 0; i < unidades.length; i++) {
            System.out.println("\t" + unidades[i].toString());
        }

        // para crear una carpeta primero creo el objeto File
        // y despues creo el objeto fisicamente en disco.
        File carpeta = new File("./src/CarpetaNueva"); // ruta relativa al proyecto actual
        if (carpeta.mkdir()) { //devuelve true si se ha creado correctamente
            System.out.println("Carpeta creada con exito");
        } else {
            System.out.println("Error al crear la carpeta");
        }

        //creo un archivo en CarpetaNueva y luego borro los dos
        try {
            File nuevo = new File(carpeta, "archNuevo");
            if (!nuevo.exists()) {
                nuevo.createNewFile();
            }
            System.out.println("¿Se ha eliminado el archivo? " + nuevo.delete()); // true si operacion exitosa
            System.out.println("¿Se ha eliminado el archivo? " + nuevo.delete()); // false (no hay carpeta)
            System.out.println("¿Se ha eliminado la carpeta? " + carpeta.delete()); // true si operacion exitosa
        } catch (IOException e) {
            System.out.println("Error de Entrada/Salida");
        }
    }
}
