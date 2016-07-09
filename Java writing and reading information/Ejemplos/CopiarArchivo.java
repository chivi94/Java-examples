package Ejemplos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CopiarArchivo {

    public static void main(String[] args) {

        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
            System.out.print("Introduce [ruta]fichero origen:");
            String origen = teclado.readLine();
            System.out.print("Introduce [ruta]fichero destino:");
            String destino = teclado.readLine();

            // fichero origen debe existir sino dar� una FileNotFoundException
            // fichero destino si no existe lo crea

            String s; // almacena las lineas del fichero origen

            FileReader fr = new FileReader(origen); // abrimos para lectura el fichero origen
            FileWriter fw = new FileWriter(destino); // abrimos para escritura el fichero destino
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);
            s = br.readLine(); // lectura anticipada del fichero origen
            while (s != null) {
                //mientras queden lineas por leer
                bw.write(s); // escribimos la linea leida en el fichero destino
                bw.newLine(); // salto de linea
                s = br.readLine(); // leemos otra linea del fichero origen
            }
            // cerramos ficheros
            br.close();
            bw.close();
            System.out.println("Copia realizada.");

        } catch (FileNotFoundException e) {
            System.out.println("Error. No se encuentra el archivo.");
        } catch (IOException e) {
            System.out.println("Error de lectura/escritura.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
} 

