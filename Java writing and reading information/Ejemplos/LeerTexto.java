package Ejemplos;

import java.io.*;

/* Lectura de texto: objeto BufferedReader
 * Programa que muestra por pantalla el contenido de
 * un archivo frases.txt ubicado en la carpeta Ficheros  
 */
public class LeerTexto {

    public static void main(String[] args) {

        File f = new File(".\\src\\Ficheros\\frases.txt"); //objeto File que representa el fichero del que leer
        FileReader fr=null;
        BufferedReader br=null;
        String s=""; //almacena cada linea leida del fichero   
        
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            
                  
            s = br.readLine(); //lectura anticipada
            while (s != null) { //mientras haya cadenas por leer
                System.out.println(s); //la mostramos por pantalla
                s = br.readLine(); // leemos otra linea del fichero
            }
            br.close(); //cerramos el fichero
        } catch (FileNotFoundException e) {
            System.out.println("Error al abrir el archivo");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
        }

    } 
}
