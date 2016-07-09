package US;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ivan
 */
public class GranCliente implements Usuario, Oferta1, Oferta2 {

    private BufferedReader teclado;
    private double descuentoIntroducido;
    private final double precioSegundo;
    private int segundosG;
    private double pago;
    private String nombreGranCliente;
    private String dniG;

    public GranCliente(String dni, String nombre, double precioSegundo) {
        this.dniG = dni;
        this.nombreGranCliente = nombre;
        this.precioSegundo = precioSegundo;
    }

    @Override
    public void conexion(int s) {
        this.segundosG = s;
    }

    @Override
    public double importe() {
        if (this.segundosG <= Oferta1.segundos) {
            pago = 0;
        } else if (this.segundosG > Oferta1.segundos) {
            pago = ((this.precioSegundo * (segundosG - Oferta1.segundos))) - ((this.precioSegundo * (segundosG - Oferta1.segundos)) * this.descuento() / 100);
        }
        return pago;
    }

    @Override
    public void reset() {
        System.out.println("Su cuenta ha sido reseteada. Importe total a pagar: " + this.pago);
        conexion(0);
    }

    @Override
    public double descuento() {
        descuentoIntroducido = -1;
        teclado = new BufferedReader(new InputStreamReader(System.in));
        try {

            do {
                System.out.print("Introduzca descuento a aplicar: ");
                descuentoIntroducido = Double.parseDouble(teclado.readLine());
            } while (descuentoIntroducido < 0);
        } catch (IOException ex) {
            Logger.getLogger(Cliente2.class.getName()).log(Level.SEVERE, null, ex);
        }

        return descuentoIntroducido;
    }

    @Override
    public String toString() {
        String s;
        s = "Gran Cliente: " + nombreGranCliente;
        s += "\nDni: " + dniG;
        s += "\nTiempo de conexion (en segundos): " + this.segundosG;
        s += "\nPrecio por minuto: " + this.precioSegundo;
        s += "\nTotal a pagar: " + this.pago;
        return s;

    }
}
