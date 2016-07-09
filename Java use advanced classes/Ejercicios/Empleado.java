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
abstract public class Empleado {

   protected String nif;
    protected String nombre;
    protected int edad;

    public Empleado(String _nif, String _nombre, int _edad) {
        this.nif = _nif;
        this.nombre = _nombre;
        this.edad = _edad;
    }
    public Empleado(){
        
    }

    public String toString() {
        String s;
        s = "Nombre: " + this.nombre + "\n";
        s += "NIF: " + this.nif + "\n";
        s += "Edad: " + this.edad;
        return s;
    }
    abstract public double calcularSalarioMensual();
            
   
}
