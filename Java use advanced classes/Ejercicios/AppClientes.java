

package Ejercicios;

public class AppClientes {
    
    public static void main(String[] args) {
        
        Cliente1 cli1=new Cliente1("12333213A","pepe",10);
        cli1.conexion(200);
        cli1.importe();
        
        System.out.println(cli1.toString()); 
        
        
    
        
    }
}
