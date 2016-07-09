
package Figuras;


 public class Circulo extends Figura {
    //Toda clase que tenga al menos 1 método abstracto,es abstracta
    private double radio;
    private Punto centro;

    public Circulo(double radio, Punto centro) {
        this.radio = radio;
        this.centro = centro;
    }
    
    
    
    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(this.radio,2);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujo de un círculo");
    }
    

   
    
}
