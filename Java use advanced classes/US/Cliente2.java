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
public class Cliente2 implements Usuario, Oferta2 {

    private BufferedReader teclado;
    private double segundos2;
    private final double precioSegundo;
    private double descuentoIntroducido;
    private double pago;
    private String dni2;
    private String nombreCliente2;

    public Cliente2(String dni, String nombre, double precioSeg) {
        this.dni2 = dni;
        this.nombreCliente2 = nombre;
        this.precioSegundo = precioSeg;
    }

    @Override
    public void conexion(int s) {
        this.segundos2 = s;
    }

    @Override
    public double importe() {
        pago = ((this.precioSegundo * segundos2)) - ((this.precioSegundo * segundos2) * this.descuento() / 100);
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
        String s = "";
        s = "Cliente 2: " + nombreCliente2;
        s += "\nDni: " + dni2;
        s += "\nTiempo de conexion (en segundos): " + this.segundos2;
        s += "\nPrecio por minuto: " + this.precioSegundo;
        s += "\nTotal a pagar: " + this.pago;
        return s;


    }
}
