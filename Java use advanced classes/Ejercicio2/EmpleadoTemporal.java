/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Date;

/**
 *
 * @author macarena
 */
public class EmpleadoTemporal extends Empleado {

    private Date fechaAlta;
    private Date fechaBaja;
    private double salario;
    
    public EmpleadoTemporal(String nif, String nombre, int edad, Date fAlta, Date fBaja, double salario) {
        super(nif,nombre,edad);
        this.fechaAlta=fAlta;
        this.fechaBaja=fBaja;
        this.salario=salario;
    }
    
    @Override
    public double calcularSalarioMensual() {
        return salario;
    }
    
}
