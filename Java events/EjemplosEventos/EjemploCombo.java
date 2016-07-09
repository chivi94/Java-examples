package EjemplosEventos;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class EjemploCombo extends JFrame implements ItemListener {

    private JComboBox combo;
    private JLabel etiqueta;
    private String[] elementos=new String[10];

    public EjemploCombo() {

        this.setTitle("Ejemplo combo");
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(200, 170));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creamos el combo
        for (int i = 0; i < 10; i++) {
            elementos[i]="elemento" + (i + 1);
        }
        combo = new JComboBox(elementos);
        combo.setMaximumRowCount(5);
        //combo.setEditable(false);

        //controlamos la selecci�n de elementos de la lista
        combo.addItemListener(this);

        //creamos la etiqueta para mostrar el elemento seleccionado de la lista
        etiqueta = new JLabel("Seleccionado: ");

        //paneles auxiliares
        JPanel p1 = new JPanel(new FlowLayout());
        JPanel p2 = new JPanel(new FlowLayout());

        p1.add(combo);
        p2.add(etiqueta);

        //añadimos los paneles a la ventana
        this.getContentPane().add(p1, BorderLayout.CENTER);
        this.getContentPane().add(p2, BorderLayout.SOUTH);

        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        EjemploCombo ej = new EjemploCombo();

    }

    public void itemStateChanged(ItemEvent arg0) {
        etiqueta.setText((String) combo.getSelectedItem());
    }
}
