package EjerciciosTema3;

public class Ejercicio17 {

    public static void main(String[] args) {
        int num = 100;
        int suma = 0;

        while (num >= 0) {
            if (num % 2 != 0) {
                System.out.println(num);
                
                suma += num;
            }num--;
            

        }
        System.out.println("La suma de los números impares entre 0 y 100 es=" + suma);
    }
    
} 

