
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Capicua {

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            String s1Invertida = "";
            System.out.print("Introduce un numero ");
            int num = Integer.parseInt(teclado.readLine());
            String s1 = String.valueOf(num);
            for (int i = s1.length()-1 ; i >= 0; i--) {
                s1Invertida = s1Invertida + s1.charAt(i);
            }

            if (s1.equals(s1Invertida)) {

                System.out.println("el numero: " + num + " es capicua");
            } else{
                System.out.println("el numero: " + num + " no es capicua");
            }

        } catch (IOException ex) {
            Logger.getLogger(Capicua.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
