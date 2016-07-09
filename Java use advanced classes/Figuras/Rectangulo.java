
package Figuras;


public class Rectangulo extends Cuadrilatero {
    
    
    

    public Rectangulo(double base,double altura,Punto centro) {
        super(base,altura,centro);
        
    }

    @Override
    public void metodo1() {
        System.out.println("Método1 de Rectángulo");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujo de un Rectángulo");
    }
    

    

    
}
