/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjemplosEventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Ivan
 */
public class Ejemplo_ContainerEvent extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form Ejemplo_ContainerEvent
     */
    JLabel etiqueta;
    JTextField caja;
    JButton boton;
    public Ejemplo_ContainerEvent() {
        initComponents();
        this.añadirControles();
        
    }
    
    private void añadirControles(){
        etiqueta= new JLabel("Etiqueta:");
        caja= new JTextField(50);
        boton=new JButton("Eliminar control");
        this.boton.addActionListener(this);
        
        this.jPanel1.add(etiqueta);
        this.jPanel1.add(caja);
        this.jPanel1.add(boton);
        
        pack();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel1ComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                jPanel1ComponentRemoved(evt);
            }
        });
        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel1ComponentAdded
        System.out.println("Se ha añadido un control al panel");
    }//GEN-LAST:event_jPanel1ComponentAdded

    private void jPanel1ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel1ComponentRemoved
        System.out.println("Se ha eliminado un control al panel");
    }//GEN-LAST:event_jPanel1ComponentRemoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ejemplo_ContainerEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejemplo_ContainerEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejemplo_ContainerEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejemplo_ContainerEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejemplo_ContainerEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.jPanel1.remove(0);
        this.repaint();
    }
}
