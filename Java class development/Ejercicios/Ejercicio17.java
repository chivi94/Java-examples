/*17. Realizar un programa que mediante un método recursivo calcule el numero combinatorio m sobre n donde:
C(m,n)=1 si n = 0 o n = m
C(m,n)=m s n = 1 o n = m-1
C(m,n)=C(m-1,n-1) + C(m-1,n) en cualquier otro caso
Ejercicios Programación
4
Los números m y n serán introducidos por teclado. Debes controlar que m y n sean mayores que 0 y que m sea mayor que n, en caso contrario, 
el programa finalizará informando al usuario con los mensajes adecuados.
NOTA: Los números combinatorios se utilizan para establecer agrupaciones en las que no importa el orden y los elementos no se pueden repetir, 
es decir, para calcular directamente las combinaciones. Se representan así:
(m
n)
Y se lee “m sobre n”.
Por ejemplo (49 sobre 6) es el nº de combinaciones posibles en
la primitiva.
Para este ejemplo el resultado es 13983816.*/
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ejercicio17 {
    public static int comb(int m,int n){
        do{
            if(n==0||n==m){
                return 1;
            }
            else if(n==1||n==m-1){
                return m;
            }else{
               return comb(m-1,n-1)+comb(m-1,n); 
            }
            
        }while((n>0&&n>0)||(m>n));
        
    }
    public static void main(String[] args)  {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduce primer número:");
            int m=Integer.parseInt(teclado.readLine());
            if(m<=0){
                throw new Exception("Los números han de ser mayores de 0");
            }
            System.out.print("Introduce segundo número:");
            int n=Integer.parseInt(teclado.readLine());
            if(n<=0){
                throw new Exception("Los números han de ser mayores de 0");
            }
            if(n>m){
                throw new Exception("El número "+n+" es mayor que el número "+m);
            }
            
            int resultado=comb(m,n);
            System.out.println("El resultado de la combinación de "+m+" sobre"+n+" es:"+resultado);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio17.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception c){
            System.out.println(c.getMessage());
        }
    }
}
