package Excepciones;

public class CoeficienteAcero extends Exception {

    public CoeficienteAcero(String msg) { // constructor
        super(msg);  // mandamos el mensaje a la clase base Exception
    }
}
