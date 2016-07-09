package Ejercicio4_bis;

//Representa las caracteristicas comunes de los clientes del sistema

//implementa el comportamiento de la interfaz Usuario que debe de seguir
abstract public class Cliente implements Usuario {

    protected String nombre;
    protected String dni;
    protected int seg; //contador de segundos de conexión del cliente
    protected double precioSeg; //lo que vale cada segundo de conexión

    public Cliente(String nombre, String dni, double precioSeg) {
        this.nombre = nombre;
        this.dni = dni;
        this.precioSeg = precioSeg;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDNI() {
        return this.dni;
    }
    
    public double getPrecioSeg() {
        return this.precioSeg;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioSeg(double precio) {
        this.precioSeg = precio;
    }
   
    //Definimos los metodos comunes a todos los clientes
    @Override
    public void reset() {
        this.seg = 0;
    }

    //Dejamos que que el importe lo calcule cada cliente segun su oferta
    @Override
    abstract public double importe();
    
    @Override
    abstract public void conexion(int s);

}
