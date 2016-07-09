/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class EditorTextos {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //acceso al teclado
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        String portapapeles = ""; //almacena la última operación de copia
        int colD=-1;
        
        //Pedimos el texto al usuario
        System.out.println("Escribe el texto (ENTER para terminar):");
        String texto = teclado.readLine();

        char opc;  //almacena la seleccion del usuario
        boolean seguir = true; //controla hasta cuando seguir
        do {
            System.out.println("");
            System.out.println("B - Buscar");
            System.out.println("C - Copiar");
            System.out.println("V - Pegar");
            System.out.println("S - Salir");
            System.out.print("Opcion: ");
            opc = teclado.readLine().toUpperCase().charAt(0);
            switch (opc) {
                case 'B': //BUSCAR
                    System.out.print("Palabra a buscar: ");
                    String palabra = teclado.readLine();

                    System.out.print("Posiciones: ");

                    int cont = 0; //contador de coincidencias
                    int pos = texto.indexOf(palabra, 0); //
                    while (pos > -1) {
                        cont++;
                        System.out.print(pos + " ");
                        pos = texto.indexOf(palabra, pos + (palabra.length()));
                    }

                    System.out.println("\nTotal coincidencias: " + cont);
                    break;
                case 'C': //COPIAR
                    portapapeles = ""; //limpiamos el portapapeles
                    //pedimos el texto a copiar
                    System.out.print("Desde columna: ");
                    int colO = Integer.parseInt(teclado.readLine());
                    System.out.print("Hasta columna: "); //incluida
                    colD = Integer.parseInt(teclado.readLine());
                    
                    //recuperamos el texto a copiar
                    portapapeles = texto.substring(colO, colD+1);

                    System.out.println("(Portapapeles: " + portapapeles + ")");
                    break;
                case 'V': //PEGAR
                    System.out.print("A partir de la columna: ");
                    int col = Integer.parseInt(teclado.readLine());
                    
                    //al texto inicial añadimos la copia
                    String aux="";
                    aux=texto.substring(0,col) + portapapeles + texto.substring(col);
                    texto=aux;
                    
                    System.out.println(texto);
                    break;
                case 'S':
                    seguir = false;
                    break;
                default:
                    System.out.println("Opción errónea");
            }
        } while (seguir);
    }

    
}
