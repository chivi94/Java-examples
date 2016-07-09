/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemplosEventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Ivan
 */
public class Listener_Ejemplo2 implements ActionListener {
    
    private JFrame ventana;
    

    public Listener_Ejemplo2(JFrame ventana) {
        this.ventana=ventana;
        

    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Has pulsado el boton");
        //Cambiar el texto del boton
        
        //Maximizar la ventana
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

}
