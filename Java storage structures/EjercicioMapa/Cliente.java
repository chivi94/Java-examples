/*Almacenar en un mapa objetos Cliente.
 Un Cliente tiene los siguiente atributos:
 -id:numérico y único
 -dni
 -nombre
 -saldo

 Operaciones a realizar:
 -Crear clientes y almacenarlos en el mapa
 -Buscar clientes por id y por dni */
package EjercicioMapa;

import java.util.Objects;

public class Cliente {

    private static int cont;
    private int id;
    private String dni;
    private String nombre;
    private int saldo;

    public Cliente(String dni, String nombre, int saldo) {
        cont++;
        this.id=cont;
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getId() {
        return id;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.dni);
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + this.saldo;
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }

        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (this.saldo != other.saldo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String s;
        s="Cliente-->";
        s+="\nDni="+this.dni;
        s+="\nNombre="+this.nombre;
        s+="\nSaldo="+this.saldo +"\n";
        return s;
    }

}
