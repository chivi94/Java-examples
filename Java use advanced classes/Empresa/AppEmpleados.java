/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

/**
 *
 * @author gonriniv
 */
public class AppEmpleados {

    public static void main(String[] args) {

        Programador pp = new Programador("pepe", "soplillo", 10);
//        pp.setNombre("Pepe");
//        pp.setApellidos("Soplillo");
        pp.setSalario(1000);
        pp.setHoras(20);
//        pp.setPrecio(10);
        pp.setRetencion(0.15);

        System.out.println("Datos del Programador: " + pp.toString());
        System.out.println("Salario del Programador: " + pp.calcularSalario(100));
        System.out.println(pp.metodo1());
        System.out.println(pp.metodo1(" holita"));
    }
}
