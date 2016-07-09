package Ejemplos;

import java.io.*;

public class Archivo2 {

    public static void main(String[] args) {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        File direct; // referencia al directorio
        String dir[]; // array que almacena el nombre de los archivos y carpetas del directorio
        try {
            System.out.print("Introduce [ruta]directorio: ");
            String nom = teclado.readLine();

            direct = new File(nom); // creamos la referencia al directorio
            if (direct.exists() && direct.isDirectory()) {
                // obtenemos la lista de elementos que contiene
                dir = direct.list(); // devuelve un array de String
                System.out.println("Elementos del directorio " + nom);
                // recorremos el array para mostrar el contenido del directorio
//                for (int i = 0; i < dir.length; i++) {
//                    System.out.println(dir[i]);
//                }
                for (String s:dir) {
                    System.out.println(s);
                }//Con que este for lo que se hace es referenciar cada elemento del array con
                //el String s,y lo imprimimos hasta que se recorra por completo
                
            } else {
                System.err.println("Directorio inexistente");
            }
        } catch (IOException ex) {
            System.err.println("Error de entrada/salida");
        }
    }
}
