package EjerciciosTema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejercicio21 {

    public static void main(String[] args) {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        int numero = 0;
        int suma = 0;//variable para sumar los múltiplos de 5
        int mayor =Integer.MIN_VALUE;//variable para saber que número introducido es el mayor de todos,incluyendo los negativos
        int cont = 0;//Contador de números
        boolean seguir = true;//bandera de control del programa
        String comprobar = null;//cadena que comprobará si ha introducido nada para finalizar el programa

        try {
            do {
                System.out.println("Introduce número:");
                comprobar = teclado.readLine();//como cadena
                if ("".equals(comprobar)) {//equals es el método equivalente a la comparación para comparar cadenas
                    seguir = false;//comprobar si la cadena introducida está vacía
                    System.out.println("Fin del programa:");
                    cont++;
                } else {//si no lo es,leemos número e incrementamos el contador
                    numero = Integer.parseInt(comprobar);
                    //contamos los números introducidos
                    if (numero % 5 == 0) {
                        suma += numero;//sumamos los múltiplos de 5(solo los múltiplos de 5)
                    }
                         if (numero > mayor) {
                            mayor = numero;//comprobamos que número introducido es el mayor de todos,y le asignamos el valor
                            //del número a la variable mayor
                        }
                    
                    
                }
            }while (seguir);//salimos del bucle
                //mostramos por pantalla todos los resultados especificados por el ejercicio
                System.out.println("La suma de los múltiplos de 5 es= " + suma);
                System.out.println("El mayor de todos los números introducidos es el número: " + mayor);
                System.out.println("La cantidad de números introducida es: " + cont);

            //try
            }catch (IOException ex) {
            Logger.getLogger(Ejercicio21.class.getName()).log(Level.SEVERE, null, ex);
        } //catch               

        }//public
    }//class

