package Ejercicios;

public class Permutación {

    public static void mostrarMatriz(int[][] m) {
        int NF = m.length;
        int NC = m[0].length;
        for (int i = 0; i < NF; i++) {
            for (int j = 0; j < NC; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void llenarMatriz(int[][] m) {
        int NF = m.length;
        int NC = m[0].length;
        for (int i = 0; i < NF; i++) {
            for (int j = 0; j < NC; j++) {
                m[i][j] = (int) ((Math.random() * 15) + 1);
            }
        }
    }

    public static void permutaFilas(int[][] m, int fila1, int fila2) {
        int NF = m.length;//número de filas
        int aux;//matriz auxiliar para guardar la fila que se desea 
        
        for (int i = 0; i < NF; i++) {//Recorremos filas
            aux = m[fila1][i];
            m[fila1][i] = m[fila2][i];
            m[fila2][i] = aux;

        }
        mostrarMatriz(m);
    }

    public static void permutaColumnas(int[][] m, int columna1, int columna2) {
        int NC=m[0].length;
        int aux;
        
        for (int i = 0; i < NC; i++) {
            aux=m[i][columna1];
            m[i][columna1]=m[i][columna2];
            m[i][columna2]=aux;
        }
        mostrarMatriz(m);
    }

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        llenarMatriz(matriz);
        System.out.println("Matriz inicial:");
        mostrarMatriz(matriz);
        System.out.println("------------");
        System.out.println("Matriz con segunda y tercera filas permutadas:");
        permutaFilas(matriz, 1, 2);
        System.out.println("-------------");
        System.out.println("Matriz con segunda y tercera columnas permutadas:");
        permutaColumnas(matriz,1,2);
    }

}
