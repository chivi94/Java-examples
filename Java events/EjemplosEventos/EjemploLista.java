package EjemplosEventos;


import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.List;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class EjemploLista extends JFrame implements ListSelectionListener {

    private JList lista;
    private JLabel etiqueta;
    private DefaultListModel<String> elementos;

    public EjemploLista() {

        this.setTitle("Ejemplo lista");
        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(200, 170));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //creamos la lista
        elementos = new DefaultListModel();
        for (int i = 0; i < 10; i++) {
            elementos.addElement("elemento" + (i + 1));
        }
        lista = new JList();
        lista.setModel(elementos);
        
        //Configuramos la lista
        JScrollPane scroll = new JScrollPane(lista); //asignamos a la lista una barra de desplazamiento
        
        lista.setVisibleRowCount(5); //ponemos 5 filas visibles en la lista
        lista.setFixedCellWidth(100);
        lista.setSelectionBackground(Color.yellow);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        

        //lista.setFixedCellWidth(100);   //anchura de las celdas de la lista
        //lista.setSelectionBackground(Color.PINK);
        //lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  //solo se puede elegir un elemento
        
        //controlamos la seleccion de elementos de la lista
        lista.addListSelectionListener(this);

        //creamos la etiqueta para mostrar el elemento seleccionado de la lista
        etiqueta = new JLabel("Seleccionado: ");

        //paneles auxiliares
        JPanel p1 = new JPanel(new FlowLayout());
        JPanel p2 = new JPanel(new FlowLayout());

        p1.add(scroll);
        p2.add(etiqueta);

        //añadimos los paneles a la ventana
        this.getContentPane().add(p1, BorderLayout.CENTER);
        this.getContentPane().add(p2, BorderLayout.SOUTH);

        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        EjemploLista ej = new EjemploLista();
    }

    //metodo que se ejecuta cuando seleccinamos un elemento de la lista
    public void valueChanged(ListSelectionEvent arg0) {
        String texto = "Seleccionado: ";

        //recorremos el array de elementos "seleccionados" de la lista
        List <String> seleccion=lista.getSelectedValuesList();
        for (int i = 0; i < seleccion.size(); i++) {
            //añadimos a la cadena el elemetno seleccionado i-esimo
            texto += seleccion.get(i) + " ";
        }

        etiqueta.setText(texto);
    }
}
