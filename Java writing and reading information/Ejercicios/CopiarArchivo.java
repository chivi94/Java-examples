package Ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CopiarArchivo {

    public static void copiarFicheros(File f1, File f2) {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new FileInputStream(f1);
            out = new FileOutputStream(f2);

            byte[] buf = new byte[2048];
            int len;
            int b=in.read();

           while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
//            while(b!=-1){
//                out.write(b);
//                b=in.read();
//            }

            System.out.println("Copia realizada.");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try { 
                out.flush();
                in.close();
                out.close();
            } catch (IOException ex) {
                Logger.getLogger(CopiarArchivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {

        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Introduce origen de la copia:");
            String origen = teclado.readLine();
            System.out.print("Introduce destino de la copia:");
            String destino = teclado.readLine();

            String nombre=origen.substring(origen.lastIndexOf("\\")+1,origen.lastIndexOf('.'));
            String extension = origen.substring(origen.length() - 4);
            destino +="\\"+nombre+"_copia" + extension;

            File fo = new File(origen); // referencia a la ruta origen
            File fd = new File(destino); // referencia a la ruta destino

            
            copiarFicheros(fo, fd);

        } catch (FileNotFoundException e) {
            System.out.println("Error. No se encuentra el archivo.");
        } catch (IOException e) {
            System.out.println("Error de lectura/escritura.");
        }
    }
}