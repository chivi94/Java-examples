/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Date;

/**
 *
 * @author Ivan
 */
public class Yate extends AMotor {

    protected int camarotes;

    public Yate(int camarotes, String matricula, double eslora, int anio) {
        super(matricula, eslora, anio);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    
   

}
