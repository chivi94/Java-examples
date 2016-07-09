

package Vivero;


public class Vivero {
    public static void mostrarDatos(Producto p){
        System.out.println(p.dameDescripcion()+" "+p.damePrecio());
    }
    public static void main(String[] args) {
        
        PlantaJardin planta=new PlantaJardin("geranio",25.5);
        mostrarDatos(planta);
        if(!planta.tieneRiego()){
            System.out.println("Necesita ser regada");
        }else{
            System.out.println("No es necesario regar la planta");
        }
        Alfareria tiesto=new Alfareria("Terracota",120.5);
        mostrarDatos(tiesto);
        tiesto.asignarEmbalaje("madera");
        System.out.println(tiesto.dameEmbalaje());
    }
}
