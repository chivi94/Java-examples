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
public class PlantaJardin implements ProductoVivo {

    protected String descripcion;
    protected double precio;
    protected boolean riego;
    protected boolean comida;
    

    public PlantaJardin(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public boolean tieneRiego(){
        return this.necesitaRiego();
        
           
        
    }

    @Override
    public boolean necesitaComida() {
        return this.comida;
    }

    @Override
    public double damePrecio() {
        return this.precio;
    }

    @Override
    public String dameDescripcion() {
        return this.descripcion;
    }

    @Override
    public boolean necesitaRiego() {
        return this.riego;
    }

   

}
