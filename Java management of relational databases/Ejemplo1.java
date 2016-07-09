package Ejemplos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Ejemplo1 {

    public static void main(String[] args) {
        Connection con = null;
        try {
            //Cargar el driver
            Class.forName("com.mysql.jdbc.Driver");
            //Abrir conexión con BD
            String url = "jdbc:mysql://alumnosdam.info:3306/alumdam_bd15";

            con = DriverManager.getConnection(url, "usuario15", "usuario15");
            //Trabajar con la BD

            //--Insertar fila
            Statement st = con.createStatement();
            int numfilas=st.executeUpdate("INSERT INTO tabla1 (COL2) VALUES('prueba')");
            if(numfilas>0){
                System.out.println("Fila insertada");
            }else{
                System.out.println("No se ha realizado correctamente");
            }

            //--Modificar fila
//            String col1 = JOptionPane.showInputDialog("Introduce valor col1");
//            String col2 = JOptionPane.showInputDialog("Introduce valor col2");
//            int numfilas = st.executeUpdate("UPDATE tabla1 SET col2 ='" + col2 + "'WHERE col1=" + col1);
//            if (numfilas > 0) {
//                System.out.println("Fila modificada");
//            } else {
//                System.out.println("No se ha realizado correctamente");
//            }
            //--Eliminar fila
//            String col1 = JOptionPane.showInputDialog("Introduce valor col1");
//            int numfilas = st.executeUpdate("DELETE FROM tabla1 WHERE col1=" + col1);
//            if (numfilas > 0) {
//                System.out.println("Fila eliminada");
//            } else {
//                System.out.println("No se ha realizado correctamente");
//            }
            //--Recuperar el contenido de la tabla
            ResultSet resultado=st.executeQuery("SELECT * FROM tabla1");
           while(resultado.next()){
               //procesamiento de la fila
               int dato1=resultado.getInt(1);
               String dato2=resultado.getString(2);
               
               System.out.println("Fila: "+dato1+" -- "+dato2);
           }
        } catch (SQLException ex) {
            Logger.getLogger(Ejemplo1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ejemplo1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                //Cerrar la conexión
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(Ejemplo1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
