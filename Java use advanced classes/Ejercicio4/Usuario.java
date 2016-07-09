package Ejercicio4_bis;

import Ejercicio4.*;

public interface Usuario {

    public String dni = "";
    String nombre = "";

    void conexion(int s); //Contabiliza 's' segundos de conexión
    double importe(); //Calcula el importe facturable (según el tiempo de conexión)
    void reset(); //Pone a cero la cuenta de segundos del usuario
}
