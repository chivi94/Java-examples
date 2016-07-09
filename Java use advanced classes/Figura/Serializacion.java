/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figura;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Ivan
 */
public class Serializacion {

    public static void main(String[] args) throws ClassNotFoundException {

        ObjectOutputStream salida = null;

        try {
            Figura fig1 = new Rectangulo(10, 15, 30, 60);
            Figura fig2 = new Circulo(12, 19, 60);
            salida = new ObjectOutputStream(new FileOutputStream("figuras.obj"));
            salida.writeObject("Guardar un objeto de una clase derivada\n");
            salida.writeObject(fig1);
            salida.writeObject(fig2);
            salida.close();

            ObjectInputStream entrada = new ObjectInputStream(
                    new FileInputStream("figuras.obj"));
            String str = (String) entrada.readObject();
            Figura obj1 = (Figura) entrada.readObject();
            Figura obj2 = (Figura) entrada.readObject();
            System.out.println("------------------------------");
            System.out.println(obj1.getClass().getName() + " origen (" + obj1.x
                    + ", " + obj1.y + ")" + " area=" + obj1.area());
            System.out.println(obj2.getClass().getName() + " origen (" + obj2.x
                    + ", " + obj2.y + ")" + " area=" + obj2.area());
            System.out.println("------------------------------");
            entrada.close();
            
            
            Rectangulo r=(Rectangulo) obj1;
            System.out.println("Alto del rectangulo:"+r.alto);
            System.out.println("Ancho del rectangulo:"+r.ancho);
            Circulo c=(Circulo)obj2;
            System.out.println("Radio del circulo:"+c.radio);
            System.out.println("Area del circulo:"+c.area());
            
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                salida.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
