/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemplosDisenio;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;

/**
 *
 * @author Ivan
 */
public class IntroduccionGridBag extends javax.swing.JFrame {

    /**
     * Creates new form IntroduccionGridBag
     */
    public IntroduccionGridBag() {
        initComponents();
        this.setTitle("GridBagLayout");
        this.jPanel1.setBorder(BorderFactory.createLineBorder(Color.yellow));
        this.jPanel1.setPreferredSize(new Dimension(500, 500));
        asignarRestricciones();
        this.pack();
    }

    public void asignarRestricciones() {
        //Tambien se puede usar un solo objeto para todos los botones.Esto lo hago para aclararme mejor
        //En el caso de usar el mismo objeto para todos los botones,para expandir solo uno de los botones,
        //tendriamos que tocar las propiedades de todos ellos
        GridBagConstraints r1 = new GridBagConstraints();//boton 1
        GridBagConstraints r2 = new GridBagConstraints();//boton 2
        GridBagConstraints r3 = new GridBagConstraints();//boton 3
        GridBagConstraints r4 = new GridBagConstraints();//boton 4
        GridBagConstraints r5 = new GridBagConstraints();//boton 5

        //posicion boton1
        r1.gridx = 0;
        r1.gridy = 0;
        //expansion del boton1
        r1.fill = GridBagConstraints.HORIZONTAL;
        r1.weightx = 1.0;
        r1.weighty = 0.0;
        //peso del boton1(el numero indicado nos dice el peso que tiene,multiplicado por dicho numero)
        r1.gridwidth=3;//anchura
        r1.gridheight=1;//altura
        //espaciado del boton1
        r1.ipadx=30;
        r1.ipady=30;
        //espaciado entre componentes
        r1.insets=new Insets(0, 10,10,10);//Se precisa crear un objeto Insets
        ((GridBagLayout) this.jPanel1.getLayout()).setConstraints(this.jButton1, r1);
        //posicion boton2
        r2.gridx = 0;
        r2.gridy = 1;
        //expansion del boton2  
        r2.fill = GridBagConstraints.HORIZONTAL;
        r2.weightx = 1.0;
        r2.weighty = 0.0;
        //peso del boton2
        r2.gridwidth=1;//anchura
        r2.gridheight=1;//altura
        ((GridBagLayout) this.jPanel1.getLayout()).setConstraints(this.jButton2, r2);
        //posicion boton3
        r3.gridx = 1;
        r3.gridy = 1;
        //expansion del boton3
        r3.fill = GridBagConstraints.HORIZONTAL;
        r3.weightx = 0.0;
        r3.weighty = 0.0;
        //peso del boton3
        r4.gridwidth=1;//anchura
        r4.gridheight=1;//altura
        ((GridBagLayout) this.jPanel1.getLayout()).setConstraints(this.jButton3, r3);
        //posicion boton4
        r4.gridx = 2;
        r4.gridy = 1;
        //expansion del boton4  
        r4.fill = GridBagConstraints.HORIZONTAL;
        r4.weightx = 1.0;
        r4.weighty = 0.0;
        //peso del boton4
        r4.gridwidth=1;//anchura
        r4.gridheight=1;//altura
        ((GridBagLayout) this.jPanel1.getLayout()).setConstraints(this.jButton4, r4);
        //posicion boton5
        r5.gridx = 1;
        r5.gridy = 2;
        //expansion del boton5
        r5.fill = GridBagConstraints.HORIZONTAL;
        r5.weightx = 0.0;
        r5.weighty = 0.0;
        //peso del boton5
        r5.gridwidth=1;//anchura
        r5.gridheight=1;//altura
        ((GridBagLayout) this.jPanel1.getLayout()).setConstraints(this.jButton5, r5);

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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jButton1.setText("jButton1");
        jButton1.setAlignmentY(1.0F);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new java.awt.GridBagConstraints());

        jButton2.setText("jButton2");
        jPanel1.add(jButton2, new java.awt.GridBagConstraints());

        jButton3.setText("jButton3");
        jPanel1.add(jButton3, new java.awt.GridBagConstraints());

        jButton4.setText("jButton4");
        jPanel1.add(jButton4, new java.awt.GridBagConstraints());

        jButton5.setText("jButton5");
        jPanel1.add(jButton5, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(IntroduccionGridBag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntroduccionGridBag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntroduccionGridBag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntroduccionGridBag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntroduccionGridBag().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
