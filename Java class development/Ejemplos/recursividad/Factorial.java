
package Ejemplos.recursividad;


public class Factorial {
    
    public static void main(String[] args) {
        int resultado=1;
        int i=4;
//        for (int j = i; j >= 1; j--) {
//            resultado*=j;
//        }
//        System.out.println("El factorial de "+i+" es: "+resultado);
        do{   
            resultado*=i;
            i--;
        }while(i>0);
        System.out.println(resultado);
    }
    
}
