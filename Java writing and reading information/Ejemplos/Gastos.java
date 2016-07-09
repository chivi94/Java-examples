

import java.io.*;
import java.util.*;
import java.text.*;

//Previamente copimos el fichero gastos.dat en la carpeta "Ficheros"
//del paquete actual
public class Gastos {

    public static void main(String[] args) {

        File fichero = new File(".\\src\\Ficheros\\gastos.dat");

        try {

            // 1. Abrimos el fichero
            BufferedReader br = new BufferedReader(new FileReader(fichero));

            // 2. Leemos los datos del fichero
            String linea = ""; //almacena cada linea del fichero
            String concepto = ""; //almacena el token referente al concepto
            String eur = ""; //almacena el token referente a la cantidad en euros
            double acumulado = 0; //acumulador de cantidades

            StringTokenizer st = null;

            linea = br.readLine(); //lectura anticipada
            while (linea != null) {
                st = new StringTokenizer(linea, " ");   // Creo la cadena delimitada
                                                        // por un espacio
                //proceso los tokens individuales
                concepto = st.nextToken(); // 1er. token: CONCEPTO
                eur = st.nextToken(); // 2º token: EUROS
                acumulado += Double.parseDouble(eur); // ACUMULADO
                //mostramos la informacion de cada linea por pantalla
                System.out.println(concepto + ":   \t" + eur + " EUR");

                linea = br.readLine(); //leemos la siguiente linea
            }

            //Mostramos el total
            System.out.println();

            DecimalFormat formateador = new DecimalFormat("#.00");
            System.out.println("Total: " + formateador.format(acumulado) + " EUR");

            // 3. Cerramos el fichero
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println(fichero + " no existe!!!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

