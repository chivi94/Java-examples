package Ejemplos;

import java.util.*;

//Programa que genera 10 numeros aleatorios

public class Aleatorio1 {

	public static void main(String[] args) {
		
		Random r1=new Random();
		for(int i=0;i<10;i++){
                    
			System.out.println(r1.nextInt(11)+10);//genera aleatorios entre 1 y 10.
                        //los parámetros se ponen en el paréntesis para indicar el máximo.
                        //ejemplo:En el nextInt(11)+10 generará números desde el 10 hasta el 20
                        //Se basa en el mínimo(10)hasta el máximo(11+10)menos una unidad
		}
                
                String s1="Hola me llamo lola";
                String s2="Adiós";
                
                System.out.println(s1.compareTo(s2));//devuelve un número positivo cuando va después en orden alfabético
                //El orden va en sentido decreciente(positivo de sentido 'z' hacia 'a',negativo de sentido 'a' hacia 'z'.
                //El número que imprime es la diferencia de los códigos ASCII,comparando cada caracter hasta que encuentra 2 distintos
                
                System.out.println(s1.indexOf("la"));//En "Hola" busca la subcadena indicada.Si la encuentra,te dice a partir de que
                                                    //posición se encuentra(mediante un número) esa subcadena.Si no la encuentra devuelve -1
        
                System.out.println(s1.indexOf("la",3));//En este caso se indica la posición desde la que queremos buscar la subcadena
                System.out.println(s1.indexOf('a'));//En este caso te indica la posición en la que nos encontramos el caracter.Devuelve
                                                    //-1 si no lo encuentra
        
                //mostrar las letras de la cadena s1
                for(int i=0;i<s1.length();i++){//se recorre la cadena guardada en s1.
                                           //si pones i<=...hay que poner -1 después de lo que pones para que recorra los caracteres que hay
                                         //si i<...no hace falta poner -1 porque es menor de forma estricta,no se va a salir del rango
                    System.out.println(s1.charAt(i));
                 }   
                    s1.replace('o', 'x');
                    System.out.println(s1);
                    System.out.println(s1.replace('o', 'x'));//en este caso s1 sigue existiendo como antes.Para cambiarlo habría que poner:
                    
                    
                    s1=s1.replace('o','x');//aquí sustituimos la cadena s1 por los valores indicados ahora;s1 existe,pero con los nuevos valores
                    System.out.println(s1);
                    
                    String nombre="Macarena";
                    String alias=nombre.substring(0,2);//el fin de la cadena tienes que indicarlo con una posicion mayor de la que deseas que capte
                                                       //capta el final de la cadena con la posición indicada,menos una unidad
                    String resto=nombre.substring(4);
                    System.out.println(alias);
                    System.out.println(resto);
                    
                
        
                
        }
        
        

}
