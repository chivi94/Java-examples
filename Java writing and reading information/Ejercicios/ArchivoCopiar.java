/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivan
 */
public class ArchivoCopiar {

    public static void copia(File archivo1, File archivo2) {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(archivo1);
            out = new FileOutputStream(archivo2);

            byte[] tamanio = new byte[1024];
            int longitud;

            while ((longitud = in.read(tamanio)) > 0) {
                out.write(tamanio, 0, longitud);
            }

            in.close();
            out.close();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileOutputStream fos = null;
        boolean finArchivo = false; //controla el final del fichero
        byte d; // almacena el dato leido
        File f = null;
        File f2 = null;
        BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        try {
            f = new File("C:\\Users\\Ivan\\Desktop\\A\\Origen\\DIFICULTADES_TECNICAS");//crear una carpeta llamada Ficheros

            fos = new FileOutputStream(f);
            //creamos un buffer
            bos = new BufferedOutputStream(fos);//buffer de salida de bytes
            dos = new DataOutputStream(bos);//escribimos datos primitivos de java con DataOutput...

            f2 = new File("C:\\Users\\Ivan\\Desktop\\A\\Destino\\");

            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(f2)));

            while (!finArchivo) { //mientras no sea el final del fichero
                d = dis.readByte();  //leemos dato (double)
                System.out.println(d); //lo mostramos por pantalla
            }
            dis.close();  //cerramos el fichero
            copia(f,f2);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoCopiar.class.getName()).log(Level.SEVERE, null, ex);//quedaría el flujo abierto si entra aqui
        } catch (IOException ex) {
            Logger.getLogger(ArchivoCopiar.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();//se puede hacer por niveles de abstraccion.Si cierro el DataOutput se cerraran todos
            } catch (IOException ex) {
                Logger.getLogger(ArchivoCopiar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
