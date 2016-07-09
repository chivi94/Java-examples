package EjerciciosTema3;

public class OperacionesAritmeticas {

    public static void main(String[] args) {
        int A = (int) (Math.random() * 11);
        int B = (int) (Math.random() * 11);
        int suma = A + B;
        int resta = A - B;
        int multiplicación = A * B;
        if (B == 0) {
            System.out.println("SUMA:" + "\n(A)" + A + "+(B)" + B + "=" + suma);
            System.out.println("RESTA:" + "\n(A)" + A + "-(B)" + B + "=" + resta);
            System.out.println("MULTIPLICACION:" + "\n(A)" + A + "*(B)" + B + "=" + multiplicación);


        } else {
            double división = (double) A / (double) B;
            int cociente = A % B;

            System.out.println("SUMA:" + "\n(A)" + A + "+(B)" + B + "=" + suma);
            System.out.println("RESTA:" + "\n(A)" + A + "-(B)" + B + "=" + resta);
            System.out.println("MULTIPLICACION:" + "\n(A)" + A + "*(B)" + B + "=" + multiplicación);
            System.out.println("DIVISION:" + "\n(A)" + A + "/(B)" + B + "=" + división);
            System.out.println("COCIENTE:" + "\n(A)" + A + "%(B)" + B + "=" + cociente);
        }


    }
}
