
package Ejemplos.recursividad;


public class Ejemplo1 {
    //Muestra los números del 0-99
    public static void contar(int i){
            System.out.println(i+" ");
            if(i==99)return;//Condición de finalización
                        
            contar(++i);
    }
    public static void main(String[] args) {
        contar(0);//Cuenta desde el 0 hasta el infinito.Es un caso de recursividad infinita
        
    }
}
