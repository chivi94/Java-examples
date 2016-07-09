package Ejemplo1;

import java.util.*;

public class GatosYPerros {

    // se introducen en el contenedor Gatos y Perros,
    // y despues se extraen para manipularlos

    public static void main(String[] args) {

        //creamos un contenedor de objetos Gato
        ArrayList <Gato>gatos = new ArrayList <Gato>();//<>dentro de estas señas,se indica el tipo que se quiere añadir al array,restringiendo de esa forma los objetos que recibe la lista

        //le llenamos con 7 objetos Gato
        for (int i = 0; i < 7; i++) {
            gatos.add(new Gato(i));
        }

        //metemos despues un objeto Perro
        //gatos.add(new Perro(7));

        //mostramos por pantalla los objetos del contenedor
        //recorremos todo el contenedor
        for (int i = 0; i < gatos.size(); i++) //extraemos el objeto i-esimo y mostramos sus datos
        {
            ((Gato) gatos.get(i)).escribir();//la excepción sale porque se está haciendo un casting de Perro a tipo Gato,y no se puede
        }
        
        //Recorrido del ArratList con un iterador
        //pedimos el iterador al contenedor de gatos
        Iterator it=gatos.iterator();
        //recorremos todo el contenedor con el iterador y mostramos por pantalla los objetos que contiene
        while(it.hasNext()){
            ((Gato)it.next()).escribir();//tambien se puede poner un iterador que solo recorre gatos Iterator <Gato> it=gatos.iterator();de esta forma,accedemos a escribir sin hacer casting a Gato     
        }
        
        ListIterator <Gato> list=gatos.listIterator();
        //el "Perro" solo se detecta en tiempo de ejecucion
        //entonces lanzar� una excepci�n
    }
}
