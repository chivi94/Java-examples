package Figuras_Bis;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

//--------OJO!! con ObjectOutputStream no se puede abrir el fichero en modo append
//--------Así que la única forma de almacenar todos los objetos, es guardarlos todos a la vez
//--------o dejar el flujo abierto al inicio del programa y cerrarlo al final.

//SOLUCIÓN 1: Almacenar todos los objetos a la vez

public class AppFiguras {

    public static void informacion(Figura f) {
        System.out.println(f.toString());
        System.out.println("Area: " + f.calcularArea());
        f.dibujar();
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
            Logger.getLogger(AppFiguras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AppFiguras.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(AppFiguras.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static void almacenarFiguras(Figura f1, Figura f2, Figura f3) {
        ObjectOutputStream oos = null;
        FileOutputStream fos = null;
        try {
            //abrir el fichero para escritura            
            fos = new FileOutputStream("./src/Ficheros/figuras.obj");             
            oos = new ObjectOutputStream(fos);
            oos.writeObject(f1);
            oos.writeObject(f2);
            oos.writeObject(f3);
        } catch (IOException ex) {
            Logger.getLogger(AppFiguras.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(AppFiguras.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void main(String[] args) {

        Circulo c1 = new Circulo(3.0, new Punto(0, 0));
        Rectangulo r1 = new Rectangulo(5.2, 3.6, new Punto(14.5, 7.0));
        Cuadrado cu1 = new Cuadrado(2, new Punto(1, 1));

        //ALMACENAMOS LOS OBJETOS EN EL FICHERO
        almacenarFiguras(c1,r1,cu1);        
        
        //RECUPERAMOS LOS OBJETOS DEL FICHERO
        leerFiguras();
    }
}
