/*7. Escribe un programa Matriz1 que genere un array bidimensional 5x5, de tal forma que sus filas pares sean múltiplos de 2 y las impares sean múltiplos de 3. Además diseña los siguientes métodos:
 a. imprimirMatriz: muestra por pantalla la matriz creada.
 b. sumaMatriz: muestra la suma de todos sus elementos.
 c. diagonal: imprime los elementos de su diagonal principal.*/
package Ejercicios;


public class Matriz1 {

    public static void rellenarMatriz(int[][] m) {
        int NF = m.length;
        int NC = m[0].length;
        int cont1 = 1; //Multiplicador impares.
        int cont2 = 1; //Multiplicador pares.

        for (int i = 0; i < NF; i++) {
            for (int j = 0; j < NC; j++) {
                if ((i + 1) % 2 != 0) {
                    m[i][j] = 3 * cont1;
                    cont1++;
                } else {
                    m[i][j] = 2 * cont2;
                    cont2++;
                }
            }
        }
    }

    public static void imprimirMatriz(int[][] m) {
        int NF = m.length;        //Número de filas.
        int NC = m[0].length;     //Número de columnas=tamaño de cualquiera de las filas.

        for (int i = 0; i < NF; i++) {    //Recorre filas.
            for (int j = 0; j < NC; j++) {  //Recorre columnas.
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void sumaMatriz(int[][] m) {
        int NF = m.length;        //Número de filas.
        int NC = m[0].length;     //Número de columnas=tamaño de cualquiera de las filas.
        int suma = 0;

        for (int i = 0; i < NF; i++) {    //Recorre filas.
            for (int j = 0; j < NC; j++) {  //Recorre columnas.
                suma += m[i][j];
            }
        }
        System.out.println("La suma de sus elementos da como resultado: " + suma);
    }

    public static void diagonal(int[][] m) {

        int NF = m.length;        //Número de filas.
        int NC = m[0].length;     //Número de columnas=tamaño de cualquiera de las filas.

        System.out.println("Los elementos de la diagonal principal son: ");

        for (int i = 0; i < NF; i++) {    //Recorre filas.
            for (int j = 0; j < NC; j++) {  //Recorre columnas.
                if (i == j) {//Si fila=columna,el elemento se encuentra en la diagonal principal
                    System.out.println(m[i][j]+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        //Creamos la matriz de 5x5
        int[][] matriz = new int[5][5];

        rellenarMatriz(matriz);
        imprimirMatriz(matriz);
        sumaMatriz(matriz);
        diagonal(matriz);
    }
}
