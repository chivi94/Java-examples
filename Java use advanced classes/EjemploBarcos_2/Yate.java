package EjemploBarcos_2;

public class Yate extends Barco {

    public Yate() {
        System.out.println("Se crea la parte de un yate");
    }

    //sobreescritura del metodo heredado alarma()
    public void alarma() {
        System.out.println("S.O.S. desde un yate");
    }
    
    public static void metodo3(){
        System.out.println("Método3 de Velero");
    }
}
