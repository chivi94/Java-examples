package Barcos;

public class AppBarcos {

    //Método genérico para barco
    public static void naufragio(Barco b) {
        b.alarma();//ligadura dinámica -->método polimórfico(POLIMORFISMO).Tiene un resultado diferente,dependiendo del objeto por el que es llamado
        if (b instanceof Velero) {
            Velero v = (Velero) b;
            v.metodo2();
        } else if (b instanceof Yate) {
            Yate y = (Yate) b;
            y.metodo3();
        }
    }

    public static void main(String[] args) {

//        Barco b;//referencia a la clase base
        //Creación de objetos derivados
        Velero v = new Velero();
        v.alarma();//-->ligadura estática.POLIMORFISMO

//        b=v;
//        b.alarma();//se ejecuta el del objeto derivado -->ligadura dinámica
//        b.metodo1();
       
        Yate y = new Yate();
        y.alarma();//-->ligadura estática

//        b=y;
//        b.alarma();//se ejecuta el del objeto derivado -->ligadura dinámica
        naufragio(v);
        naufragio(y);

    }
}
