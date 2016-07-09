package Ejemplos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorMenu implements ActionListener {

    EjemploMenu ventana;

    public ControladorMenu(EjemploMenu ventana) {
        this.ventana = ventana;
    }

    public void actionPerformed(ActionEvent arg0) {
        String accion = arg0.getActionCommand();
        ventana.areaTexto.append(accion + "\n");
        if (accion.equals("Salir")) {
            System.exit(0);
        }
    }
}
