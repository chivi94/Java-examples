package Practicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CorreccionCombinaPermuta {

    public static void main(String[] args) {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        char resp = 0;
        do {

            do {
                try {
                    System.out.println("1-Combinaciones");
                    System.out.println("2-Permutaciones");
                    System.out.println("0-Salir");
                    System.out.print("Opcion: ");
                    resp = teclado.readLine().charAt(0);
                    if (resp != '0' && resp != '1' && resp != '2') {
                        System.out.println("Error,introduce una opción correcta");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(CorreccionCombinaPermuta.class.getName()).log(Level.SEVERE, null, ex);
                }
            } while (resp != '0' && resp != '1' && resp != '2');

            int cont = 0;

            if (resp == '1') {

                System.out.println("\nCOMBINACINES DE LOS NUMEROS 1 2 3 4");
                System.out.println("------------------------------------");
                for (int i = 1; i <= 4; i++) {
                    for (int j = 1; j <= 4; j++) {
                        for (int k = 1; k <= 4; k++) {
                            for (int l = 1; l <= 4; l++) {
                                System.out.println(i + " " + j + " " + k + " " + l);
                                cont++;
                            }
                        }
                    }
                }

                System.out.println("Total: " + cont + " combinaciones");

            } else {

                System.out.println("\nPERMUTACIONES DE LOS NUMEROS 1 2 3 4");
                System.out.println("------------------------------------");
                for (int i = 1; i <= 4; i++) { //primera posicion
                    for (int j = 1; j <= 4; j++) { //segunda posicion
                        if (j != i) {
                            for (int k = 1; k <= 4; k++) { //tercer posicion
                                if ((k != j) && (k != i)) {
                                    for (int l = 1; l <= 4; l++) { //cuarta posicion
                                        if ((l != k) && (l != j) && (l != i)) {
                                            System.out.println(i + " " + j + " " + k + " " + l);
                                            cont++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                System.out.println("Total: " + cont + " permutaciones");
            }
        } while (resp != '0');

    }
}
