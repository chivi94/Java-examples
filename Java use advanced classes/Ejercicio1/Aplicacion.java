package ejercicio1;

import java.sql.Date;
import java.util.GregorianCalendar;

public class Aplicacion {

    public static void main(String[] args) {

        Velero v = new Velero("1234AAA", 100, 2000);
        v.setNumMastiles(4);

        AMotor am = new AMotor("5678BBB", 150, 1988);
        am.setCv(500);

        Yate y = new Yate("9000CCC", 300, 2005);
        y.setCv(1250);
        y.setCamarotes(5);    
        
        Alquiler a1 = new Alquiler("12345678A", new GregorianCalendar(2014,0,1).getTime(), new GregorianCalendar(2014,0,5).getTime(), "A1", v);
        System.out.println("Total a pagar Velero: " + alquiler(a1));

        Alquiler a2 = new Alquiler("11000000B", new GregorianCalendar(2014,0,1).getTime(), new GregorianCalendar(2014,0,5).getTime(), "A2", am);
        System.out.println("Total a pagar Barco a motor: " + alquiler(a2));

        Alquiler a3 = new Alquiler("77999888C", new GregorianCalendar(2014,0,1).getTime(), new GregorianCalendar(2014,0,5).getTime(), "A3", y);
        System.out.println("Total a pagar Yate: " + alquiler(a3));

        
    }

    public static double alquiler(Alquiler a) {
        return a.totalAlquiler();
    }
}
