/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macarena
 */
public class AplicacionBanco {

    public static void main(String[] args) {
        try {
            Cliente c1 = new Cliente("123456789A", "Pepe", "Soplillo");
            c1.setDireccion("Calle Gabilondo, 1");
            System.out.println(c1.toString());
//            
//            Cliente c2=new Cliente("11223344B","Macarena","Cuenca");
//            
//            Cuenta cta1=new Cuenta(c1,"0000-00-0-0000000000");
//            cta1.getCliente().getNombre(); //Pepe
//            cta1.setCliente(c2); //cambio el titular
//            cta1.getCliente().getNombre(); //Macarena

            Cuenta cta2 = new Cuenta(c1, "1111-11-1-1111111111");
            System.out.println("Fecha apertura: " + cta2.getFecha());
            cta2.setFecha("10/01/2014 13:00");
            System.out.println(cta2.toString());

            cta2.ingreso(100);
            try {
                cta2.reintegro(150);
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
            System.out.println("Saldo: " + cta2.getSaldo());
            
            //calculo de intereses
            cta2.sumarInteres();
            System.out.println("Saldo: " + cta2.getSaldo());
            

        } catch (Exception ex) {
            
        }

    }
}
