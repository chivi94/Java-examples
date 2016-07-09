package Soluciones;

import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Ejercicio11 extends javax.swing.JFrame {

    private JFileChooser selectorF;
    private JColorChooser selectorC;
    private GUIAyuda ayuda;
    private String titulo;

    public Ejercicio11() {
        initComponents();
        setFrame();
        setChoosers();
    }

   public void setAyuda(GUIAyuda ayuda) {
        this.ayuda = ayuda;
    }

    private void setFrame() {
        this.titulo="Ejercicio11";
        this.setTitle(titulo);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.itemCerrar.setEnabled(false);
        this.menuEdicion.setEnabled(false);
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        itemAbrir = new javax.swing.JMenuItem();
        itemCerrar = new javax.swing.JMenuItem();
        menuEdicion = new javax.swing.JMenu();
        itemColor = new javax.swing.JMenuItem();
        menuAplicacion = new javax.swing.JMenu();
        itemAyuda = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejercicio11");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_END);

        menuArchivo.setMnemonic('A');
        menuArchivo.setText("Archivo");

        itemAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itemAbrir.setText("Abrir");
        itemAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(itemAbrir);

        itemCerrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itemCerrar.setText("Cerrar");
        itemCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarActionPerformed(evt);
            }
        });
        menuArchivo.add(itemCerrar);

        jMenuBar1.add(menuArchivo);

        menuEdicion.setMnemonic('E');
        menuEdicion.setText("Edición");

        itemColor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        itemColor.setText("Color fuente");
        itemColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemColorActionPerformed(evt);
            }
        });
        menuEdicion.add(itemColor);

        jMenuBar1.add(menuEdicion);

        menuAplicacion.setText("Aplicación");

        itemAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        itemAyuda.setText("Ayuda");
        itemAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAyudaActionPerformed(evt);
            }
        });
        menuAplicacion.add(itemAyuda);
        menuAplicacion.add(jSeparator1);

        itemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        menuAplicacion.add(itemSalir);

        jMenuBar1.add(menuAplicacion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //ARCHIVO-ABRIR
    private void itemAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAbrirActionPerformed
        int resp = selectorF.showOpenDialog(this);
        if (resp == JFileChooser.OPEN_DIALOG) {
            File f = selectorF.getSelectedFile();
            mostrar(f);
        }
    }//GEN-LAST:event_itemAbrirActionPerformed

    //ARCHIVO-CERRAR
    private void itemCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarActionPerformed
        this.jTextArea1.setText("");
        this.jLabel1.setText("");
        this.setTitle(titulo);
        this.itemCerrar.setEnabled(false);
        this.menuEdicion.setEnabled(false);
    }//GEN-LAST:event_itemCerrarActionPerformed

    //EDICION-COLOR FUENTE
    private void itemColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemColorActionPerformed
        Color c=selectorC.showDialog(this, "Selecciona un color", Color.BLACK);
        if(c!=null){
            this.jTextArea1.setForeground(c);
        }
    }//GEN-LAST:event_itemColorActionPerformed

    //APLICACION-SALIR
    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemSalirActionPerformed

    //APLICACION-AYUDA
    private void itemAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAyudaActionPerformed
        if(ayuda==null){
            ayuda=new GUIAyuda(this);            
        }
        ayuda.setVisible(true);
    }//GEN-LAST:event_itemAyudaActionPerformed

    private void mostrar(File f){
        FileInputStream fis=null;
        BufferedInputStream bis=null;
        try {
            fis=new FileInputStream(f);
            bis=new BufferedInputStream(fis);
            
            byte[]datos=new byte[(int)f.length()];
            bis.read(datos);
            
            this.setTitle(titulo + " - " + f.getName());
            this.jLabel1.setText("Tamaño: " + f.length() + " bytes");
            this.jTextArea1.setText("");
            for (int i = 0; i < datos.length; i++) {
                this.jTextArea1.append(String.valueOf((char)datos[i]));                
            }
            this.itemCerrar.setEnabled(true);
            this.menuEdicion.setEnabled(true);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ejercicio11.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio11.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(bis!=null){
                try {
                    bis.close();
                } catch (IOException ex) {
                    Logger.getLogger(Ejercicio11.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(Ejercicio11.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }        
    }
    
    private void setChoosers() {
        selectorF = new JFileChooser();
        selectorF.setCurrentDirectory(new File("C:/Users/Macarena/Documents"));
        selectorF.setMultiSelectionEnabled(false);
        selectorF.setAcceptAllFileFilterUsed(false);
        selectorF.addChoosableFileFilter(new Filtro());
        
        selectorC = new JColorChooser();
    }

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
            java.util.logging.Logger.getLogger(Ejercicio11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemAbrir;
    private javax.swing.JMenuItem itemAyuda;
    private javax.swing.JMenuItem itemCerrar;
    private javax.swing.JMenuItem itemColor;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenu menuAplicacion;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuEdicion;
    // End of variables declaration//GEN-END:variables
}
