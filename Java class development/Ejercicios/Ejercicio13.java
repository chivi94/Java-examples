/*13. Escribir un programa que mediante un método recursivo calcule la siguiente serie geométrica:
P = 1/5 * 1/4 * 1/3 * 1/2 * 1/1 = P(5)*/
package Ejercicios;


public class Ejercicio13 {
    public static double p(double n){
        if(n==1)return 1.0;
            
        return (1.0/n)*p(n-1);
    }
    public static void main(String[] args) {
        
        System.out.println(p(5.0));
    }
}
