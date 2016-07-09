package Ejercicio4_bis;

//Representa a los clientes con la Oferta1
public class Cliente1 extends Cliente implements Oferta1 {

    public Cliente1(String nombre, String dni, double precioSeg) {
        super(nombre, dni, precioSeg);        
    }

    //Definicion del metodo abstracto
    @Override
    public double importe() {
        return (this.seg * this.precioSeg);  //calculamos el importe facturable
    }

    @Override
    public void conexion(int s) {
        if (s < segDescuento) {
            this.seg = this.seg + s;
        } else {
            this.seg = this.seg + s - segDescuento;
        }
    }
}
