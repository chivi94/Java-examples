package Excepciones;

public class MiError extends Exception {

    public MiError(String msg) { // constructor

        super(msg);  // damos el mensaje a la clase base Exception
    }
}
