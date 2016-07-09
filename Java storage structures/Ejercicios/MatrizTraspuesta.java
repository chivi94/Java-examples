package Ejercicios;

public class MatrizTraspuesta {

    public static void mostrarMatriz(int[][] tabla) {
        int NF = tabla.length;//Muestra el número de filas
        int NC = tabla[0].length;//Muestra el número de columnas
        for (int i = 0; i < NF; i++) {//recorre las filas
            for (int j = 0; j < NC; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();//salto de línea

        }
    }

    public static void llenarMatriz(int[][] tabla) {
        //Llenamos el tablero de agua
        int NF = tabla.length;//Muestra el número de filas
        int NC = tabla[0].length;//Muestra el número de columnas
        for (int i = 0; i < NF; i++) {//recorre las filas
            for (int j = 0; j < NC; j++) {//recorre las columnas
                tabla[i][j] = (int) ((Math.random() * 100) + 1);
            }
        }

    }

    public static int[][] trasponerMatriz(int[][] tabla) {
        int NF = tabla.length;//Muestra el número de filas
        int NC = tabla[0].length;//Muestra el número de columnas
        //Creacion de la matriz traspuesta
        int[][] t = new int[NC][NF];
        for (int i = 0; i < NF; i++) {//recorre las filas
            for (int j = 0; j < NC; j++) {//recorre las columnas
                t[j][i] = tabla[i][j];//cambia las filas por las columnas o viceversa
            }
        }
        //devolvemos la matriz traspuesta creada
        return t;
    }

    public static void main(String[] args) {

        int[][] matriz = new int[4][5];
        int[][] matrizTraspuesta;

        llenarMatriz(matriz);
        matrizTraspuesta = trasponerMatriz(matriz);
        System.out.println("Matriz base:");
        mostrarMatriz(matriz);
        System.out.println("Matriz traspuesta:");
        mostrarMatriz(matrizTraspuesta);
    }

}
