package Ejemplos;

public class Persona implements Comparable<Persona> {

    private String dni;
    private int edad;

    public Persona(String dni, int edad) {
        this.dni = dni;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        String s;
        s = "DNI:" + this.dni + "\n";
        s += "Edad:" + this.edad;
        return s;
    }

    //Criterio de ordenación:Por edad
//    @Override
//    public int compareTo(Persona o) {
//        int resultado = 0;
//        if (this.edad > o.edad) {
//            resultado = 1;
//            return resultado;
//        } else if (this.edad < o.edad) {
//            resultado = -1;
//            return resultado;
//        }//En cualquier otro caso no especificado
//        return resultado;
//    }

    @Override
    //Criterio de ordenación:Por DNI
    public int compareTo(Persona o) {
        return this.dni.compareTo(o.dni);
    }
    
    

}
