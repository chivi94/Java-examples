/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EjemploProcedure {

    Connection con;

    public static void main(String[] args) {
        EjemploProcedure ej=new EjemploProcedure();
        ej.crearConexion();
        //ej.llamadaProcedimiento();
        ej.llamadaFunction();
        ej.cerrarConexion();
    }
    
    private void llamadaProcedimiento(){
        try {
            CallableStatement cs=con.prepareCall("CALL get_descProd(?,?)");
            int prod=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce codigo de producto"));
            cs.setInt(1,prod);
            cs.registerOutParameter(2, java.sql.Types.VARCHAR);
            cs.execute();
            System.out.println("Descripcion asociada: "+cs.getString(2));
        } catch (SQLException ex) {
            Logger.getLogger(EjemploProcedure.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void llamadaFunction(){
          try {
            CallableStatement cs=con.prepareCall("{?=CALL get_descProd2(?)}");
            int prod=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce codigo de producto"));
            
            cs.registerOutParameter(1, java.sql.Types.DECIMAL);
            cs.setInt(2,prod);
            cs.execute();
            System.out.println("Descripcion asociada: "+cs.getString(1));
        } catch (SQLException ex) {
            Logger.getLogger(EjemploProcedure.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void crearConexion() {
        try {
            //cargar el driver
            Class.forName("com.mysql.jdbc.Driver");
            //abrir conexión con la bd
            String url = "jdbc:mysql://alumnosdam.info:3306/alumdam_bd15";
            con = DriverManager.getConnection(url, "usuario15", "usuario15");
        } catch (SQLException ex) {
            Logger.getLogger(Ejemplo2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ejemplo2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cerrarConexion() {
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
