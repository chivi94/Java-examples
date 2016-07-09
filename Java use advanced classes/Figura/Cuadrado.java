/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figura;

/**
 *
 * @author Ivan
 */
public class Cuadrado extends Figura {

    private int l;

    public Cuadrado(int l) {
        super(l, l);
        this.l = l;

    }

    @Override
    public double area() {
        return this.l * this.l;
    }

}
