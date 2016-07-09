package Soluciones;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class Filtro extends FileFilter{
    
    @Override
    public boolean accept(File f) {
        return f.getPath().endsWith(".txt") || f.isDirectory();
    }

    @Override
    public String getDescription() {
        return "Archivos de texto (*.txt)";
    }
}
