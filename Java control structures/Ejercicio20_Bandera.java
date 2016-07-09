package EjerciciosTema3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ejercicio20_Bandera {
    public static void main(String[] args) {
        try {
            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
               System.out.println("Introduce S/N ");
               //voy a realizar el ejercicio con una bandera
               boolean seguir=true;
               char respuesta=teclado.readLine().charAt(0);
               
               while(seguir){
                   if(respuesta=='S'||respuesta=='N'||respuesta=='n'||respuesta=='s'){
                       seguir=false;
                       System.out.println("Fin del programa");
                       
                   
                   }else if(respuesta!='S'||respuesta!='N'||respuesta!='n'||respuesta!='s'){
                   System.out.println("Error.Introduce S o N:");
                   respuesta=teclado.readLine().charAt(0);
                   
               }else{
                       System.out.println("Introduce S/N");
                       respuesta=teclado.readLine().charAt(0);
                   }
               }
        } catch (IOException ex) {
            System.err.println("Error");
        }
    }
}
