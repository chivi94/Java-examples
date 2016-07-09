package ejercicio2;

abstract public class Empleado {

    protected String nif;
    protected String nombre;
    protected int edad;

    public Empleado(String _nif, String _nombre, int _edad) {
        this.nif = _nif;
        this.nombre = _nombre;
        this.edad = _edad;
    }

    @Override
    public String toString() {
        String s;
        s = "Nombre: " + this.nombre + "\n";
        s += "NIF: " + this.nif + "\n";
        s += "Edad: " + this.edad;
        return s;
    }

    abstract public double calcularSalarioMensual();
}
