/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import EjemplosEventos.*;
import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *Esta clase es usada por GUIEjercicio11
 * @author Ivan
 */
public class FiltroTexto extends FileFilter {

    @Override
    public boolean accept(File f) {
        if (f.getPath().endsWith(".txt")) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getDescription() {
        return ".txt";
    }

}
