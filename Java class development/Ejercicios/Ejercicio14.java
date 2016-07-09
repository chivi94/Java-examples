/*14. Escribir un programa que mediante un método recursivo calcule la siguiente serie aritmética:
S = 1/2 + 2/3 + 3/4 + 4/5 + 5/6 = S(5)*/
package Ejercicios;


public class Ejercicio14 {
    public static double s(double n){
        if(n==1)return 0.5;
        return (n/(n+1))+s(n-1);
    }
    public static void main(String[] args) {
        System.out.println(s(5.0));
    }
    
}
