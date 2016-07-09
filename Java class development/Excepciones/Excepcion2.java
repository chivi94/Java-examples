package Excepciones;



// Divide 2 numeros introducidos por teclado
// Para ello utiliza un método que propaga el error (throws) al main

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Excepcion2 {

    static BufferedReader teclado;

    public static void main(String[] args) {
        //acceso al teclado
        teclado = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Introduce el numerador: ");
            int a = Integer.parseInt(teclado.readLine());
            System.out.print("Introduce el denominador: ");
            int b = Integer.parseInt(teclado.readLine());

            System.out.println("El resultado de dividir " + a + "/" + b + " es: " + dividir(a, b));

        } catch (IOException ex) {
            Logger.getLogger(Excepcion2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ArithmeticException e) { //aquí se captura
            System.out.println(e.getMessage());
            //System.out.println(e.toString());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    //Método que recibe dos parámetros y devuelve su división
    public static double dividir(double a, double b) throws ArithmeticException  {

        /* Indicamos con throws que el metodo lanza excepciones de tipo (Exception),
        que seran manejadas por el metodo que llama
         */
        
        if (b == 0) {
            throw new ArithmeticException("Error: division por cero");
        }
         if(b==25){
         throw new NullPointerException();
        } else {
            return a / b;
        }

    }
}
