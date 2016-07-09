/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Macarena
 */
public class CopiarArchivoBinario {

    public static void main(String[] args) {

        BufferedReader teclado = null;

        FileInputStream fis = null;
        BufferedInputStream bis = null;

        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        try {

            teclado = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Introduce [ruta] al archivo origen: ");
            String fOrigen = teclado.readLine();

            System.out.print("Introduce [ruta] al archivo destino: ");
            String cDestino = teclado.readLine();

            File fO = new File(fOrigen);
            File cD = new File(cDestino);

            if (fO.exists() && fO.isFile()) {
                if (cD.exists() && cD.isDirectory()) {

                    fis = new FileInputStream(fO);
                    bis = new BufferedInputStream(fis);

                    byte[] contenido = new byte[(int) fO.length()];
                    int lectura = bis.read(contenido);

                    if (lectura > 0) {
                        String nombre = fO.getName().substring(0, fO.getName().indexOf('.'));
                        String extension = fO.getName().substring(fO.getName().indexOf('.'));
                        File fD = new File(cD, nombre + "_copia" + extension);
                        fD.createNewFile();
                        fos = new FileOutputStream(fD);
                        bos = new BufferedOutputStream(fos);
                        bos.write(contenido);
                        System.out.println("Copia realizada");
                    }
                } else {
                    System.out.println("Carpeta destino inexistente");
                }
            } else {
                System.out.println("Archivo a copiar inexistente");
            }
        } catch (IOException ex) {
            Logger.getLogger(CopiarArchivoBinario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(CopiarArchivoBinario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
