package Figuras_Bis;

//Prototipo de todas las figuras geométricas

import java.io.Serializable;

//Define el comportamiento mínimo común que tienen todas las figuras
public abstract class Figura implements Serializable {
    
    protected Punto centro; //centro de la figura en el plano
    
    public abstract double calcularArea();
    public abstract void dibujar();
    
}
