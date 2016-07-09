
package Ejemplos.recursividad;


public class FactorialRecursivo {
    
    public static int fact(int n){
        if(n==0)return 1;//Condición de finalización        
        return n*fact(n-1);//Llamada recursiva 
        
    }
    public static void main(String[] args) {
        int resultado=fact(4);
        System.out.println("El factorial es: "+resultado);
    }
}
