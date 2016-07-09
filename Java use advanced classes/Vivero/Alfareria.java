/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vivero;

/**
 *
 * @author Ivan
 */
public class Alfareria implements ProductoFragil {

    protected String descripcion;
    protected double precio;
    protected double peso;
    protected String embalaje;

    public Alfareria(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    public void asignarEmbalaje(String clase){
        this.embalaje=clase;
    }

    @Override
    public String dameEmbalaje() {
        return this.embalaje;
    }

    @Override
    public double damePeso() {
        return this.peso;
    }

    @Override
    public double damePrecio() {
        return this.precio;
    }

    @Override
    public String dameDescripcion() {
       return this.descripcion;
    }

}
