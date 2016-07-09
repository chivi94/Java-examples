package EjemploCSV;

public class Contacto {

    private String nombre;
    private int codigo;
    private String telefono;

    public Contacto( int codigo, String nombre,String telefono) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Codigo: " + this.codigo + "\tNombre: " + this.nombre + "\tTlf: " + this.telefono;
    }

}
