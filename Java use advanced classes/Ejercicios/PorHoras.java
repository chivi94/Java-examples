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
public class PorHoras extends Empleado {
    private double precio;
    private double hora;

    public PorHoras(double precio, double hora, String _nif, String _nombre, int _edad) {
        super(_nif, _nombre, _edad);
        this.precio = precio;
        this.hora = hora;
    }

    public PorHoras(double precio, double hora) {
        this.precio = precio;
        this.hora = hora;
    }
    

    @Override
    public double calcularSalarioMensual() {
        return this.hora*this.precio;
        
    }
    

 
}
