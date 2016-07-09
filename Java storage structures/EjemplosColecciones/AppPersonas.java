/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EjemplosColecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ivan
 */
public class AppPersonas {
    public static void main(String[] args) {
        
    
    
    List <Persona> personas=new ArrayList <Persona>();
    
    Persona luis=new Persona("1",20);
    Persona carlos=new Persona("2",18);
    Persona maria=new Persona("3",24);
    
    personas.add(luis);
    personas.add(carlos);
    personas.add(maria);
    
        System.out.println(personas.toString());
        
        //Buscar a la persona con dni=1 y 20 años
        
        //--A:Búsqueda secuencial en la lista
        
        //--B:Implementar el método equals
        
        
        System.out.println("¿Está luis ?"+personas.contains(new Persona("1",20)));
        System.out.println("Posición de luis:"+personas.indexOf(personas.indexOf(new Persona("1",20))));
        System.out.println("¿Luis está eliminado?"+personas.remove(new Persona("1",20)));
    }
}
