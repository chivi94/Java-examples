package Excepciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Excepcion5 {

    static BufferedReader teclado;

    public static void main(String[] args) throws Exception {

        //acceso al teclado
        teclado = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        boolean noValido = true;

        while (noValido) {
            try {
                System.out.print("Introduce un entero positivo: ");
                num = Integer.parseInt(teclado.readLine());

                if (num < 0) {
                    throw new MiError("Error.Numero negativo");
                }
                noValido = false;

            } catch (MiError e) {
                System.out.println(e.getMessage());
            } 
        }
    }
}
