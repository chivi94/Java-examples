/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivan
 */
public class Cliente2 implements Usuario, Oferta2 {

    private BufferedReader teclado;
    private double segundos_cli2;
    private final double precioMinuto;
    private double porcentaje;
    private String dni_cli2;
    private String nombre_cli2;

    public Cliente2(String dni, String nombre, double precioMinuto) {
        this.precioMinuto = precioMinuto;
    }

    @Override
    public void conexion(int s) {
        this.segundos_cli2 = s;
    }

    @Override
    public double importe() {

        return ((this.precioMinuto * (segundos_cli2 / 60))*this.descuento());

    }

     @Override
    public void reset() {
        System.out.println("Importe total a pagar"+this.importe()*0);
        conexion(0);
    }

    @Override
    public double descuento() {
        try {
            teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduce descuento aplicado:");
            porcentaje = Double.parseDouble(teclado.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Cliente2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return porcentaje;
    }
    @Override
    public String toString() {
        String s="";
        s="Cliente 1: "+nombre_cli2;
        s +="\nDni: "+dni_cli2;
        s+="\nSegundos conectado: "+this.segundos_cli2;
        s+="\nPrecio por minuto: "+this.precioMinuto;
        s+=this.importe();
        return s;
        
        
    }

}
