package Excepciones;

public class NoRaicesReales extends Exception {

    private double a, b, c;

    public NoRaicesReales(String msg, double a, double b, double c) { // constructor
        super(msg);  // mandamos el mensaje a la clase base Exception
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getMessage() {
        return "Para los coeficientes " + a + ", " + b + ", " + c + super.getMessage();
    }
}
