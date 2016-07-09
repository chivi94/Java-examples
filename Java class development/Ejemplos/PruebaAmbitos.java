/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos;

/**
 *
 * @author gonriniv
 */
public class PruebaAmbitos {
    
    static int x=9;//variable de clase,utilizable por todos los metodos..Es declarada estatica porque los metodos que van a hacer uso de ella
                    //son estáticos.
    static int a=10;
    static int b=25;
    
    public static void metodo1(){      
        int a=5;
        System.out.println("El método1 es a="+a);//esta variable a es la declarada dentro de metodo1,ya que esta en un ambito mas cercano(local)
        System.out.println("El metodo1 x="+x);       
    }
    
    public static void metodo2(){
        int a=5;
        int b=10;
        //System.out.println("El método1 es a="+a);El compilador se queja porque la variable 'int a' es local a 'metodo1'
        System.out.println("El método2 es a="+a);//a=3 porque está declarada de forma local en el metodo2 con ese valor
        System.out.println("El método2 es b="+b);//b=10 "      "       "      "   "     "    "  "   "      "    "     "
        System.out.println("El metodo1 x="+x);
    }
    
    public static void metodo3(int c){//este parametro c es local al metodo3
        System.out.println("metodo3 c="+c);
        System.out.println("El metodo1 x="+x);
    }
    
    
    
    
    
    public static void main(String[] args) {
        metodo1();
        metodo2();
        metodo3(6);//el parametro 6 es actual,se copia en el parametro del metodo3,int c.Se crea en memoria una variable c=6.
        System.out.println("Metodo main x=" + x);
        
    }
    
}
