/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author gonriniv
 */
public class Cuadrado extends Cuadrilatero {

    public Cuadrado(double base,double altura,Punto centro) {
        super(base,altura,centro);
    }
  public Cuadrado(double lado,Punto centro){
      super(lado,centro);
  }

    @Override
    public void metodo1() {
        System.out.println("Método1 de Cuadrado");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujo de un Cuadrado");
    }
    
}
