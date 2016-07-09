package ejercicio2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class EmpleadoFijo extends Empleado {

    private int anioAlta;
    private double salarioBase;
    private double complemento;

    public EmpleadoFijo(String _nif, String _nombre, int _edad, int añoAlta, 
            double base, double complemento) {
        super(_nif, _nombre, _edad);
        this.anioAlta = añoAlta;
        this.salarioBase=base;
        this.complemento=complemento;
    }

    public void setComplemento(double complemento) {
        this.complemento = complemento;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }    
    
    public double calcularSalarioMensual() {
        GregorianCalendar gc=new GregorianCalendar();
        int anio=gc.get(Calendar.YEAR);
        
        double sueldo = salarioBase + (complemento * (anio-this.anioAlta));
        return sueldo;
    }
    
}
