/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras_Bis;

/**
 *
 * @author macarena
 */
public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio, Punto centro) {
        this.radio = radio;
        this.centro = centro;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujo de un círculo");
    }

    @Override
    public String toString() {
        return "Círculo (" + "radio=" + this.radio + " centro=" + this.centro.toString() + ")";
    }
}
