package Ejemplos;


public class Calculadora {
    
    public static int suma(int a,int b){
        return a+b;
    }
    public static int resta(int a,int b){
        return a-b;
    }
    public static int division(int a,int b){
        return a/b;
    }
    public static int multiplicacion(int a,int b){
        return a*b;
    }
    
    public static void main(String[] args) {
        //utilizar la calculadora
        int num1=2;
        int num2=6;
      
        System.out.println("Suma="+Calculadora.suma(num1, num2));
        System.out.println("Resta="+Calculadora.resta(num1, num2));
        System.out.println("Division="+Calculadora.division(num1, num2));
        System.out.println("Multiplicacion="+Calculadora.multiplicacion(num1, num2));
    }
}
