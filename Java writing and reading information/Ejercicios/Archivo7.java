/*Escribe un programa Archivo7.java que muestre recursivamente el contenido de un
 directorio. El método recursivo recibirá como parámetros un objeto File y un entero que
 indica al nivel de profundidad o anidamiento. El listado se deberá mostrar en forma de
 árbol, tabulando adecuadamente los elementos según el nivel de profundidad.*/
package Ejercicios;

import java.io.File;

public class Archivo7 {

//    static File route;
//    static int cont = 0;
//    static String dir[];
//
//    public static void dir(File ruta, int nivel) {
//        nivel = 0;//contador que controlará el nivel de anidamiento de las carpetas
//        
//        if (ruta.exists() && ruta.isDirectory()) {
//            // obtenemos la lista de elementos que contiene
//            dir = ruta.list(); // devuelve un array de String
//            System.out.println("Elementos del directorio " + ruta);
//            // recorremos el array para mostrar el contenido del directorio
//
//            for (int i = 0; i < dir.length; i++) {
//                System.out.println(dir[i]);
//                
//            }
//
//        }
//    }
//
//    public static void main(String[] args) {
//        route = new File("C:\\Users\\Ivan\\Desktop\\A");
//        if(route.i)
//        dir(route, cont);
//
//    }
    static File route;
    static int cont = 0;

    public static void dir(File ruta, int nivel) {
        String tabulacion = "";//tabulacion segun el nivel

        for (int i = 0; i < nivel; i++) {//mientras que la posición sea menor que el nivel de andamiento
            tabulacion += " ";//1 espacio por cada nivel
        }
        File[] lista = ruta.listFiles();//listamos los ficheros y los subdirectorios
        for (File f : lista) {
            System.out.println(tabulacion + f.getName());
            if (f.isDirectory()) {
                dir(f, nivel + 1);//llamada recursiva al método
            }
        }
    }

    public static void main(String[] args) {
        route = new File("C:\\Users\\Ivan\\Desktop\\A");

        System.out.println(route);
        dir(route, cont);

    }

}
