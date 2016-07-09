package Ejemplos;

import java.io.*;

/* Lectura de bytes: objeto DataInputStream
 * Programa que lee doubles almacenados en un archivo prueba.dat 
 * ubicado en la carpeta Ficheros
 */
public class LeerBytes {

    public static void main(String[] args) {

        boolean finArchivo = false; //controla el final del fichero
        int d; // almacena el dato leido

        File f = new File(".\\src\\Ficheros\\prueba.dat");

        try {
            DataInputStream dis = new DataInputStream(
                    new BufferedInputStream(new FileInputStream(f)));
            while (!finArchivo) { //mientras no sea el final del fichero
                d = dis.readInt();  //leemos dato (double)
                System.out.println(d); //lo mostramos por pantalla
            }
            dis.close();  //cerramos el fichero
        } catch (EOFException e) {
            finArchivo = true;
        } catch (FileNotFoundException e) {
            System.out.println("Error. No se puede abrir un fichero inexistente");
            
        } catch (IOException e) {
            System.out.println("Error de lectura en fichero");
            e.printStackTrace();
        }
        System.out.println("Tamaño del archivo:"+f.length());

    } 
}
