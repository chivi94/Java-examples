package EjemplosEventos;

import java.awt.Dimension;
import javax.swing.*;

public class EjemploEtiquetas extends JFrame {

    public EjemploEtiquetas() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();

        JLabel textoHTML = new JLabel("<html>"
                + "<font color='Red' size='7' face='Arial,Helvetica,"
                + "sans-serif'>Este es el texto</font></html>");
       // JLabel grafica1 = new JLabel(new ImageIcon(this.getClass().getResource("../Imagenes/logo_java.jpg")));
        //JLabel grafica2 = new JLabel(new ImageIcon(this.getClass().getResource("Imagenes/logo_eclipse.jpg")));
        panel.add(textoHTML);
        //panel.add(grafica1);
        //panel.add(grafica2);
        
        this.getContentPane().add(panel);
        this.setPreferredSize(new Dimension(300, 300));
        this.pack();        
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EjemploEtiquetas ej=new EjemploEtiquetas();
        ej.setVisible(true);
    }
}
