/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio1_mio;

import java.util.Date;

/**
 *
 * @author Ivan
 */
public class AMotor extends Barco{
    
    protected int potencia;

    public AMotor(String matricula, double eslora, int anio) {
        super(matricula, eslora, anio);
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    
    
    
}
