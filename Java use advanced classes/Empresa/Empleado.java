/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

/**
 *
 * @author gonriniv
 */
public class Empleado {
    //Datos
    protected String nombre;
    protected String apellidos;
    protected double salarioBase;
    protected double retencion;
    
    //Constructor por defecto
    public Empleado(){}
    
    //Constructor con parámetros
    public Empleado(String nombre,String apellidos){
        nombre=this.nombre;
        apellidos=this.apellidos;
    }
    
    
    //Métodos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apell) {
        this.apellidos = apell;
    }

    public void setSalario(double salario) {
        this.salarioBase = salario;
    }

    public double getSalario() {
        return this.salarioBase;
    }

    public void setRetencion(double retencion) {
        this.retencion = retencion;
    }
    

    @Override
    public String toString() {
        return this.apellidos + ", " + this.nombre;
    }
    
    public double calcularSalario(){
        return this.salarioBase-(this.retencion*this.salarioBase);
    }
    
    public String metodo1(){
        return "Metodo1 de la clase empleado";
    }
}
