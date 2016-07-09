/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicios;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Fijo extends Empleado {
    
    private int añoAlta;
    private double base;
    private double complementoAnual;
    

    public Fijo(String _nif, String _nombre, int _edad,int año,double base,double complementoAnual) {
        super(_nif, _nombre, _edad);
        this.añoAlta=año;
        this.base=base;
        this.complementoAnual=complementoAnual;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setComplementoAnual(double complementoAnual) {
        this.complementoAnual = complementoAnual;
    }

    @Override
     public double calcularSalarioMensual(){
       GregorianCalendar gc=new GregorianCalendar();
       int año=gc.get(Calendar.YEAR);
       return this.base+(this.complementoAnual*(año-this.añoAlta));
    }
   
}
