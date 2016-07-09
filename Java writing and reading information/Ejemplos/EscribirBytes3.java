package Ejemplos;

//Grabar en un fichero binario el texto DESARROLLO DE APLICACIONES MULTIPLATAFORMA
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EscribirBytes3 {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
        try {
            File f = new File("C:\\Users\\Ivan\\Desktop\\A\\texto.txt");

            fos = new FileOutputStream(f);
            bos = new BufferedOutputStream(fos);
            dos = new DataOutputStream(bos);
            System.out.print("Frase a guardar: ");
            String texto = teclado.readLine();

            for (char c : texto.toCharArray()) {
                dos.write(c);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(EscribirBytes3.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(EscribirBytes3.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bos.close();
            } catch (IOException ex) {
                Logger.getLogger(LeerBytes2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
