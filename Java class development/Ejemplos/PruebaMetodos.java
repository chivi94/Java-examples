/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

/**
 *
 * @author gonriniv
 */
public class PruebaMetodos {

    public static void mostrarMensaje() {//Método.Ni recibe ni devuelve nada
        System.out.println("Hola");

    }
    
    public static void mostrarMensaje2(String msj){//Método.Recibe un objeto y devuelve el valor de ese objeto
        System.out.println(msj);
    }
    //Método que devuelve la cadena con el mensaje a mostrar
    public static String mostrarMensaje3(int a){

        if(a==0){
            String s="Mensaje 0";
            return s;
        }else if(a!=0){
            return "Mensaje distinto de 0";
        }
        return null;//es un valor asignable a una cadena,ya que es un objeto.Si no tiene valor,el compilador se queja
    }

    public static void main(String[] args) {
        
        mostrarMensaje();//llamada al método
        System.out.println("Adios");
        
        mostrarMensaje2("Hola lola");//msj contiene la cadena introducida en el sout,hola lola en este caso
        
        String cadena=mostrarMensaje3(5);
        System.out.println(cadena);
        
    }
}
