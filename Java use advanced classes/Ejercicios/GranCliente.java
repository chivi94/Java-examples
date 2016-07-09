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
public class GranCliente implements Usuario, Oferta1, Oferta2 {

    private BufferedReader teclado;
    private double porcentaje;
    private final double precioMinuto;
    private int seg_gran;
    private String nombre_gc;
    private String dni_gc;

    public GranCliente(String dni, String nombre, double precioMinuto) {
        this.precioMinuto = precioMinuto;
    }

    @Override
    public void conexion(int s) {
        this.seg_gran = s;
    }

    @Override
    public double importe() {
        if (this.seg_gran <= Oferta1.segundos) {
            return 0;
        } else {
            return ((this.precioMinuto * (seg_gran - (Oferta1.segundos / 60))) * this.descuento());
        }

    }

    @Override
    public void reset() {
        System.out.println(importe() * 0);
        conexion(0);
    }

    @Override
    public double descuento() {
        try {
            teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduce descuento aplicado");
            porcentaje = Double.parseDouble(teclado.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Cliente2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return porcentaje;
    }

    @Override
    public String toString() {
        String s;
        s = "Cliente 1: " + nombre_gc;
        s += "\nDni: " + dni_gc;
        s += "\nSegundos conectado: " + this.seg_gran;
        s += "\nPrecio por minuto: " + this.precioMinuto;
        s += this.importe();
        return s;

    }
}
