package EjerciciosPropuestos;

public class Permutaciones {

    public static void main(String[] args) {


        for (int i = 1; i <= 4; i += 1) {
            for (int j = 1; j <= 4; j += 1) {
                for (int k = 1; k <= 4; k += 1) {
                    for (int l = 1; l <= 4; l += 1) {
                        if (i != j && i != k && i != l && j != k && j != l && k != l) {
                            System.out.println(i + " " + j + " " + k + " " + l);
                        }//if
                    }//for del número 4

                }//for del número 3
            }//for del número 2

        }//for del número 1



    }
}
