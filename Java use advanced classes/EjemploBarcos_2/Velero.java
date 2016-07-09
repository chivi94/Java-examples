package EjemploBarcos_2;

public class Velero extends Barco {

    public Velero() {
        System.out.println("Se crea la parte de un velero");
    }

    //sobreescritura del metodo heredado alarma()
    @Override
    public void alarma() {
        System.out.println("S.O.S. desde un velero");
    }
    
    public static void metodo2(){
        System.out.println("Método2 de Velero");
    }
}
