package Ejemplos;



import java.util.*;
import java.io.*;

//Crear en la carpeta Ficheros del paquete actual
//el fichero a leer "Frase.txt"
public class EjemploTokenizer {

    public static void main(String arg[]) throws IOException {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        File archivo = new File(".\\src\\Ficheros\\Frase.txt");
        BufferedReader br = new BufferedReader(new FileReader(archivo));

        System.out.print("Introduce un separador: ");
        String sep = teclado.readLine();

        System.out.println("-------TEXTO INTEGRO------");

        String linea = "";   //almacena cada linea leida del fichero
        String texto = "";   //almacena todas las lineas del fichero

        linea = br.readLine(); //lectura previa
        while (linea != null) {
            texto += linea;  //acumulamos la linea leida
            linea = br.readLine(); //leemos la siguiente linea
        }

        //mostramos todo el contenido del fichero
        System.out.println(texto);

        System.out.println("\n-------TEXTO SEPARADO------");

        StringTokenizer st = new StringTokenizer(texto, sep);

        int n = st.countTokens();
        for (int i = 0; i < n; i++) {
            String cad = st.nextToken();
            System.out.println("TOKEN " + i + "-->" + cad);
        }
    }
}
