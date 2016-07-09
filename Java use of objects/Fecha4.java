package TEMA13;

import java.text.SimpleDateFormat;
import java.util.Date;

//Formateando fechas con SimpleDateFormat
//objeto que permite crear plantillas para dar formato (API)
public class Fecha4 {

    public static void main(String[] args) {

        Date hoy = new Date();

        //Formatos que vamos a mostrar

        //Formato numerico europeo con barras
        String formato1 = new String("dd/MM/yyyy");

        //Formato numerico europeo sin barras
        String formato2 = new String("ddMMyyyy");

        //Formato europeo con 2 digitos para el anio y separados por guion
        String formato3 = new String("dd-MMM-yy");

        //Formato americano separado con barras
        String formato4 = new String("MM/dd/yyyy");

        //Hora en formato 12H, si es AM O PM, mes en texto, dia y anio
        String formato5 = new String("hh:mm:ss a MMM dd, yyyy");

        //Hora en formato 24H (con milisegundos), dia y mes
        String formato6 = new String("HH:mm:ss:SSS dd MM");

        //Dia en numero, dia texto abreviado y hora en formato 24H
        String formato7 = new String("dd E HH:mm:ss:SSS");

        //Dia en numero, dia texto completo y hora en formato 24H
        String formato8 = new String("dd EEEE HH:mm:ss:SSS");

        //Dia de la semana, dia en numero, mes texto completo y anio
        String formato9 = new String("E dd, MMMM yyyy");

        //Imprimimos la fecha sin formatear
        System.out.println("La fecha es: " + hoy);

        //Imprimimos la fecha formateada segun las diferentes plantillas
        SimpleDateFormat formatoSimple = new SimpleDateFormat(formato1);
        System.out.println("Formato1: " + formatoSimple.format(hoy));

        formatoSimple.applyPattern(formato2);
        System.out.println("Formato2: " + formatoSimple.format(hoy));

        formatoSimple.applyPattern(formato3);
        System.out.println("Formato3: " + formatoSimple.format(hoy));

        formatoSimple.applyPattern(formato4);
        System.out.println("Formato4: " + formatoSimple.format(hoy));

        formatoSimple.applyPattern(formato5);
        System.out.println("Formato5: " + formatoSimple.format(hoy));

        formatoSimple.applyPattern(formato6);
        System.out.println("Formato6: " + formatoSimple.format(hoy));

        formatoSimple.applyPattern(formato7);
        System.out.println("Formato7: " + formatoSimple.format(hoy));

        formatoSimple.applyPattern(formato8);
        System.out.println("Formato8: " + formatoSimple.format(hoy));

        formatoSimple.applyPattern(formato9);
        System.out.println("Formato9: " + formatoSimple.format(hoy));
    }
}
