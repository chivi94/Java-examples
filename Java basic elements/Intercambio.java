
package EjerciciosTema2;


public class Intercambio {
    public static void main(String[] args) {
        
        int numero1=3;
        int numero2=8;
        
        System.out.println("El primer valor es:\n"+"Numero 1:"+numero1+"\nEl segundo valor es:\n"+"Numero 2:"+numero2);
        
        int numero;
        numero=numero1;
        numero1=numero2;
        numero2=numero;
        
        System.out.println("El valor intercambiado es:\n"+"Numero 1:"+numero1+"\n"+"El segundo valor es: \n"+"Numero 2:"+numero2);
    }
    
}
