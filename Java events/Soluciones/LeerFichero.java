package Soluciones;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerFichero {

    public static void leerParticipantes() throws FileNotFoundException {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        boolean EOF = false;
        try {
            fis=new FileInputStream("src/Ficheros/participantes.obj");
            ois = new ObjectInputStream(fis);

            Participante p = (Participante) ois.readObject();
            while (!EOF) {
                System.out.println(p);
                p = (Participante) ois.readObject();
            }
        } catch (EOFException ex) {
            EOF = true;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();

            }
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        leerParticipantes();
    }
}
