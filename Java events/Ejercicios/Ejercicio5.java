/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;


/**
 *
 * @author Ivan
 */
public class Ejercicio5 extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio5
     */
    public Ejercicio5() {
        initComponents();
        this.setSize(400, 400);
        this.centrar();

        pack();
    }

    private void centrar() {
        setResizable(false);	//fijamos el marco de la ventana, ya no podra ser ampliada
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screenSize.width - getWidth()) / 2, (screenSize.height - getHeight()) / 2);
    }
    private void buttonFunction(){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.BorderLayout(100, 10));

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1, java.awt.BorderLayout.PAGE_START);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextArea1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jButton2.setMnemonic('b');
        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //METODO PARA TECLAS PULSADAS
    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        this.jTextArea1.append("\nTECLA PULSADA:\n");
        this.jTextArea1.append("\tCarácter tecla=" + evt.getKeyChar() + "\n");
        this.jTextArea1.append("\tCódigo tecla=" + evt.getKeyCode() + "\n");
        String modify = "\t¿Tecla modificadora?";
        if (evt.getKeyCode() == KeyEvent.CTRL_MASK) {
            this.jTextArea1.append(modify + " Si:" + evt.getKeyCode() + "(" + evt.getKeyChar() + ")\n");
        } else {
            this.jTextArea1.append(modify + " No\n");
        }
        String action = "\t¿Tecla de acción?";
        if (evt.getKeyCode() == KeyEvent.ACTION_EVENT_MASK) {
            this.jTextArea1.append(action + " Si\n");
        } else {
            this.jTextArea1.append(action + " No\n");
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextArea1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea1KeyPressed

    }//GEN-LAST:event_jTextArea1KeyPressed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        this.jTextArea1.append("\nTECLA SOLTADA:\n");
        this.jTextArea1.append("\tCarácter tecla=" + evt.getKeyChar() + "\n");
        this.jTextArea1.append("\tCódigo tecla=" + evt.getKeyCode() + "\n");
        String modify = "\t¿Tecla modificadora?";
        if (evt.getKeyCode() == 17) {
            this.jTextArea1.append(modify + " Si:" + evt.getKeyCode() + "(" + evt.getKeyChar() + ")\n");
        } else {
            this.jTextArea1.append(modify + " No\n");
        }
        String action = "\t¿Tecla de acción?";
        if (evt.getKeyCode() != 17) {
            this.jTextArea1.append(action + " Si\n");
        } else {
            this.jTextArea1.append(action + " No\n");
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
       this.jTextArea1.append("\nTECLA ESCRITA:\n");
        this.jTextArea1.append("\tCarácter tecla=" + evt.getKeyChar() + "\n");
        this.jTextArea1.append("\tCódigo tecla=" + evt.getKeyCode() + "\n");
        String modify = "\t¿Tecla modificadora?";
        if (evt.getKeyCode() == 17) {
            this.jTextArea1.append(modify + " Si:" + evt.getKeyCode() + "(" + evt.getKeyChar() + ")\n");
        } else {
            this.jTextArea1.append(modify + " No\n");
        }
        String action = "\t¿Tecla de acción?";
        if (evt.getKeyCode() != 17) {
            this.jTextArea1.append(action + " Si\n");
        } else {
            this.jTextArea1.append(action + " No\n");
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.jTextArea1.setText("");
        this.jTextField1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
