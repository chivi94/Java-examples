package Ejemplos;

import java.io.*;
import java.text.*;
import java.util.*;

public class Archivo3 {

    public static void main(String[] args) {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        File direct; // referencia al directorio
        File dir[];  // array que almacena el contenido del directorio (ficheros y directorios)
                     //	como objetos File (para obtener sus caracteristicas)
        String tipo, fecha, nombre; // caracteristicas de cada elemento (File)

        try {
            System.out.print("Introduce [ruta]directorio:");
            String nom = teclado.readLine();
            direct = new File(nom); // creamos la referencia al directorio

            if (direct.exists() && direct.isDirectory()) {
                // obtenemos la lista de elementos
                dir = direct.listFiles(); // devuelve un array de objetos File

                // formateador de fechas
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");

                System.out.println("Elementos del directorio " + nom);

                // recorremos el array de objetos File para mostrar las caracteristicas
                // de cada File (fichero o directorio)
                for (int i = 0; i < dir.length; i++) {
                    // Tipo: directorio o archivo
                    tipo = (dir[i].isDirectory()) ? "<DIR>" : "     ";
                    // Fecha de acceso o ultima modificacion
                    fecha = sdf.format(new Date(dir[i].lastModified()));
                    // Nombre
                    nombre = dir[i].getName();
                    // Imprimimos las columnas
                    System.out.println(fecha + " " + tipo + " " + nombre);
                }
            } else { //no es un directorio o no existe
                System.out.println("Directorio inexistente");
            }

        } catch (IOException ex) {
            System.out.println("Error de entrada/salida");
        }
    }
}
