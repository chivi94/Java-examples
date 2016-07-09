package TEMA13;

import java.util.*;
import java.text.*;

//Programa que formatea una fecha
//segun las caracteristicas regionales deseadas
//independientemente de las que estan instaladas en el ordenador.
public class Fecha2 {

    public static void main(String[] args) {

        Date hoy = new Date(); //fecha y hora del sistema

        System.out.println("\nFechas con formato americano\n");

        //Fecha corta
        String fechaC = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US).format(hoy);
        System.out.println("Fecha corta: " + fechaC);

        //Fecha media
        String fechaM = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US).format(hoy);
        System.out.println("Fecha media: " + fechaM);

        //Fecha larga
        String fechaL = DateFormat.getDateInstance(DateFormat.LONG, Locale.US).format(hoy);
        System.out.println("Fecha larga: " + fechaL);

        //Fecha completa
        String fechaF = DateFormat.getDateInstance(DateFormat.FULL, Locale.US).format(hoy);
        System.out.println("Fecha completa: " + fechaF);


        System.out.println("\nFechas con formato espaniol\n");

        //Creamos un objeto Locale con las caracteristicas de formato
        //de fecha y numeros del Espaniol

        Locale fEspaniol = new Locale("es", "ES", "Traditional_WIN"); //idioma,pais,S.O.

        //Fecha corta
        fechaC = DateFormat.getDateInstance(DateFormat.SHORT, fEspaniol).format(hoy);
        System.out.println("Fecha corta: " + fechaC);

        //Fecha media
        fechaM = DateFormat.getDateInstance(DateFormat.MEDIUM, fEspaniol).format(hoy);
        System.out.println("Fecha media: " + fechaM);

        //Fecha larga
        fechaL = DateFormat.getDateInstance(DateFormat.LONG, fEspaniol).format(hoy);
        System.out.println("Fecha larga: " + fechaL);

        //Fecha completa
        fechaF = DateFormat.getDateInstance(DateFormat.FULL, fEspaniol).format(hoy);
        System.out.println("Fecha completa: " + fechaF);

        System.out.println("\nFechas con formato personalizado\n");

        //Creamos un formateador personal, creando un objeto SimpleDateFormat
        //con las caracteristicas de formato personalizadas (sustituyendo a DateFormat.getXXInstance)

        SimpleDateFormat fPersonal = new SimpleDateFormat("EEE d MMM yy");

        //Aplicamos el formateador llamando al metodo format
        String fechaP = fPersonal.format(hoy);
        System.out.println("Fecha personal: " + fechaP);

    }
}
