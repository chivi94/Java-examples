package Ejercicios;

public class Datos {

    public static void sumaPares(int[] enteros) {
        int suma = 0;
        for (int i = 0; i < enteros.length; i++) {
            if (i % 2 == 0) {
                System.out.println(enteros[i]);
                suma += enteros[i];
            }

        }
        System.out.println("Suma de las posiciones pares:"+suma);
    }
    
    static int [] entero;
    public static void main(String[] args) {

         entero = new int[10];
        for (int i = 0; i < 10; i++) {
            entero[i] = i + 1;
        }
        sumaPares(entero);
    }

}
