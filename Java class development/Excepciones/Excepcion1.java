package Excepciones;



// Divide 2 numeros introducidos por teclado.
// No captura la excepcion que se genera si se divide por cero.
// Es la JVM la que nos muestra la Exception.



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Excepcion1 {

    static BufferedReader teclado;

    public static void main(String[] args) {
        try {
            //acceso al teclado
            teclado = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Introduce el numerador: ");
            int a = Integer.parseInt(teclado.readLine());
            System.out.print("Introduce el denominador: ");
            int b = Integer.parseInt(teclado.readLine());

            System.out.println("El resultado de dividir " + a + "/" + b + " es: " + a / b);
        } catch (IOException ex) {
            Logger.getLogger(Excepcion1.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}
