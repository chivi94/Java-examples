package Ejercicios;


public class Capicua {

    public static int[] numInverso(int[] num1) {
        int[] num2 = new int[num1.length];

        for (int i = 0; i < num1.length; i++) {
            num2[i] = num1[num1.length - i - 1];
        }
        return num2;
    }

    public static void imprimirVector(int[] num) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("");
    }

    public static void comprobarCapicua(int[] num1, int[] num2) {
        int contador = 0;//Contador que contará el número de números coincidentes entre num 1 y su inverso, num2.

        for (int i = 0; i < num1.length; i++) {
            if (num1[i] == num2[i]) {
                contador++;
            }
        }
        if (contador == num1.length) {//Si todos los números coinciden, es capicúa.
            System.out.println("Es capicúa");
        } else {
            System.out.println("No es capicúa");
        }
    }

    public static void main(String[] args) {

        //int[] num1 = new int[5];
        int[] num1 = {0,1,2,2,1,0};
//        for (int i = 0; i < num1.length; i++) {
//            num1[i] = i;
//        }

        int[] num2 = numInverso(num1);

        imprimirVector(num1);
        imprimirVector(num2);

        comprobarCapicua(num1, num2);
    }
}
