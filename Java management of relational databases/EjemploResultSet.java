package Ejemplos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EjemploResultSet {

    private Connection con;
    private ResultSet rs;

    public static void main(String[] args) {
        EjemploResultSet ej = new EjemploResultSet();
        ej.crearConexion();
        ej.cargarDatos();
        ej.mostrarDatos();
        //ej.modificarProducto(3, "A");
        //ej.insertarProducto();
        ej.eliminarProducto(5);
        ej.mostrarDatos();
        ej.cerrarConexion();
    }

    private void cargarDatos() {
        try {
            //el primer parametro hace que sea sensible a los cambios y que nos podamos mover hacia adelante y hacia atrás
            //el segundo parametro hace que el ResultSet sea actualizable
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery("SELECT * FROM productos");
        } catch (SQLException ex) {
            Logger.getLogger(EjemploResultSet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void mostrarDatos() {
        try {
            rs.first();
            do {
                //JOptionPane.showMessageDialog(null,rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            } while (rs.next());


        } catch (SQLException ex) {
            Logger.getLogger(EjemploResultSet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private int buscarProducto(int cod) {
        try {
            rs.first();
            do {
                if (rs.getInt(1) == cod) {
                    return rs.getRow();
                }

            } while (rs.next());

        } catch (SQLException ex) {
            Logger.getLogger(EjemploResultSet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;

    }

    private void modificarProducto(int cod, String tipo) {
        int pos = buscarProducto(cod);
        if (pos > -1) {
            try {
                rs.absolute(pos);//coge la posicion absoluta
                rs.updateString(2, tipo);//cambia el valor de la segunda columna
                System.out.println("Tipo actualizado");
                rs.updateRow();//haciendo esto,el cambio se realiza.Si no llamamos a este metodo,no hay cambio
                //rs.refreshRow(); se debe hacer si el cambio realizado no es visible
            } catch (SQLException ex) {
                Logger.getLogger(EjemploResultSet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Producto inexistente");
        }

    }
    
    private void insertarProducto (){
        try {
            rs.moveToInsertRow();//se crea una nueva fila con las columnas vacías
            rs.updateInt(1, 5);
            rs.updateString(2,"B");
            rs.updateString(3, "prueba");
            rs.updateDouble(4, 9.99);
            rs.updateInt(5, 99);
            rs.insertRow();
            rs.moveToCurrentRow();//mueve el puntero a la fila actual o previa a la insercción
        } catch (SQLException ex) {
            Logger.getLogger(EjemploResultSet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void eliminarProducto(int cod){
        int pos = buscarProducto(cod);
        if (pos > -1) {
            try {
                rs.absolute(pos);//coge la posicion absoluta
                rs.deleteRow();//de esta forma elimina la fila en la que se ha encontrado el dato
            } catch (SQLException ex) {
                Logger.getLogger(EjemploResultSet.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Producto inexistente");
        }
    }

    private void crearConexion() {
        try {
            //cargar el driver
            Class.forName("com.mysql.jdbc.Driver");
            //abrir conexión con la bd
            String url = "jdbc:mysql://127.0.0.1:3306/almacen";
            con = DriverManager.getConnection(url, "root", "");
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
