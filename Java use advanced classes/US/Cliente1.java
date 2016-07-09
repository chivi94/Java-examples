package US;

/**
 *
 * @author Ivan
 */
public class Cliente1 implements Usuario, Oferta1 {

    private int segundos1;
    private double precioSegundo;
    private double pago;
    private String dni1 = "";
    private String nombreCliente1 = "";

    public Cliente1(String dni, String nombre, double precioSegundo) {
        this.nombreCliente1 = nombre;
        this.dni1 = dni;
        this.precioSegundo = precioSegundo;
    }

    @Override
    public void conexion(int s) {
        this.segundos1 = s;
    }

    @Override
    public void reset() {
        System.out.println("Su cuenta ha sido reseteada. Importe total a pagar: " + this.pago);
        conexion(0);
    }

    @Override
    public double importe() {
        if (this.segundos1 <= Oferta1.segundos) {
            pago = 0;
        } else if (this.segundos1 > Oferta1.segundos) {
            pago = this.precioSegundo * (segundos1 - Oferta1.segundos);
        }
        return pago;
    }

    @Override
    public String toString() {
        String s = "";
        s = "Cliente 1: " + nombreCliente1;
        s += "\nDni: " + dni1;
        s += "\nTiempo de conexion (en segundos): " + this.segundos1;
        s += "\nPrecio por minuto: " + this.precioSegundo;
        s += "\nTotal a pagar: " + this.pago;
        return s;

    }
}
