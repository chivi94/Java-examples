package EjerciciosTema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Vocales {

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduce un caracter:");
            char vocal = teclado.readLine().charAt(0);

            if (vocal < 65 || vocal > 122 || (vocal > 90 && vocal < 97)) {
                System.out.println("El carácter introducido "+vocal+" no era una letra.");
            } else if (vocal == 65 || vocal == 69 || vocal == 73 || vocal == 79 || vocal == 85 || vocal == 97 || vocal == 101 || vocal == 105 || vocal == 111 || vocal == 117) {
                System.out.println("El carácter introducido " + vocal + " es una vocal");
            } else {
                System.out.println("La letra " + vocal + " es una consonante");

            }


        } catch (IOException ex) {
            Logger.getLogger(Vocales.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
