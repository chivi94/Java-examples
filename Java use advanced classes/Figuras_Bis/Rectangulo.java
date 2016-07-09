package Figuras_Bis;


public class Rectangulo extends Cuadrilatero {

    private double diagonal;
    
    public Rectangulo(double base, double altura, Punto centro){
        this.lado1=this.lado3=base;
        this.lado2=this.lado4=altura;
        this.centro=centro;
    }

    @Override
    public String toString() {
        return "Rectangulo (" + "base=" + this.lado1 + " altura=" + this.lado2 + 
                " centro=" + this.centro.toString() + ")";
    }

    @Override
    public double calcularArea() {
       return this.lado1*this.lado2;
    }
    
    public double calcularDiagonal(){
        //Math.hypot(lado1, lado2);
        this.diagonal=Math.sqrt(this.lado1*this.lado1 + this.lado2*this.lado2);
        return diagonal;
    }
           
}
