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
public class Circulo extends Figura {

    protected double radio;
    private static final double PI = 3.1416;

    public Circulo(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    public double area() {
        return PI * radio * radio;

    }
    
}
