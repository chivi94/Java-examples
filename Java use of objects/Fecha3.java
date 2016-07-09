package TEMA13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.text.*;

//Programa que obtiene a partir de una fecha otra fecha,
//sumando el numero de milisegundos correspondiente
public class Fecha3 {

    static BufferedReader teclado; //acceso al teclado

    public static void main(String[] args) throws IOException {
        teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Dias a sumar a la fecha de hoy: ");
        int dias = Integer.parseInt(teclado.readLine());
        //convertimos los días en milisegundos
        long numMilis = (long) (dias * 24 * 60 * 60 * 1000); //milisegundos a sumar

        //creamos la fecha resultante sumando milisegundos:
        //los de la fecha de hoy + los días a sumar
        Date fecha = new Date(System.currentTimeMillis() + numMilis);
        System.out.print("La fecha resultante es: ");
        System.out.println(DateFormat.getDateInstance(DateFormat.FULL).format(fecha));

    }
}
