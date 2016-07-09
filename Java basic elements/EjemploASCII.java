package Ejemplos;

public class EjemploASCII {

    public static void main(String[] args) {

//        char letra = 'h';//almacenamos el ASCII número 104
//        char letra2 = 80;//almacenamos el ASCII de la 'P'

        //A PARTIR DEL ASCII OBTENEMOS EL CARACTER CHAR
        int ASCII = 65;
//        letra = (char) ASCII;
//        System.out.println("El caracter del ASCII " + ASCII + " es: " + letra);
        System.out.println("El caracter del ASCII " + ASCII + " es: " + (char) ASCII);


        //A PARTIR DEL CARACTER OBTENEMOS EL ASCII
        char letra2 = 'o';
//        int ASCII2 = letra2;
//        System.out.println("El ASCII de la letra2 " + letra2 + " es: " + ASCII2);
        System.out.println("El ASCII de la letra2 " + letra2 + " es: " + (int) letra2);



    }
}
