
package Ejercicios;

public class Ejercicio2Cliente {
    //Atributos
    private static int cont;
    private static int cod;
    
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private int telefono;
    //Constructor parametrizado
    public Ejercicio2Cliente(String dni,String nombre,String apellidos){
        cont++;
        this.dni=dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.direccion="";
        this.telefono=0;
        this.cod=cont;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public static int getCod() {
        return cod;
    }

    public static void setCod(int cod) {
        Ejercicio2Cliente.cod = cod;
    }

    public static int getCont() {
        return cont;
    }

    public static void setCont(int cont) {
        Ejercicio2Cliente.cont = cont;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public  String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Ejercicio1Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }
    
}
