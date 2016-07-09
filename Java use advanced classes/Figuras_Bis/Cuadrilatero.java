/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras_Bis;

/**
 *
 * @author macarena
 */
 
//Prototipo de las Figuras que son cuadriléros
public abstract class Cuadrilatero  extends Figura {

    protected double lado1;
    protected double lado2;
    protected double lado3;
    protected double lado4;
            
    @Override //Redefinición de método abstracto
    public void dibujar(){
        System.out.println("Dibujo de un Cuadrilátero");
    }
  
}
