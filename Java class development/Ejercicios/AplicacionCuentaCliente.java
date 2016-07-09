
package Ejercicios;


public class AplicacionCuentaCliente {
    public static void main(String[] args) {
        
    
    Ejercicio2Cliente pp=new Ejercicio2Cliente("123456798A","Pepe","Perez");
    Ejercicio2Cuenta cuenta=new Ejercicio2Cuenta(pp.getDni(),123123123);
    
        System.out.println(pp.toString());
        System.out.println(cuenta.toString());
    }
}
