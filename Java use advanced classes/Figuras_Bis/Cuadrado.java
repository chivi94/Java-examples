package Figuras_Bis;

public class Cuadrado  extends Cuadrilatero {

    public Cuadrado(double lado, Punto centro){
        this.lado1=this.lado2=this.lado3=this.lado4=lado;        
        this.centro=centro;
    }

    @Override
    public String toString() {
        return "Cuadrado (" + "lado=" + this.lado1 + " centro=" + this.centro.toString() + ")";
    }

    @Override
    public double calcularArea() {
       return this.lado1*this.lado2;
    }
    
    
}
