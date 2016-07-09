
package Ejemplos;

import java.text.DateFormat;
import java.util.GregorianCalendar;


public class AplicacionPersonas {
    
    public static void main(String[] args) {
        
        Persona pp=new Persona();
        Persona maria=new Persona();
        GregorianCalendar gc=new GregorianCalendar(2000,4,1);
        //int edad=
        Persona luis=new Persona("111222333V","Luis","Perez",gc.getTime(),13);
        System.out.println(luis.toString());
        
        
        pp.setDni("12345678A");//método set para dar valores a los atributos
        pp.setNombre("Pepe");
        pp.setApellidos("Martinez");
        pp.setEdad(33);
        //La fecha de nacimiento de Pepe es 02/05/1980
        GregorianCalendar fecha=new GregorianCalendar(1980, 4, 2);
        pp.setFechaNac(fecha.getTime());
        
        //Mostramos en pantalla el estado del objeto
        System.out.println("Nombre: "+pp.getNombre());//método get para que nos devuelva el valor dado anteriormente a los atributos
        System.out.println("Apellidos: "+pp.getApellidos());
        System.out.println("DNI: "+pp.getDni());
        System.out.println("Edad: "+pp.getEdad());
        
        
        //Formateamos la fecha de nacimiento
        
        //a) Formateamos desde la aplicación
//        DateFormat formateador=DateFormat.getDateInstance();
//        String cadenaFecha=formateador.format(pp.getFechaNac());
//        System.out.println("Fecha nacimiento: "+cadenaFecha);
        
        //b) Que la clase formatee la fecha de nacimiento;
        System.out.println("Fecha nacimiento: "+pp.getFechaNac());
        
        System.out.print(pp.toString());//Muestra el estado del objeto pp,para ello,hay que sobreescribirlo en la clase.
        
        //Comparamos los dos objetos pp y maría.En este caso el objeto actual es pp y el objeto parámetro maría.
        //Según la clase que hemos creado,la variable otra adquiere el valor de maría,en este caso,la dirección de memoria.
        System.out.println("\n"+pp.equals(maria));//con el método equals se hace la comparación.
        
        Persona juan=new Persona("123654987C");//null null null null 0
        System.out.println("\n"+juan.equals(maria));//aquí da false porque tienen diferentes posiciones de memoria,igual que en el caso anterior
        //el equals tal cual solo compara referencias en la memoria,no hace una comparación en pronfundidad.
        
        maria.setDni("987654321B");
        maria.setNombre("María");
        maria.setApellidos("Gómez");
        maria.setEdad(40);
        maria.setFechaNac(new GregorianCalendar(1973,3,1).getTime());
        
        System.out.println(pp.equals(pp));
        System.out.println(pp.equals(maria));
        
        System.out.println(juan.equals(pp));
    }
    
}
        
