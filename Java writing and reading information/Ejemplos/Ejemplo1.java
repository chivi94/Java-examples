package Ejemplos;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ejemplo1 {
    
    public static void main(String[] args) {
        
        File carpeta=new File("Carpeta");
        File archivo1=new File(carpeta,"archivo1.txt");
        
        
        File archivo2=new File("d:"+File.separator+"archivo2.txt");
        if(!archivo2.exists()){
            System.out.println("Fichero inexistente");
            try {
                if(archivo2.createNewFile()){
                    System.out.println("Fichero creado");
                    System.out.println("Tamaño inicial:"+archivo2.length());
                }
            } catch (IOException ex) {
                Logger.getLogger(Ejemplo1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Tamaño inicial:"+archivo2.length());
        }
    }
}
