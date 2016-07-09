/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemplosEventos;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Ivan
 */
public class FiltroImagenes extends FileFilter {

    @Override
    public boolean accept(File f) {
        if (f.getPath().endsWith(".jpg")
                ||f.getPath().endsWith(".jpeg")
                ||f.getPath().endsWith(".gif")
                ||f.isDirectory()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getDescription() {
        return "Archivos de Imagen";
    }

}
