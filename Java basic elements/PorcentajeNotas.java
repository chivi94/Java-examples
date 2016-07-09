package EjerciciosTema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PorcentajeNotas {

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            int total = 0;


            System.out.print("Introduzca número de Sobresalientes(SB)=");
            int sb = Integer.parseInt(teclado.readLine());
            total += sb;//5
            
            System.out.print("Introduzca número de Notables(N)=");
            int n = Integer.parseInt(teclado.readLine());
            total += n;//10
            
            System.out.print("Introduzca número de Aprobados(A)=");
            int a = Integer.parseInt(teclado.readLine());
            total += a;//25
            
            System.out.print("Introduzca número de Suspensos(S)=");
            int s = Integer.parseInt(teclado.readLine());
            total += s;//9
            
            System.out.print("Introduzca número de No Presentados(NP)=");
            int np = Integer.parseInt(teclado.readLine());
            total += np;//11
            
            System.out.print("Total=" + total);//total=60
            
            System.out.println("");
            System.out.println("SB="+sb+" "+"("+(((double)sb/(double)total))*100+"%)");
            System.out.println("N="+n+" "+"("+(((double)n/(double)total))*100+"%)");
            System.out.println("A="+a+" "+"("+(((double)a/(double)total))*100+"%)");
            System.out.println("S="+s+" "+"("+(((double)s/(double)total))*100+"%)");
            System.out.println("NP="+np+" "+"("+(((double)np/(double)total))*100+"%)");
            System.out.println("Total="+total+" ("+((total/total)*100)+" %)");
            System.out.println("Total presentados="+(total-np)+" ("+(((double)(total-np)/(double) total))*100+"%)");
            System.out.println("Total aprobados="+(sb+n+a)+" ("+(((double)(sb+n+a)/(double)(total-np)))*100+"%)");
            System.out.println("Total suspensos="+s+" ("+(((double)s/(double)(total-np)))*100+"%)");
            System.out.println("Total no presentados="+np+" ("+(((double)np/(double)total))*100+"%)");
            
            
        } catch (IOException ex) {
            Logger.getLogger(PorcentajeNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
