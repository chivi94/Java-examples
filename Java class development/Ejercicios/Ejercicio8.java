//8. Hacer un programa Primos que muestre por pantalla los 100 primeros números primos. Reutiliza el código del ejercicio anterior.
package Ejercicios;

public class Ejercicio8 {

   

    public static void main(String[] args) {
        
        int cont = 0;
        int i = 1;
        
        while(cont<=100) {
            if(Ejercicio7.esPrimo(i)){//reutalizacion de código de la clase del Ejercicio7(esPrimo)
                System.out.println(i+" ");//llamamos al método estático esPrimo de la clase "Ejercicio7"
                cont++;
            }
            i++;//genero el número siguiente
        }
      

    }

}
