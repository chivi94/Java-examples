package Ejemplos;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Ejemplo2 {

    Connection con;

    public static void main(String[] args) {
        Ejemplo2 ej2 = new Ejemplo2();
        ej2.crearConexion();
        ej2.insertarFecha();
        //ej2.consultar();
        //ej2.insertarFila();
        ej2.cerrarConexion();
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

    private void insertarFecha() {
        try {
            String fechaString = JOptionPane.showInputDialog("Introduce fecha:");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");     
            
            java.util.Date fechaDate = sdf.parse(fechaString);
            java.sql.Date fechaSQL=new java.sql.Date(fechaDate.getTime());
            PreparedStatement ps = con.prepareStatement("INSERT INTO tabla1 (col3)"
                    + "VALUES(?)");
            ps.setDate(1,fechaSQL);
            //ps.setString(1, fechaString);//se da valor al parametro ?
            ps.executeUpdate();
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "ERROR.Formato de fecha incorrecto");
        } catch (SQLException ex) {
            Logger.getLogger(Ejemplo2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void insertarFila() {
        try {
            String valorCol2 = JOptionPane.showInputDialog("Introduce valor para columna2:");
            PreparedStatement ps = con.prepareStatement("INSERT INTO tabla1 (col2)"
                    + "VALUES(?)");
            ps.setString(1, valorCol2);//se da valor al parametro ?
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Ejemplo2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void consultar() {
        try {
            //se buscar el valor de la columna 2 que corresponde con el introducido por el usuario para la col1
            int valorCol1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce valor para columna1:"));
            PreparedStatement ps = con.prepareStatement("SELECT * FROM tabla1 "
                    + "WHERE col1 = ?");
            ps.setInt(1, valorCol1);//se da valor al parametro ?
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                //hay datos
                JOptionPane.showMessageDialog(null, "Valor col2: " + rs.getString(2));
            } else {
                //no hay datos
                JOptionPane.showMessageDialog(null, "ERROR.Clave inexistente");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ejemplo2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
