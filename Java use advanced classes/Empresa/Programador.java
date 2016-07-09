/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

/**
 *
 * @author gonriniv
 */
public class Programador extends Empleado {
    //Datos
    protected double horas;
    protected double precioHora;
    //Constructor por defecto
    public Programador(){}
       
       //...
   
    //Constructor parametrizado
    public Programador(String nombre,String apellidos,double pvpHora){
        super(nombre,apellidos);//llamada al constructor del padre
        //...
        this.precioHora=pvpHora;
    }
    //Métodos
    public void setHoras(double horas) {
        this.horas = horas;
    }

    public void setPrecio(double precio) {
        this.precioHora = precio;
    }
    //Devuelve el salario del programador: salariobase + horas
    @Override//Redefinición del método de la clase base
    public double calcularSalario() { 
        return super.calcularSalario()+(this.horas*this.precioHora);
    }
    //sobrecarga del método del hijo,de la clase actual
    public double calcularSalario(double plus){
        return this.calcularSalario() + plus;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\n Horas: "+this.horas+" Precio hora:"+this.precioHora;
        
    }
    public String metodo1(String s){
        return "Metodo1 de la clase Programador"+s;
    }
}
