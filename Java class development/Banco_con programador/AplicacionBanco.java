package Banco_con programador programador;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AplicacionBanco {

    static Cliente cli;
    static Cuenta c;
    
    public static void calcularIntereses(){
        c.sumarInteres();
        System.out.println(c.getSaldo()); //prueba
    }

    public static void main(String[] args) {
        try {
            cli=new Cliente("12345678A","Luis","Perez");
            System.out.println(cli.toString());
            
            c=new Cuenta(cli,"1111-11-1-111111111");
            c.ingreso(100);
            System.out.println(c.toString());
            
            new ProgramadorTareas().iniciarTarea();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
                
    }
}
