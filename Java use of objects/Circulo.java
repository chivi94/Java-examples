
package Ejemplos;


public class Circulo {
    
    //Atributos
    private double radio;
    
    //Operaciones:métodos
    
    public void setRadio(int r){
        radio=r;
    }
    public double calcularArea(){
        return Math.PI*Math.pow(radio,2);
    }
}
