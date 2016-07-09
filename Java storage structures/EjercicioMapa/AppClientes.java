/*Usa una tabla hash para almacenar clientes y realizar las operaciones 
 básicas. 

 Un Cliente tiene los siguientes atributos:
 -id: numérico y único
 -dni
 -nombre
 -saldo

 Operaciones a realizar:
 -Introducir clientes en el mapa.
 -Modificar los datos de un cliente (a excepción de su id).
 -Eliminar clientes del mapa.
 -Buscar clientes por id y por dni.
 -Mostrar todos los clientes del mapa.
 */
package EjercicioMapa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppClientes {

    static BufferedReader teclado;
    static Map clientes = new HashMap();
    static Cliente nuevo;
    static String dni = "";
    static String nombre = "";
    static int saldo = 0;

    public static void mostrarMenu() {
        System.out.println("------------");
        System.out.println("Bienvenido");
        System.out.println("------------");
        System.out.println("¿Que opción quiere?");
        System.out.println("1.-Introducir un cliente");
        System.out.println("2.-Modificar los datos de un cliente");
        System.out.println("3.-Eliminar clientes");
        System.out.println("4.-Buscar un cliente");
        System.out.println("5.-Mostrar clientes");
        System.out.println("6.-Salir");
        System.out.print("Opcion:");
    }

    public static Cliente introducirCliente() {

        try {
            teclado = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Introduzca dni:");
            dni = teclado.readLine();
            System.out.println("Introduzca nombre:");
            nombre = teclado.readLine();
            System.out.println("Introduzca saldo:");
            saldo = Integer.parseInt(teclado.readLine());

        } catch (IOException ex) {
            Logger.getLogger(AppClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        nuevo = new Cliente(dni, nombre, saldo);
        return nuevo;
    }

    public static void almacenarCliente(Cliente c) {
        //Este metodo recibe el anterior.Cada vez que se agrega un nuevo cliente,el id aumenta en una unidad(clave++)
        //La clave está como id en la Clase"Cliente",a la que se iguala un contador para realizar esta tarea
        clientes.put(c.getId(), c);
    }

    public static void mostrarClientes() {
        System.out.println("--El contenido del mapa es el siguiente--");
        Iterator it = clientes.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e=(Map.Entry) it.next();
            System.out.println(e.getKey()+" "+e.getValue());
            
        }

    }

    public static void eliminarCliente(int clave) {
        if (clientes.containsKey(clave)) {
            clientes.remove(clave);

        } else {
            System.out.println("El contacto no existe");
        }
    }

    public static void buscarClave(int clave) {
        //Se debe de buscar un cliente tanto por id como por dni
        //Dado que voy a usar el id de dicho cliente como clave,se debe de hacer busqueda por clave y por valor
        //Voy a dar opcion al usuario de buscar de forma independiente de una u otra forma
        if (clientes.containsKey(clave)) {
            System.out.println("El cliente es el siguiente");
            System.out.println("Clave(" + clave + ")" + clientes.get(clave));
        } else {
            System.out.println("El cliente no existe");
        }

    }

    public static void buscarDni(Map m,String dni) {
       Iterator it=m.entrySet().iterator();
       
       
       while(it.hasNext()){
           Map.Entry e=(Map.Entry) it.next();
           Cliente aux=(Cliente)e.getValue();
         
           if (aux.getDni().equals(dni)) {
            System.out.println("El cliente es el siguiente");
            System.out.println(e.getValue());
            
        } else {
            System.out.println("El cliente no existe");
            
        }
       }
        
        
    }

    public static void modificarCliente(String dni, String nombre, int saldo) {
        nuevo.setDni(dni);
        nuevo.setNombre(nombre);
        nuevo.setSaldo(saldo);
    }

    public static void main(String[] args) {
        boolean continuar = true;
        teclado = new BufferedReader(new InputStreamReader(System.in));
        try {
            String opcion = "";

            do {
                mostrarMenu();
                opcion = teclado.readLine();

                switch (opcion) {
                    case "1":
                        almacenarCliente(introducirCliente());
                        break;
                    case "2":
                        System.out.println("Contacto a modificar");
                        System.out.print("Introducir clave:");
                        int busc_elim = Integer.parseInt(teclado.readLine());

                        buscarClave(busc_elim);
                        System.out.print("Nuevo dni:");
                        String nuevoDni = teclado.readLine();
                        System.out.print("Nuevo nombre:");
                        String nuevoNombre = teclado.readLine();
                        System.out.print("Nuevo saldo:");
                        int nuevoSaldo = Integer.parseInt(teclado.readLine());
                        modificarCliente(nuevoDni, nuevoNombre, nuevoSaldo);
                        break;
                    case "3":
                        System.out.println("Contacto a eliminar");
                        System.out.print("Introducir clave:");
                        int eliminar = Integer.parseInt(teclado.readLine());
                        eliminarCliente(eliminar);
                        break;
                    case "4":
                        System.out.println("Contacto a buscar");
                        System.out.println("¿Buscar por clave o por dni?");
                        String buscar = teclado.readLine();
                        if ("clave".equals(buscar)) {
                            System.out.println("Introduce clave");
                            int claveBusc = Integer.parseInt(teclado.readLine());
                            buscarClave(claveBusc);
                        } else if ("dni".equals(buscar)) {
                            System.out.println("Introduce dni a buscar");
                            String dni_buscar = teclado.readLine();
                            buscarDni(clientes,dni_buscar);
                        }
                        break;
                    case "5":
                        System.out.println("►Contenido del mapa◄");
                        mostrarClientes();
                        break;
                    case "6":
                        continuar = false;
                        System.out.println("Fin del programa");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");

                }

            } while (continuar == true);

        } catch (IOException ex) {
            Logger.getLogger(AppClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
