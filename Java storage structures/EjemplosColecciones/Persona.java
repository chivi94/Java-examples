

package EjemplosColecciones;

import java.util.Objects;


public class Persona {
    
    private String dni;
    private int edad;

    public Persona(String dni, int edad) {
        this.dni = dni;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        String s;
        s="Persona:\n";
        s+="DNI="+this.dni+"\n";
        s+="Edad="+this.edad+"\n";
        return s;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.dni);
        hash = 43 * hash + this.edad;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Persona other = (Persona) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
