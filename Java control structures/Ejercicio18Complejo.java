package EjerciciosTema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio18Complejo {

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduce un número cualquiera:");
            int num = Integer.parseInt(teclado.readLine());



            if (num >= 1) {
                //mostramos los números que hay entre 1 y num

                int unidad = 1;

                while (unidad <= num) {
                    System.out.println(unidad);
                    unidad++;
                }
            } else {//num es menor o igual a 0
                int unidad=num;
                //mostramos los números que hay entre num y unidad
                while(unidad<1){
                    System.out.println(unidad);
                    unidad++;
                }
                
            }



        } catch (IOException ex) {
            System.err.println("Error");
        }


    }
}
