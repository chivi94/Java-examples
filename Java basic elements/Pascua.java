package EjerciciosTema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Pascua {

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduce año:");
            int año = Integer.parseInt(teclado.readLine());
            int A = año % 19;
            int B = año % 4;
            int C = año % 7;
            int D = (19 * A + 24) % 30;
            int E = (2 * B + 4 * C + 6 * D + 5) % 7;
            int N = 22 + D + E;
            int abril=N-30;
            String resultado=(N<=31)?"de Marzo":"de Abril";
            System.out.println("El domingo de Pascua es:"+resultado+" del año "+año);
            
            
        } catch (IOException ex) {
            Logger.getLogger(Pascua.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
