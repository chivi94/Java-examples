/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author gonriniv
 */
//Prototipo de las figuras que son cuadriláteros
public abstract class Cuadrilatero extends Figura{
    
    protected double lado1;
    protected double lado2;
    
    public Cuadrilatero(double lado1,double lado2,Punto centro){
        this.lado1=lado1;
        this.lado2=lado2;
        this.centro=centro;
    }
    public Cuadrilatero(double lado1,Punto centro){
        this.lado1=lado1;
        this.centro=centro;
    }

    @Override
    public double calcularArea() {
        return lado2*lado2;
    }

    public abstract void metodo1();
    
}
