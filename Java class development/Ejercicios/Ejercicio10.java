/*10. Hacer un programa llamado MayorDe3 que pida al usuario tres
 números reales y muestre por pantalla el mayor de ellos. 
 La comparación entre los tres números debe basarse en la 
 utilización de un método llamado elMayor de tres argumentos 
 que a su vez base su funcionamiento en un método 
 llamado elMayor de dos argumentos.*/
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio10 {

    public static double elMayor(double num1, double num2, double num3) {
        double mayor = elMayor(num1, num2);

        if (num3 > mayor) {
            return num3;
        } else {
            return mayor;
        }

    }

    public static double elMayor(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Introduce el primer numero:");
            double n1 =Double.parseDouble(teclado.readLine());
            System.out.print("Introduce el segundo numero:");
            double n2=Double.parseDouble(teclado.readLine());   
            System.out.print("Introduce el tercer numero:");
            double n3=Double.parseDouble(teclado.readLine());
            
            System.out.println("El mayor de "+n1+","+n2+","+n3+",es:"+elMayor(n1,n2,n3));
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio10.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
