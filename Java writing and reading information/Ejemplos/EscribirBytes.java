package Ejemplos;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/* Escritura de bytes: objeto DataOutputStream
 * Programa que escribe numeros generados aleatoriamente
 * en un archivo prueba.dat ubicado en la carpeta Ficheros 
 */
public class EscribirBytes {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            File f = new File(".\\src\\Ficheros\\prueba.dat");//crear una carpeta llamada Ficheros
            Random r = new Random();
            fos = new FileOutputStream(f);
            //creamos un buffer
            BufferedOutputStream bos=new BufferedOutputStream(fos);//buffer de salida de bytes
            DataOutputStream dos = new DataOutputStream(bos);//escribimos datos primitivos de java con DataOutput...
            //                    new BufferedOutputStream(new FileOutputStream(f)));
            try {
                
                
                for (int i = 0; i < 10; i++) {
                    dos.writeInt((int)(10*r.nextInt()));//si quiero almacenar enteros 
                }//trab con el fichero
                
                
            } catch (IOException e) {
                System.out.println("Error de escritura en el archivo");
                e.printStackTrace();//quedaría el flujo abierto si entra aqui
            }finally{
                try{
                dos.close();//se puede hacer por niveles de abstraccion.Si cierro el DataOutput se cerraran todos
                }catch(IOException ex){
                
                }
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EscribirBytes.class.getName()).log(Level.SEVERE, null, ex);//quedaría el flujo abierto si entra aqui
        }finally{
            try{
            fos.close();//se puede hacer por niveles de abstraccion.Si cierro el DataOutput se cerraran todos
            }catch(IOException ex){
                Logger.getLogger(EscribirBytes.class.getName()).log(Level.SEVERE, null, ex);
            
            }
        }

    } 
}
