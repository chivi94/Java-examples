
package Ejercicios;


public class AplicacionRacional {
    
    public static void main(String[] args) {
        Racional r0=new Racional(1,2);
        System.out.println("En decimal: "+r0.toDecimal());
        
        Racional r1=new Racional(2,3);
        Racional r2=new Racional(6,9);
        
        System.out.println(r1.suma(r2).toString());//  4/3
        
        Racional r3=new Racional (5,6);
        Racional r4=new Racional(6,9);
        
        System.out.println(r3.resta(r4).toString());
        
        Racional r5=new Racional (4,7);
        Racional r6=new Racional(3,5);
        System.out.println(r5.producto(r6).toString());
        
        
        r2.simplificar();
    }
    
}
