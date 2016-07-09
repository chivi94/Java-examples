
package EjerciciosTema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Bisiesto {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Introduce un año:");
            int año=Integer.parseInt(teclado.readLine());
             if(año%4==0&&año%100!=0||año%400==0){
                System.out.println("El año introducido es bisiesto");
                
            }else{
                System.out.println("El año introducido "+año+" no es bisiesto");
            }//Otra formas de hacer el ejercicio a continuación:
            /*if (año%4==){
             * if((año%100==0)&&(año%400!=0)){
             *  System.out.println(año+" no es bisiesto);
             * }else{
             *     System.out.println( año+" no es bisiesto");
             *   }
             * }else{
             *      System.out.println(año+" no es bisiesto");
             * }
             *///Otra forma de hacer el ejercicio
            
            /*boolean multiploDe4=(año%4==0);
             *boolean multiploDe100=(año%100==0); 
             *boolean multiploDe400=(año%400==0); 
             * 
             * boolean bisiesto=false;     es una bandera,doy un valor inicial
             * 
             * if(multiploDe4){
             *  bisiesto=true;
             *     if(multiploDe100&&!(multiploDe400)){
             *          bisiesto=false
             *      }
             * }
             * 
             * if (bisiesto){
             *      System.out.println(año+" es bisiesto");
             * }else{
             *     System.out.println(año+" no es bisiesto");
             * }
             *///Forma de hacer el ejercicio con variables booleanas
            
           
            
        } catch (IOException ex) {
            Logger.getLogger(Bisiesto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
