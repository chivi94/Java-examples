package Ejercicio4_bis;

//Representa a los clientes con la Oferta2

import Ejercicio4.*;

public class Cliente2 extends Cliente implements Oferta2 {

    private double descuento; //porcentaje de descuento
    
    public Cliente2(String nombre, String dni, double precioSeg, double dto) {
        super(nombre, dni, precioSeg);       
        this.descuento=dto;
    }

    //Definición de método abstracto
    @Override
    public double importe() {
        double subTotal = this.seg * this.precioSeg; //subtotal
        double dto = this.descuento * subTotal; //descuento
        return subTotal - dto; //importe facturable        
    }

    @Override
    public void conexion(int s) {
        this.seg = this.seg + s;
    }

    @Override
    public double porcentajeDto() {
        return this.descuento;
    }
}
