package Ejemplos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo1 {

    public static void main(String[] args) {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        File miF; // referencia al fichero o directorio
        String nom; // almacena el nombre del fichero o directorio

        try {
            do {
                System.out.println("Introduce [ruta]archivo o [ruta]directorio. ");
                System.out.print("Linea vacia para terminar: ");
                nom = teclado.readLine();
                if (nom.length() > 0) {
                    miF = new File(nom); // creacion del objeto File
                    if (miF.exists()) {
                        System.out.println(nom + " está en el disco. ");
                        if (miF.isFile()) {
                            System.out.print("Es un fichero. ");
                            System.out.println("De tamaño: " + miF.length() + " bytes");
                        } else if (miF.isDirectory()) {
                            System.out.println("Es un directorio. ");
                        } else {
                            System.out.println("Se desconoce que es. ");
                        }
                    } else {
                        System.out.println("No existe el objeto en el disco.");
                    }
                }
            } while (nom.length() > 0);
        } catch (IOException ex) {
            System.out.println("Error de entrada/salida");
        }
    }
}
