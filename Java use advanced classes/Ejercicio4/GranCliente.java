package Ejercicio4_bis;

//Representa a los clientes a los que se les aplica las ofertas 1 y 2 simultaneamente
public class GranCliente extends Cliente implements Oferta1, Oferta2 {

    private double descuento; //porcentaje de descuento

    public GranCliente(String nombre, String dni, double precioSeg, double dto) {
        super(nombre, dni, precioSeg);       
        this.descuento = dto;
    }

    @Override
    public double importe() {
        double subTotal = this.seg * this.precioSeg; //subtotal
        double dto = this.descuento * subTotal; //descuento
        return subTotal - dto; //importe facturable     
    }

    @Override
    public void conexion(int s) {
        if (s < segDescuento) {
            this.seg = this.seg + s;
        } else {
            this.seg = this.seg + s - segDescuento;
        }
    }

    @Override
    public double porcentajeDto() {
        return this.descuento;
    }
}
