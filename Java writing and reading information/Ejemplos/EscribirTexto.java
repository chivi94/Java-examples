package Ejemplos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/* Escritura de texto: objeto BufferedWriter
 * Programa que escribe frases introducidas por teclado
 * en un archivo frases.txt ubicado en la carpeta Ficheros  
 */
public class EscribirTexto {

    public static void main(String[] args) {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        String s; // almacena la frase introducida por teclado

        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(".\\src\\Ficheros\\frases.txt", true); // abrimos el archivo en modo "append"-->si ya tiene datos,se le añaden.Si se pone false,se sobreescribe
            bw = new BufferedWriter(fw);

            //pedimos frases por teclado y las vamos escribiendo en el fichero
            System.out.print("Introduce una frase: ");
            s = teclado.readLine();
            while (s.length() > 0) {
                bw.write(s); //la almacenamos en el fichero
                bw.newLine();//cambiamos de línea
                System.out.print("Introduce una frase: "); //pedimos nueva frase
                s = teclado.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
        } finally {
            try {
                bw.close(); //cerramos el fichero
            } catch (IOException ex) {
                Logger.getLogger(LeerBytes2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
