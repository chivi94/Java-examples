package EjemplosEventos;

import java.util.Date;

public class Amigo {
    
    private String nombre;
    private String apellidos;
    private Date fechaNac;
    private String tf;

    public Amigo(String nombre, String apellidos, Date fechaNac, String tf) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.tf = tf;
    }

    public String getApellidos() {
        return apellidos;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTf() {
        return tf;
    }

    @Override
    public String toString() {
        return nombre +  " " + apellidos;
    }
    
    
    
}
