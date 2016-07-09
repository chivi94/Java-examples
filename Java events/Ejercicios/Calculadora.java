/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author Ivan
 */
public class Calculadora implements ActionListener {

    private JTextField jtf1;
    private JTextField jtf2;
    private JTextField jtf3;

    public String sumar() {
        int suma1 = Integer.parseInt(this.jtf1.getText());
        int suma2 = Integer.parseInt(this.jtf2.getText());
        return String.valueOf(suma1 + suma2);
    }

    public String restar() {
        int resta1 = Integer.parseInt(this.jtf1.getText());
        int resta2 = Integer.parseInt(this.jtf2.getText());
        return String.valueOf(resta1 - resta2);
    }

    public String multiplicar() {
        int mult1 = Integer.parseInt(this.jtf1.getText());
        int mult2 = Integer.parseInt(this.jtf2.getText());
        return String.valueOf(mult1 * mult2);
    }

    public String dividir() throws Exception {

        int div1 = Integer.parseInt(this.jtf1.getText());
        int div2 = Integer.parseInt(this.jtf2.getText());
        
        if (div2 == 0) {
            throw new Exception("no se puede dividir por cero");
        }
        return String.valueOf(div1 / div2);
    }

    public Calculadora(JTextField jtf1, JTextField jtf2, JTextField jtf3) {
        this.jtf1 = jtf1;
        this.jtf2 = jtf2;
        this.jtf3 = jtf3;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getActionCommand().equals("suma")) {
            this.jtf3.setText(sumar());
        } else if (evento.getActionCommand().equals("resta")) {
            this.jtf3.setText(restar());
        } else if (evento.getActionCommand().equals("multiplicar")) {
            this.jtf3.setText(multiplicar());
        } else {
            try {
                this.jtf3.setText(dividir());
            } catch (Exception ex) {
                Logger.getLogger(Calculadora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
