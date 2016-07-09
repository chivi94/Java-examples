/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Ivan
 */
public class Cliente1 implements Usuario, Oferta1 {

    private int segundos_cli1;
    private double precioMinuto;
    private String dni_cli1 = "";
    private String nombre_cli1 = "";

    public Cliente1(String dni, String nombre, double importe) {
        this.nombre_cli1 = nombre;
        this.dni_cli1 = dni;
        this.precioMinuto = importe;
    }

    @Override
    public void conexion(int s) {
        this.segundos_cli1 = s;
    }

    @Override
    public void reset() {

        conexion(0);
        this.precioMinuto = 0;
        this.dni_cli1 = "";
        this.nombre_cli1 = "";
        System.out.println("La cuenta del cliente\n" + toString() + "\nHa sido reseteada");
        System.out.println("Importe total a pagar" + this.importe() * 0);
    }

    @Override
    public double importe() {
        if (this.segundos_cli1 < Oferta1.segundos) {
            return 0;
        } else {
            return this.precioMinuto * (segundos_cli1 - Oferta1.segundos / 60);
        }

    }

    @Override
    public String toString() {
        String s = "";
        s = "Cliente 1: " + nombre_cli1;
        s += "\nDni: " + dni_cli1;
        s += "\nSegundos conectado: " + this.segundos_cli1;
        s += "\nPrecio por minuto: " + this.precioMinuto;
        s += "\nTotal a pagar="+this.importe();
        return s;

    }

}
