/*9. Hacer un programa llamado MCD que pida al usuario dos números enteros positivos y que calcule el máximo común divisor de ambos.
 Encapsular toda la implementación en un método de tipo int llamado mcd que reciba dos parámetros de tipo entero, el
 primero de ellos debe ser el mayor de los dos números. Para el cálculo del MCD utilizar el algoritmo de Euclides, 
 que consiste en dividir el mayor número por el menor, quedarse con el resto y transformar dicho resto en el número menor y el 
 menor de antes en el mayor de ahora. 
 Repetir el proceso hasta que el resto sea cero. en ese momento el menor número será el máximo común divisor.*/
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio9 {

    public static int mcd(int a, int b) {
        int resto = 0;
        
        do {
            resto = a % b;
            a=b;
            b = resto;
          

        } while (resto!=0);
        return a;
    }

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            int num1 = 0;
            int num2 = 0;
            do {
                System.out.print("Introduce un número(este número debe de ser mayor que el segundo):");
                num1 = Integer.parseInt(teclado.readLine());

                System.out.print("Introduce un número(este número debe de ser menor que el primero):");
                num2 = Integer.parseInt(teclado.readLine());
                
                
                if(num2>num1){
                    System.out.println("Error.El número introducido no es válido");
                }

            } while (num1 < num2);
            System.out.println("El MCD de "+num1+" entre "+num2+" es "+mcd(num1,num2));

        } catch (IOException ex) {
            Logger.getLogger(Ejercicio9.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
