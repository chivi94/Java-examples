/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import java.util.Arrays;

public class AppPersonas {

    static Persona[] personas;
    static int tam = 5;

    public static void mostrarPersonas(Persona[] per) {

        for (int i = 0; i < per.length; i++) {
            //DNI:xxxxx
            //Edad:xx
            if (personas[i] != null) {
                System.out.println(per[i].toString());
            }
        }
        System.out.println();

    }

    public static int buscarPersona(String dni) {
        for (int i = 0; i < personas.length; i++) {
            //if(dni.compareTo(personas[i].getDni())==0)->Tambien puede ponerse así
            if (personas[i].getDni().equals(dni)) {
                return i;

            }

        }
        return -1;

    }

    public static void main(String[] args) {
        personas = new Persona[tam];

        //Introducimos objetos persona en el array
        Persona p1 = new Persona("12345678A", 25);
        Persona p2 = new Persona("87654321Z", 40);
        personas[0] = p1;
        personas[1] = p2;
        personas[2] = new Persona("11111111B", 18);

        mostrarPersonas(personas);
        int pos = buscarPersona("12345678A");

        if (pos >= 0) {
            System.out.println(personas[pos].toString());

        } else {
            System.out.println("No existe una persona con ese DNI");
        }
        if (p1.compareTo(p2) > 0) {//Comparar por edad o por dni,dependiendo de el compareTo de Persona
            System.out.println("Persona p1 es mayor que p2");
        } else if(p1.compareTo(p2) < 0) {
            System.out.println("Persona p1 es menor que p2");
        }else{
            System.out.println("Persona p1 es igual que p2");
        }
        
        Arrays.sort(personas, 0, 3);
        mostrarPersonas(personas);

    }

}
