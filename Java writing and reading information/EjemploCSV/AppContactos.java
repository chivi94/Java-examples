/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploCSV;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivan
 */
public class AppContactos {

    public static void cargarMapa() {
        CsvReader lector = null;
        try {
            lector = new CsvReader("src/Ficheros/contactos.csv", ';');

            lector.readHeaders();//de esta forma lee las cabeceras.Si no se pone esto,da error(en caso de tener cabeceras en el documentos csv)

            while (lector.readRecord()) {
                Contacto c = new Contacto(Integer.parseInt(lector.get(0)), lector.get(1), lector.get(2));
                mapa.put(c.getCodigo(), c);
            }
        } catch (IOException ex) {
            Logger.getLogger(AppContactos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (lector != null) {
                lector.close();
            }
        }

    }

    public static void mostrarMapa() {

        for (Contacto c : mapa.values()) {
            System.out.println(c);
        }
    }

    public static void nuevoContacto(ArrayList<Contacto> list) throws FileNotFoundException {
        File f = new File("src/Ficheros/contactos.csv");
        FileOutputStream fos = new FileOutputStream(f, true);//apertura en modo append para no sobreescribir lo que tenemos guardado en el archivo

        CsvWriter escritor = new CsvWriter(fos, ';', Charset.defaultCharset());
        try {
            for (Contacto c : list) {
                escritor.write(String.valueOf(c.getCodigo()));
                escritor.write(c.getNombre());
                escritor.write(c.getTelefono());
                escritor.endRecord();//fin de línea.Pasa a otra

            }
        } catch (IOException ex) {
            Logger.getLogger(AppContactos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (escritor != null) {
                escritor.close();

            }
        }

    }

    public static Map<Integer, Contacto> mapa;

    public static void main(String[] args) throws FileNotFoundException {

        mapa = new HashMap();
        cargarMapa();
       // mostrarMapa();

        ArrayList<Contacto> lista = new ArrayList();
        lista.add(new Contacto(30, "contacto 29", "666999333"));

        nuevoContacto(lista);
        mostrarMapa();
        

    }

}
