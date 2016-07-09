package Excepciones;


// Divide 2 numeros introducidos por teclado.
// Captura la excepcion que se genera si se divide por cero.
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excepcion1_B {

    static BufferedReader teclado;

    public static void main(String[] args){
        //acceso al teclado
        teclado = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Introduce el numerador: ");
            int a = Integer.parseInt(teclado.readLine());
            System.out.print("Introduce el denominador: ");
            int b = Integer.parseInt(teclado.readLine());

            System.out.println("El resultado de dividir " + a + "/" + b + " es: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println(e.toString());                    //Mensaje de Java
            System.out.println("Problema aritmetico: " + e.getMessage());  // Mensaje de Java
            e.printStackTrace();                               //Mensaje de Java
            System.out.println("Error: division por cero");   // Mensaje propio
        }catch(IOException e){
            System.out.println("Error de entrada/salida ");
        } catch (Exception e) {
            System.out.println("Excepcion desconocida");
        } finally {
            System.out.println("Adios...");
        }


    }
}
