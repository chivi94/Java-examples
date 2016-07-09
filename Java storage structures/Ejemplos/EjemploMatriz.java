package Ejemplos;

import java.util.Arrays;

public class EjemploMatriz {

    public static void mostrarTablero(char[][] tabla) {
        int NF = tabla.length;//Muestra el número de filas
        int NC = tabla[0].length;//Muestra el número de columnas
        for (int i = 0; i < NF; i++) {//recorre las filas
            for (int j = 0; j < NC; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();//salto de línea

        }
    }

    public static void llenarDeAgua(char[][] tabla) {
        //Llenamos el tablero de agua
        int NF = tabla.length;//Muestra el número de filas
        int NC = tabla[0].length;//Muestra el número de columnas
//        for (int i = 0; i < NF; i++) {//recorre las filas
//            for (int j = 0; j < NC; j++) {
//               tabla[i][j]='A';
//            }            
//        }
        for (int i = 0; i < NF; i++) {
            Arrays.fill(tabla[i], 'A');

        }
    }

    //PPPPP
    public static void colocarPortaAviones(char[][] tabla, int f, int c) {
        //Colocar el barco en la posición i,j en horizontal

        for (int i = c - 1; i < (c - 1) + 5; i++) {//recorre las columnas donde colocar P
            tabla[f - 1][i] = 'P';
        }

    }

    //BBBB
    public static void colocarBuque(char[][] tabla, int f, int c) {
        //Colocar el barco en la posición i,j en horizontal

        for (int i = f - 1; i < (f - 1) + 4; i++) {//recorre las columnas donde colocar P
            tabla[i][c - 1] = 'B';
        }

    }
    

    public static void main(String[] args) {
        //ejemplo con el juego hundir la flota

        //crear tablero 8x8
        char[][] tablero = new char[8][8];

        llenarDeAgua(tablero);
       // mostrarTablero(tablero);

        colocarPortaAviones(tablero, 1, 2);
        colocarBuque(tablero, 5, 8);
        mostrarTablero(tablero);

    }
}
