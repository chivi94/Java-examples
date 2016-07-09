package EjerciciosPropuestos;

public class Asteriscos {

    public static void main(String[] args) {
        int filas = (int) (10 * Math.random() + 1);
        int columnas = (int) (10 * Math.random() + 1);

        for (int i = 1; i <= filas; i++) {//para cada fila
            for (int j = 1; j <= columnas; j++) {//pintamos las columnas
                System.out.print("*");

            }
            System.out.println("");//cambiamos de fila
        }
    }
}
