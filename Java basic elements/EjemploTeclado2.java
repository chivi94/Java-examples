package Ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EjemploTeclado2 {

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduce número 1: ");
            String s_numero1 = teclado.readLine();
            int numero1 = Integer.parseInt(s_numero1);
            //método para hacer cast a un objeto "String" a tipo "int"
            //su usa para hacer operaciones con estos números
            System.out.print("Introduce número 2: ");
            //-String s_numero2 = teclado.readLine();
            int numero2 = Integer.parseInt(teclado.readLine());
            //-int numero2 = Integer.parseInt(s_numero2);

            


            int suma = numero1 + numero2;//Esto es una variable intermedia
            int producto = numero1 * numero2;
            int resto = numero1 % numero2;
            double cociente=(double) numero1/(double)numero2;//hay que hacer cast en los dos operandos para
                                                             //evitar posibles problemas.Es la forma más segura

            System.out.println("El valor de la suma es:"+numero1+"+"+numero2+"="+suma);//se realiza la suma directamente
            System.out.println("El valor del producto es:"+numero1+"x"+numero2+"="+producto);
            System.out.println("El valor del resto de la división es:"+numero1+"/"+numero2+"="+resto);
            System.out.println("El valor del cociente es:"+numero1+"/"+numero2+"="+cociente);
            //System.out.println("Suma: "(numero1+numero2));
        } catch (IOException ex) {
            Logger.getLogger(EjemploTeclado2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
