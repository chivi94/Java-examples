package Ejercicios;

public class Producto {
    private String tipo;
    private int codigo;
    private String descripcion;
    private double precio;    
    private int cantidad;

    public Producto(String tipo, int codigo, String descripcion) {
        this.tipo = tipo;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
       
    @Override
    public String toString(){
        return codigo + ": " + descripcion + " --> " + precio + " €";
    }
}
