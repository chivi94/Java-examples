

package EjemplosColecciones;

import java.util.Objects;

public class Usuario implements Comparable <Usuario>{
    
    private int id;
    private String login;
    private char tipo;//A,B,C

    public Usuario(int id, String login, char tipo) {
        this.id = id;
        this.login = login;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public char getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", login=" + login + ", tipo=" + tipo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.login);
        hash = 29 * hash + this.tipo;
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
        final Usuario other = (Usuario) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Usuario o) {
        int resultado=0;
        //Criterio de ordenación por id
        if(this.id>o.id){
            resultado=1;
        }else if(this.id<o.id){
            resultado=-1;
        }
        return resultado;
        
    }
    
    
    
}
