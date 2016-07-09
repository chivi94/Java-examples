package EjerciciosTema3;

import java.io.*;

public class Ejercicio21Prueba {

    public static void main(String[] args) throws IOException {
        BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
        int contador = 0;
        String number;
        int suma = 0;
        int num_mayor = 0;
        boolean salir = false;
        int num = 0;

        do {
            System.out.print("Escriba un número: ");
            number = tec.readLine();

            if (number.equals("")) {
                salir = true;
            } else {
                num = Integer.parseInt(number);
                if (num % 5 == 0) {
                    suma = suma + num;
                }
                if (contador == 0) {
                    num_mayor = num;
                } else if (num > num_mayor) {
                    num_mayor = num;
                }

                contador++;
            }
        } while (!salir);
        System.out.println("Has escrito " + contador + " números");
        System.out.println("La suma de los múltiplos de 5 es: " + suma);
        System.out.println("El número mayor es: " + num_mayor);

    }
}