package Soluciones;

import java.io.Serializable;

public class Participante_1 implements Serializable {

    private int codigo;
    private String nombre;
    private int edad;
    private String direccion;
    public static int cont;

    public Participante_1(String nombre, int edad, String direccion) throws Exception {
        if(nombre==null || nombre.isEmpty()) throw new Exception("1");
        if(edad==0) throw new Exception("2");
        cont++;
        this.codigo=cont;
        this.nombre=nombre;
        this.edad=edad;
        this.direccion=direccion;
    }
    
    public int getCodigo() {
        return this.codigo;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    @Override
    public String toString() {
        return "Participante{" + "codigo=" + codigo + ", nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + '}';
    }
    
}
