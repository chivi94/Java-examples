

package EjemplosColecciones;

import java.util.TreeSet;
import java.util.Set;

public class AppUsuarios {
    
    public static void main(String[] args) {
        
        Set <Usuario> usuarios= new TreeSet <Usuario>();
        
        usuarios.add(new Usuario(1,"Usuario1",'B'));
        usuarios.add(new Usuario(2,"Usuario2",'A'));
        usuarios.add(new Usuario(3,"Usuario3",'A'));
        usuarios.add(new Usuario(4,"Usuario4",'C'));
        
        usuarios.add(new Usuario(2,"Usuario2",'A'));
        
        System.out.println(usuarios);
        
    }
    
}
