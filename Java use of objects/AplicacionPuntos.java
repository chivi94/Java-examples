
package Ejemplos;


public class AplicacionPuntos {
    public static void main(String[] args) {
        
        //Crear el punto(3.5,7.0)
        
        Punto p1=null;//referencia(es una variable) al tipo Punto
        p1=new Punto();//creación del objeto Punto
        
        p1.x=3.5;
        p1.y=7.0;
        
        System.out.println(p1.x);
        System.out.println(p1.y);
        
        //Crear el punto (5,5)
        Punto p2=new Punto();
        p2.x=5.0;
        p2.y=5.0;
        System.out.println(p2.x);
        System.out.println(p2.y);
        
        //Crear el punto (1,1)
        Punto p3=null;
        p3=new Punto();
        p3.x=1.0;
        p3.y=1.0;
        
        System.out.println(p3.x+","+p3.y);
        
        String s="Hola";
        String s1=new String("Adios");
        
        //Creamos el circulo de radio 2
        Circulo c=new Circulo();//radio 0.0(en este momento
        //c.radio=2.0;
        
        c.setRadio(2);//con setRadio podemos usar atributos privados de la clase 
        double area=c.calcularArea();
        System.out.println("Area="+area);
        
        
        
        
        
        
    }
    
}
