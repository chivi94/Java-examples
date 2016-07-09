
package Figuras;

//Prototipo de todas las figuras geométricas



//Define el comportamiento mínimo común que tienen todas las figuras
public abstract class Figura {
    //Al ser abstracta no se pueden crear objetos
    protected Punto centro;
    
    public abstract double calcularArea();
    public abstract void dibujar();
        
    
    
}
