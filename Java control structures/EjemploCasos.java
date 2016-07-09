package Ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EjemploCasos {

    public static void main(String[] args) {
        try {
            /*
             * Nivel de satisfacción: 1-Muy mala 2-Mala 3-Normal 4-Buena 5-Muy
             * Buena
             */
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Nivel de satisfacción:");
            int respuesta = Integer.parseInt(teclado.readLine());

            //evaluamos la variable respuesta.Se hace con switch

            switch (respuesta) {
                case 1:
                    System.out.println("Muy mala");
                    break;//si no se pone el break,no se cierra el caso,hasta que encuentra un break
                case 2:
                    System.out.println("Mala");
                    break;
                case 3:
                    System.out.println("Normal");
                    break;
                case 4:
                    System.out.println("Buena");
                    break;
                case 5:
                    System.out.println("Muy buena");
                    break;
                default://en cualquier otro caso,se realiza lo puesto después de default
                    System.out.println("Opción incorrecta");//no hace falta poner break porque es la ultima instrucción
            }
//esta es la forma de hacerlo con if-else anidados
            if (respuesta == 1) {
                System.out.println("Muy mala");
            } else if (respuesta == 2) {
                System.out.println("Mala");
            } else if (respuesta == 3) {
                System.out.println("Normal");
            } else if (respuesta == 4) {
                System.out.println("Buena");
            } else if (respuesta == 5) {
                System.out.println("Muy buena");
            } else {
                System.out.println("Respuesta incorrecta");
            }
            
            







        } catch (IOException ex) {
            Logger.getLogger(EjemploCasos.class.getName()).log(Level.SEVERE, null, ex);
        }



    }
}
