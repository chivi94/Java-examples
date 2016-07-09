/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Date;

/**
 *
 * @author Ivan
 */
public class Temporal extends Empleado {

    protected Date fechaAlta;
    protected Date fechaBaja;
    protected double sueldo;

    public Temporal(String nif,String nombre,int edad,Date alta, Date baja,double sueldo) {
        super(nif,nombre,edad);
        this.fechaAlta = alta;
        this.fechaBaja = baja;
        this.sueldo=sueldo;
    }

    @Override
    public String toString() {
        return "Temporal{" + "fechaAlta=" + fechaAlta + ", fechaBaja=" + fechaBaja + '}';
    }

    @Override
    public double calcularSalarioMensual() {

        return sueldo;
    }

}
