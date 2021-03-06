package Soluciones;

import Soluciones.Ejercicio11;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class GUIAyuda extends javax.swing.JFrame {

    private File f = new File("src/Ficheros/ayuda.xml");
    private Document doc;
    private Ejercicio11 ppal;
    
    public GUIAyuda(Ejercicio11 ppal) {
        initComponents();
        this.ppal=ppal;
        setFrame();
        setPanelEtiquetas();
        setArbol();
        cargarXML();
        this.pack();
    }

    private void setFrame() {
        this.jPanel2.add(this.jPanel3, BorderLayout.PAGE_START);
        this.setPreferredSize(new Dimension(500, 500));
        this.setLocationRelativeTo(ppal);
    }

    private void setPanelEtiquetas() {
        this.jTabbedPane1.setPreferredSize(new Dimension(150, 0));
        this.jTabbedPane1.addTab("Contenido", this.jPanel1);
        this.jTabbedPane1.addTab("Buscar", this.jPanel2);
    }

    private void setArbol() {
        //definimos la raiz del árbol
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Índice");

        //creamos el modelo(contenido) del árbol
        DefaultTreeModel modelo = new DefaultTreeModel(raiz);
        //se lo asignamos al control
        this.jTree1.setModel(modelo);

        //creamos los nodos del arbol
        DefaultMutableTreeNode archivo = new DefaultMutableTreeNode("Archivo");
        DefaultMutableTreeNode edicion = new DefaultMutableTreeNode("Edición");
        DefaultMutableTreeNode aplicacion = new DefaultMutableTreeNode("Aplicación");

        modelo.insertNodeInto(archivo, raiz, 0);
        modelo.insertNodeInto(edicion, raiz, 1);
        modelo.insertNodeInto(aplicacion, raiz, 2);

        //creamos las hojas
        DefaultMutableTreeNode abrir = new DefaultMutableTreeNode("Abrir");
        DefaultMutableTreeNode cerrar = new DefaultMutableTreeNode("Cerrar");
        DefaultMutableTreeNode color = new DefaultMutableTreeNode("Color fuente");
        DefaultMutableTreeNode salir = new DefaultMutableTreeNode("Salir");

        modelo.insertNodeInto(abrir, archivo, 0);
        modelo.insertNodeInto(cerrar, archivo, 1);
        modelo.insertNodeInto(color, edicion, 0);
        modelo.insertNodeInto(salir, aplicacion, 0);

    }

    private void cargarXML() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder parseador = dbf.newDocumentBuilder();
            doc = parseador.parse(f);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(GUIAyuda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(GUIAyuda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GUIAyuda.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ayuda");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane1.setName(""); // NOI18N
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jTree1);

        jPanel1.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));
        jPanel3.add(jTextField1);

        jButton1.setText(">");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jTabbedPane1.addTab("tab1", jPanel2);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.LINE_START);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //SELECCIÓN DE UN ELEMENTO DEL ÁRBOL
    private void jTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree1ValueChanged
        DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) this.jTree1.getLastSelectedPathComponent();
        if (nodoSeleccionado.isLeaf()) {
            String texto=nodoSeleccionado.getUserObject().toString().toLowerCase();            
            String ayuda = buscarAyudaByName(texto);
            if (ayuda != null) {
                this.jTextArea1.setText(ayuda);
            } else {
                this.jTextArea1.setText("");
            }
        } else {
            this.jTextArea1.setText("");
        }
    }//GEN-LAST:event_jTree1ValueChanged

    private String buscarAyudaByName(String texto) {
        Node item = null;
        try {            
            String xpath= "/items/item[contains (name,'" + texto + "')]";
            XPath xPath = XPathFactory.newInstance().newXPath();
            XPathExpression expr = xPath.compile(xpath);
            item = (Node) expr.evaluate(doc, XPathConstants.NODE);
            if (item != null) {
                return ((Element) item).getElementsByTagName("text").item(0).getFirstChild().getNodeValue();
            }
        
        } catch (XPathExpressionException ex) {
            Logger.getLogger(Ejercicio11.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    private ArrayList buscarAyudaByText(String texto) {
        ArrayList<String> enlaces=new ArrayList();
        NodeList items = null;
        try {       
            String xpath= "/items/item[contains (text,'" + texto + "')]";
            XPath xPath = XPathFactory.newInstance().newXPath();
            XPathExpression expr = xPath.compile(xpath);
            items = (NodeList)expr.evaluate(doc, XPathConstants.NODESET);
            for (int i = 0; i < items.getLength(); i++) {
                Element e=(Element)items.item(i);
                enlaces.add(e.getElementsByTagName("ruta").item(0).getFirstChild().getNodeValue());                
            }      
        } catch (XPathExpressionException ex) {
            Logger.getLogger(Ejercicio11.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        return enlaces;
    }
    
    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        if (this.jTabbedPane1.getSelectedIndex() == 1) {
            this.jTextField1.requestFocusInWindow();
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    //BOTÓN BUSCAR
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.jTextArea1.setText("");
        String texto=this.jTextField1.getText();
        if (!texto.isEmpty()) {
            ArrayList<String>enlaces = buscarAyudaByText(texto);
            if (enlaces.size()>0) {
                for(String enlace:enlaces){
                    this.jTextArea1.append(enlace + "\n");
                }
            } else {
                this.jTextArea1.setText("");
            }
        } else {
            this.jTextArea1.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ppal.setAyuda(null);
    }//GEN-LAST:event_formWindowClosing

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
