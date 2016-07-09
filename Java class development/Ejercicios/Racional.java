/*Definir la clase Racional*/
package Ejercicios;

public class Racional {
    //Atributos
    private int numerador;
    private int denominador;
    //Contructor por defecto
    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;

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

    public double toDecimal() {
        double decimal = ((double) this.numerador) / ((double) this.denominador);

        return decimal;
    }

    @Override
    public String toString() {
        return "Racional{" + this.numerador + "/" + this.denominador + '}';
    }

    public void simplificar() {
        if (this.denominador > this.numerador) {
            for (int i = 2; i <= this.numerador; i++) {
                if (this.numerador % i == 0 && this.denominador % i == 0) {
                    this.numerador = this.numerador / i;
                    this.denominador = this.denominador / i;
                }
            }
            System.out.println("El numero simplificado es:" + this.numerador + "/" + this.denominador);

        } else if (this.numerador > this.denominador) {
            if (this.numerador % this.denominador == 0) {
                int resultado = this.numerador / this.denominador;
                System.out.println("El numero simplificado es:" + resultado);
            } else {
                System.out.println("El numero simplificado es:" + this.numerador + "/" + this.denominador);
            }
        }

    }

    public static int mcd(Racional a, Racional b) {
        int resto = 0;

        do {
            resto = a.denominador % b.denominador;
            a.denominador = b.denominador;
            b.denominador = resto;


        } while (b.denominador != 0);
        return a.denominador;
    }

    public static int mcm(Racional a, Racional b) {
        return (a.numerador * b.numerador) / mcd(a, b);
    }
    public Racional transformarRacional(Racional a,int mcm){
    a.denominador=mcm;
    int multiplica=0;
    
    multiplica=mcm/ a.numerador;
    a.numerador*=multiplica;
    return a;
}
    public Racional suma(Racional r){
        int new_numerador=this.numerador*this.denominador+this.denominador*this.numerador;
        int new_denominador=this.denominador*r.denominador;
        Racional nuevo=new Racional(new_numerador,new_denominador);
        return nuevo;
    }
    public Racional resta(Racional r){
        int new_numerador=this.numerador*this.denominador-this.denominador*this.numerador;
        int new_denominador=this.denominador*r.denominador;
        Racional nuevo=new Racional(new_numerador,new_denominador);
        return nuevo;
    }
    public Racional producto (Racional r){
        int num=this.numerador*r.numerador;
        int den=this.denominador*r.denominador;
        Racional nuevo=new Racional(num,den);
        return nuevo;
    }
     public Racional division(Racional r){
        int num=this.numerador/r.numerador;
        int den=this.denominador/r.denominador;
        Racional nuevo=new Racional(num,den);
        return nuevo;
    }
     
}

