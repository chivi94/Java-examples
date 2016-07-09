package Ejemplos;

import java.util.Calendar;

public class EjemploWrapper {

    public static void main(String[] args) {

        int n = 7;
        Integer n1 = new Integer(7);//es objeto,el primero no;también se puede poner como cadena(siempre que lo de dentro sea convertible a entero)
        //=>"7"

        char letra = 'a';
        Character letraA = new Character('a');

        Boolean cierto = new Boolean(true);


        //String -> Tipo básico
        String s = "123";
        int num = Integer.parseInt(s);

        String s1 = "a";
        char letra1 = s1.charAt(0);
        //String -> Wrapper
        String s2 = "987";
        Integer i2 = Integer.valueOf(s2);

        //Wrapper -> String
        Integer i1 = new Integer(25);
        System.out.println(i1.toString());

        //Wrapper -> Tipo básico
        Double d1 = new Double(123.45);
        double d2 = d1.doubleValue();
        
        double a=Math.abs(-25.56);//valor absoluto
                //Calendar.MONTH;
                        

        
    }
}