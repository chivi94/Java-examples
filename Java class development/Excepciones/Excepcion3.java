package Excepciones;

// Programa que solicita un entero hasta que sea valido
// Utiliza el modelo de REANUDACIÓN para manejar la excepción
// metiendo dentro de un while el bloque try-catch
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excepcion3 {

    static BufferedReader teclado;

    public static void main(String[] args) {
        //acceso al teclado
        teclado = new BufferedReader(new InputStreamReader(System.in));

        int num = 0;
        boolean noValido = true; //controla la permanencia en el bucle

        while (noValido) {
            //Todo se ejecuta bien cuando se ejecutan todas las líneas de código
            try {//Código que puede causar excepción
                System.out.print("Introduce un entero: ");
                num = Integer.parseInt(teclado.readLine());
                
                comprobarRango(num);//Este código también puede causar excepción
                noValido = false;

            } catch (NumberFormatException e) { //si metemos letras
                System.out.println("Numero no valido");
            } catch (Exception e) { //si se sale del rango + cualquier otra(es una excepción genérica)
                System.out.println(e.getMessage());//Coge el mensaje del objeto excepción creado
            }
        }
    }

    public static void comprobarRango(int num) throws Exception  {//Esto es una excepción de usuario,lanzada mediante el throw
        if (num>200&&num<250) {          
            throw new Exception ("Fuera de rango");
        }
        
    }
}
