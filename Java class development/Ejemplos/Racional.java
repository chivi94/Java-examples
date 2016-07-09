/*Definir la clase Racional*/
package Ejemplos;

public class Racional {
   private int numerador;
   private int denominador;
    
    public Racional(int numerador,int denominador){
        this.numerador=numerador;
        this.denominador=denominador;
        
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }
    public double toDecimal(){
        double decimal=((double)this.denominador)/((double)this.numerador);
        
        return decimal;
    }

    @Override
    public String toString() {
        return "Racional{"+ numerador +"/"+denominador + '}';
    }
    
    
    public void simplificar(){
        if(this.numerador>this.denominador){
            for (int i = 2; i < this.numerador/2; i++) {
                if((this.numerador/i==0)&&(this.denominador/i==0)){
                    this.numerador=this.numerador/i;
                    this.denominador=this.denominador/i;
                }
            }
            
        }
        
    }
   
    
}
