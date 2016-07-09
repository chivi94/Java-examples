package EjemplosEventos;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EjemploBotones  extends JFrame implements ActionListener {

    JButton botonSalir;
    JButton botonAceptar;
    JButton botonCancelar;

    public EjemploBotones() {
        
        this.setTitle("Ejemplo botones");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new FlowLayout());
        this.setPreferredSize(new Dimension(300, 200));
        this.pack();
        this.setLocationRelativeTo(null);

        setBotones();        
    }

    public void setBotones(){
        botonSalir = new JButton(new ImageIcon(this.getClass().getResource("../Imagenes/boton_salir.jpg")));
        botonAceptar = new JButton(new ImageIcon(this.getClass().getResource("../Imagenes/boton_aceptar_normal.gif")));
        //icono a mostrar cuando se arrima el raton al boton
        botonAceptar.setRolloverIcon(new ImageIcon(this.getClass().getResource("../Imagenes/boton_aceptar_selected.gif")));
        //icono a mostrar cuando se hace clic sobre el boton
        botonAceptar.setPressedIcon(new ImageIcon(this.getClass().getResource("../Imagenes/boton_aceptar_pressed.gif")));
        botonCancelar = new JButton("Cancelar");
        botonCancelar.setMnemonic('C');

        botonSalir.setActionCommand("Salir");
        botonAceptar.setActionCommand("Aceptar");
        botonCancelar.setActionCommand("Cancelar");

        botonSalir.addActionListener(this);
        botonAceptar.addActionListener(this);
        botonCancelar.addActionListener(this);

        this.getContentPane().add(botonSalir);
        this.getContentPane().add(botonAceptar);
        this.getContentPane().add(botonCancelar);
    }
    
    public static void main(String[] args) {
        EjemploBotones ej = new EjemploBotones();
        ej.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Salir")) {
            int resp = JOptionPane.showConfirmDialog(null, "¿Deseas realmente salir?", "Salir", JOptionPane.YES_NO_CANCEL_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        } else if (e.getActionCommand().equalsIgnoreCase("Aceptar")) {
            mostrarCuadro("Has pulsado el boton Aceptar");
        } else {
            mostrarCuadro("Has pulsado el boton Cancelar");
        }
    }

    private void mostrarCuadro(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Informacion", JOptionPane.INFORMATION_MESSAGE);
    }
}
