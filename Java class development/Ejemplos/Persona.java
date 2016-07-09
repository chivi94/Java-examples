package Ejemplos;

import java.text.DateFormat;
import java.util.Date;
import java.util.Objects;

public class Persona {

    //Atributos
    private String dni;//El valor por defecto de estos atributos es:String=null;int=0.
    private String nombre;
    private String apellidos;
    private Date fechaNac;
    private int edad;

    //Constructor/es
    
    //--constructor por defecto
    public Persona(){
        this.dni="";
        this.nombre="";
        this.apellidos="";
        this.fechaNac=new Date();
        this.edad=0;
    }
    
    //Constructor parametrizado
    public Persona(String dni){
        //valor inicial de mi objeto
        this.dni=dni;
        this.nombre="";
        this.apellidos="";
        this.fechaNac=new Date();
        this.edad=0;
    }
    public Persona(String dni,String nombre,String apellidos,Date fecha,int edad){
        this.dni=dni;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.fechaNac=fecha;
        this.edad=edad;
        
    }
    
    //Métodos.Boton derecho>insertar codigo(insert code)>setter>marcar todos
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;/*
         * el metodo asigna valor a un atributo,apellidos en este caso(el valor
         * que tenga la cadena apellidos,porque es la que el metodo recibe como parametro)
         */

    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //Estos metodos no reciben nada.Lo devuelven(los metodos get)

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechaNac() {
        DateFormat formateador = DateFormat.getDateInstance();
        String fecha = formateador.format(fechaNac);
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    @Override//quiere decir que el método está sobreescrito
    public String toString() {
        String s = "";
        s = this.apellidos + ", " + this.nombre;
        s = s + ", " + "Años: " + this.edad;
        s = s + ", " + "Fecha nacimiento: " + this.getFechaNac();
        return s;
    }

    public boolean equals(Persona otra) {//Recibe un objeto persona(Persona otra) que hay que comparar con el objeto actual
        //dentro del booleano público "declaramos" la variable,indicando el tipo(Persona) y el nombre(otra)

        boolean iguales = true;
        if (this.nombre.equals(otra.nombre) == false) {
            iguales = false;
        } else if (!this.apellidos.equals(otra.apellidos)) {
            iguales = false;
        } else if (this.edad != otra.edad) {
            iguales = false;
        } else if (!this.dni.equals(otra.dni)) {
            iguales = false;
        } else if (!this.fechaNac.equals(otra.fechaNac)) {
            iguales = false;
        }
        return iguales;
    }

    @Override//Este apartado de código se usará más adelante
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.fechaNac, other.fechaNac)) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        return true;
    }
}
