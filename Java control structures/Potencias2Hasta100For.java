
package EjerciciosPropuestos;


public class Potencias2Hasta100For {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        
        for(;i<=100;i++){
            int resul=(int)Math.pow(2,i);
            if(resul<=100){
                sum+=resul;
                System.out.println(resul);
            }
            
        }
        System.out.println("La suma de todas las potencias es ="+sum);
    }
    
}
