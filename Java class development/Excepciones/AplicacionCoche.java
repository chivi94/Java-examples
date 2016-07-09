package Excepciones;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class AplicacionCoche {

    static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    public static void menu() {
        System.out.println("(a)Arrancar");
        System.out.println("(p)Parar");
        System.out.println("(+)Acelerar");
        System.out.println("(-)Decelerar");
        System.out.println("(+)Acelerar");
        System.out.println("(r)Respostar");
        System.out.println("(s)Salir");
        System.out.println("-------------");
        System.out.print("Petición:");

    }

    public static void main(String[] args) {

        Coche coche1 = new Coche("1234ABC", 120, 50);

        coche1.setMarca("Wolkswagen");
        coche1.setModelo("Passat");
        boolean seguir=true;
        char opcion = 0;
        do {
            try {
                menu();
                opcion = teclado.readLine().toLowerCase().charAt(0);//toLowerCase transforma lo introducido por teclado a minúsculas.toUpperCase lo transforma a mayúsculas
                switch (opcion) {
                    case 'a':
                        coche1.arrancar();
                        break;
                    case 'p':
                        coche1.parar();
                        break;
                    case '+':
                        coche1.acelerar();
                        break;
                    case '-':
                        coche1.decelerar();
                        break;
                    case 'r':
                        System.out.print("Litros: ");
                        double l = Double.parseDouble(teclado.readLine());
                        coche1.repostar(l);
                        break;
                    case's':
                        seguir=false;
                        System.out.println("Fin del programa");
                        break;
                    default:
                        System.out.println("Error,opción no válida");

                }
            
            }catch(Exception e){
            System.out.println(e.getMessage());
        }

       } while (seguir);

    }

}
