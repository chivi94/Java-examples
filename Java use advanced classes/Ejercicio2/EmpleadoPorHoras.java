package ejercicio2;

public class EmpleadoPorHoras extends Empleado {

    private double horas;
    private double precioHora;

    public EmpleadoPorHoras(String _nif, String _nombre, int _edad, double precioHora) {
        super(_nif, _nombre, _edad);
        this.precioHora = precioHora;
    }

    
    public double getHoras() {
        return this.horas;
    }

    public double getPrecioHora() {
        return this.precioHora;
    }
   
    public void setHoras(double h) {
        this.horas=h;
    }

    public void setPrecioHora(double p) {
        this.precioHora=p;
    }

    public double calcularSalarioMensual() {
        return this.horas * this.precioHora;       
    }
    
}
