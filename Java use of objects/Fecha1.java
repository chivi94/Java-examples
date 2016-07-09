package Ejemplos;

import java.text.*;
import java.util.*;

//Programa que formatea la fecha actual segun las caracteristicas
//regionales instaladas en el ordenador.
public class Fecha1 {

    public static void main(String[] args) {

        Date hoy = new Date(); //fecha y hora del sistema

        System.out.println("Formato basico fecha y hora\n");

        DateFormat formateadorFecha = DateFormat.getInstance();
        //metodo estatico que recoge las opciones basicas
        //de formateo de fechas, deacuerdo con las caracteristicas
        //regionales instaladas en el ordenador

        //damos formato a la fecha y hora del sistema
        String fechaFormateada = formateadorFecha.format(hoy);
        System.out.println(fechaFormateada);  //mostramos la fecha formateada

        System.out.println("\nFormatos fecha\n");

        formateadorFecha = DateFormat.getDateInstance();  //recoge solo el formato de fecha
        String fechaFormateada2 = formateadorFecha.format(hoy);
        System.out.println(fechaFormateada2);

        formateadorFecha = DateFormat.getDateInstance(DateFormat.FULL);  //recoge formato de fecha completo
        fechaFormateada2 = formateadorFecha.format(hoy);
        System.out.println(fechaFormateada2);

        System.out.println("\nFormatos fecha y hora\n");

        formateadorFecha = DateFormat.getDateTimeInstance(); //recoge el formato de fecha y hora
        String fechaFormateada3 = formateadorFecha.format(hoy);
        System.out.println(fechaFormateada3);  //mostramos la fecha formateada

        formateadorFecha = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT); //recoge el formato de fecha y hora (cortos)
        fechaFormateada3 = formateadorFecha.format(hoy);
        System.out.println(fechaFormateada3);  //mostramos la fecha formateada

        System.out.println("\nFormatos hora\n");

        formateadorFecha = DateFormat.getTimeInstance();  //recoge solo el formato de hora
        String horaFormateada = formateadorFecha.format(hoy);
        System.out.println(horaFormateada);  //mostramos la fecha formateada

        formateadorFecha = DateFormat.getTimeInstance(DateFormat.FULL);  //recoge el formato de hora completo
        horaFormateada = formateadorFecha.format(hoy);
        System.out.println(horaFormateada);  //mostramos la fecha formateada

    }
}
