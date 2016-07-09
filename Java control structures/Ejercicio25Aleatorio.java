package EjerciciosTema3;

public class Ejercicio25Aleatorio {

    public static void main(String[] args) {

        int num = (int) (10 * Math.random() + 1);//generamos un número aleatorio entre 1 y 10

        System.out.println("Potencias de " + num + " menores que 1000");

        int potencia = 1;//Almacena las potencias
        int i = 1;//Exponentes para generar las potencias

        while (potencia < 1000) {
            if (num == 1) {
                System.out.println("Todas las potencias de (" + num + ") son igual a 1");
                potencia = 10000;

            } else {

                System.out.println(potencia + " ");
                potencia = (int) Math.pow(num, i);
                i++;//incrementamos el exponente

            }
        }
        System.out.println();//salto de línea
    }
}
