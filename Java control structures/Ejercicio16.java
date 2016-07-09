
package EjerciciosTema3;


public class Ejercicio16 {
    public static void main(String[] args) {
        int num=0;
        int contador=0;
        while(num>=0&&num<100){
            if(num%2!=0){
                System.out.println(num);
                contador++;
              
            }
            num++;
        }
        System.out.println("El número de impares es:"+contador);
    }
    
}
