
package Ejemplos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class EjemploFechas {
    public static void main(String[] args) {
        
        GregorianCalendar fecha1=new GregorianCalendar();
        System.out.println("Fecha actual: "+fecha1);
        
        GregorianCalendar navidad=new GregorianCalendar(2013,11,25,12,0);
        //Date fecha_navidad= fecha_navidad.getTime();
        GregorianCalendar cumpleaños=new GregorianCalendar(1994,Calendar.OCTOBER,17);
        
        System.out.println("Hora de navidad: "+navidad.get(Calendar.HOUR));
        //modificamos el día de cumpleaños
        cumpleaños.set(Calendar.DAY_OF_MONTH, 25);
        //modificamos la fecha de cumpleaños
        cumpleaños.set(2013, Calendar.FEBRUARY, 2, 15, 30);
        cumpleaños.getTime();//se usa para formatear un objeto date a partir de un gregorian calendar
        
        
        Date fecha_hoy = new Date();
        System.out.println("Fecha actual: "+ fecha_hoy);
        
        //Date cumple = new Date(2013,2,5);//no se pueden crear fechas concretas porque este método esta obsoleto
        //para crear fechas concretas hay que hacerlo obligatoriamente con GregorianCalendar
        //Date cumple= cumpleaños.getTime();
        
        //comparar la fecha de cumpleaños con la fecha actual
        System.out.println("¿Son iguales? "+fecha_hoy.equals(cumpleaños.getTime()));
        System.out.println("¿Son iguales? "+fecha_hoy.compareTo(cumpleaños.getTime()));
        System.out.println("¿Son iguales? "+cumpleaños.getTime().compareTo(fecha_hoy));
        fecha_hoy.after(cumpleaños.getTime());
        fecha_hoy.before(cumpleaños.getTime());
        
        //formateamos las fechas
        
        //utilizamos la clase DateFormat
        
        DateFormat formateador= DateFormat.getTimeInstance(DateFormat.FULL);
        String s=formateador.format(fecha_hoy);
        System.out.println("Fecha de hoy formateada: "+ s);
        System.out.println("Fecha de navidad formateada: "+formateador.format(navidad.getTime()));
        
       //utilizamos la clase SimpleDateFormat,que sirve para crear fechas con formatos personales
        //los métodos se usan igual que en la clase DateFormat
        SimpleDateFormat formateador2=new SimpleDateFormat("'Estamos a 'd/M/yy 'a las' HH:mm:ss z");//Muestra la fecha en formato "getInstance",es el formato por defecto.
        //En la plantilla de SimpleDateFormat tenemos que poner una cadena para personalizar la fecha
        System.out.println("Fecha de hoy formateada: "+formateador2.format(fecha_hoy));
        
                
        
        
        
        

    }
    
}
