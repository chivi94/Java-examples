package Ejercicios;

public class Ejercicio1Habitante {
    //Atributos

    private String nacionalidad;
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private char sexo;
    private String domicilio;
    private String provincia;
    private int cp;

    //Constructor
    public Ejercicio1Habitante(String nacionalidad, String dni) {
        this.nacionalidad = nacionalidad;
        this.dni = dni;
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
        this.sexo = ' ';
        this.domicilio = "";
        this.provincia = "";
        this.cp = 0;
    }

    @Override
    public String toString() {
        return "Ejercicio1Habitante{" + "nacionalidad=" + nacionalidad + ", dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", sexo=" + sexo + ", domicilio=" + domicilio + ", provincia=" + provincia + ", cp=" + cp + '}';
    }
    
}
