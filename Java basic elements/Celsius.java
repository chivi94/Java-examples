/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosTema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gonriniv
 */
public class Celsius {

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Introduce la temperatuda en ºC");
            double c = Double.parseDouble(teclado.readLine());

            double f = (9.0 / 5.0) * c + 32;
            
            System.out.println("El equivalente en grados Farenheit es: "+f);



        } catch (IOException ex) {
            Logger.getLogger(Celsius.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
