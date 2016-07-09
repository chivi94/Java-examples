
package Ejemplos;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class EjemploNumeros {
    public static void main(String[] args) {
        
        //Formateo de números
        double resultado= -145454.0/34.0;
        System.out.println("Resultado natural = "+resultado);
        
        //utilizamos la clase NumberFormat
        NumberFormat formateador= NumberFormat.getNumberInstance();
        formateador.setMaximumFractionDigits(2);
        System.out.println("Resultado formateado = "+formateador.format(resultado));
        
        //Utilizando la clase DecimalFormat
        
        DecimalFormat formateador2= new DecimalFormat("#,##0.00;(#,##0.00)");//hay que mirar el api para ver el listado de caracteres que podemos usar
        System.out.println("Resultado = "+ formateador2.format(resultado));
        System.out.println(formateador.format(0.12345 ));
    }
    
}
