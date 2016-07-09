/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Ivan
 */
public interface Usuario {

    String dni = "";
    String nombre = "";

    void conexion(int s); //Contabiliza ‘s’ segundos en la cuenta

    double importe(); //Calcula el importe facturable

    void reset(); //Pone a cero la cuenta

}
