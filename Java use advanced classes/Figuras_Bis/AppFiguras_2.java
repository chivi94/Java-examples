package Figuras_Bis;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

//--------OJO!! con ObjectOutputStream no se puede abrir el fichero en modo append
//--------Así que la única forma de almacenar todos los archivos, es guardarlos todos a la vez
//--------o dejar el flujo abierto al inicio del programa y cerrarlo al final.

//SOLUCIÓN 2: Stream abierto hasta que finaliza la aplicación

public class AppFiguras_2 {

    static FileOutputStream fos = null;
    static ObjectOutputStream oos = null;  
    
    public static void informacion(Figura f) {
        System.out.println(f.toString());
        System.out.println("Area: " + f.calcularArea());
        f.dibujar();
    }

    public static void almacenarFigura(Figura f) { 
        try {
            oos.writeObject(f);
        } catch (IOException ex) {
            Logger.getLogger(AppFiguras_2.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

    public static void leerFiguras() {
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try {
            //abrir el fichero para lectura
            fis = new FileInputStream("./src/Ficheros/figuras.obj");
            ois = new ObjectInputStream(fis);
            boolean EOF = false;
            while (!EOF) {
                try {
                    Figura figuraLeida = (Figura) ois.readObject();
                    informacion(figuraLeida);
                } catch (EOFException ex) {
                    EOF = true;
                }
            }            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AppFiguras_2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AppFiguras_2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(AppFiguras_2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
  
    
    public static void main(String[] args) {
        try {
            
            //Abrimos el fichero para escritura
            fos = new FileOutputStream("./src/Ficheros/figuras.obj");
            oos = new ObjectOutputStream(fos);
            
            Circulo c1 = new Circulo(3.0, new Punto(0, 0));
            Rectangulo r1 = new Rectangulo(5.2, 3.6, new Punto(14.5, 7.0));
            Cuadrado cu1 = new Cuadrado(2, new Punto(1, 1));
            
            //ALMACENAMOS LOS OBJETOS EN EL FICHERO
            almacenarFigura(c1);
            almacenarFigura(r1);
            almacenarFigura(cu1);
            
            //RECUPERAMOS LOS OBJETOS DEL FICHERO
            leerFiguras();
            
        } catch (IOException ex) {
            Logger.getLogger(AppFiguras_2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(AppFiguras_2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
