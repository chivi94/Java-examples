package CocheExcepciones;

import Excepciones.Coche;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaCoche {

    static BufferedReader teclado = null;

    public static void menu() {
        System.out.println("(a) Arrancar");
        System.out.println("(+) Acelerar");
        System.out.println("(-) Decelerar");
        System.out.println("(r) Repostar");
        System.out.println("(p) Parar");
        System.out.println("-------------");
        System.out.print("Selección: ");
    }

    public static void main(String[] args) {
        try {
            teclado = new BufferedReader(new InputStreamReader(System.in));

            Coche c = new Coche("1234-ABC",120,50);
            c.setDeposito(10);
            c.setPotencia(100);
            c.setMarca("Fiat");
            c.setModelo("500");

            char opc=' ';
            do {
                try { //dentro del bucle para REANUDACIÓN
                    menu();
                    opc = teclado.readLine().toLowerCase().charAt(0);
                    switch (opc) {
                        case 'a':
                            System.out.println(c.arrancar());
                            break;
                        case '+':
                            c.acelerar();
                            break;
                        case '-':
                            c.decelerar();
                            break;
                        case 'r':
                            System.out.print("Litros: ");
                            double l = Double.parseDouble(teclado.readLine());
                            c.repostar(l);
                            break;
                        case 'p':
                            c.parar();
                            break;
                        default:
                            System.out.println("Opción incorrecta");
                    }
                } catch (Exception ex) {
                    Logger.getLogger(PruebaCoche.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ExcepcionCoche ex) {
                    System.err.println(ex.getMessage());
                }
            } while (opc != 's');

        } catch (ExcepcionCoche ex) {
            System.out.println(ex.getMessage());;
        } catch (IOException ex) {
            Logger.getLogger(PruebaCoche.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
