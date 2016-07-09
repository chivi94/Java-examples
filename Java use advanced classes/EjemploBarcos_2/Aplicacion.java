package Barcos;

public class Aplicacion {

    //Método genérico para cualquier Barco
    public static void naufragio(Barco b){
        b.alarma(); //ligadura dinámica --> método polimórfico (POLIMORFISMO)
        
        if(b instanceof Velero){
            Velero v=(Velero)b;
            v.metodo2();            
        }else if(b instanceof Yate){
            Yate y=(Yate)b;
            y.metodo3();
        }
    }   
    public static void main(String[] args) {      
        
        //creacion de objetos derivados
        Velero v = new Velero();
        Yate y=new Yate();
        
        v.alarma(); //POLIMORFISMO
        y.alarma(); //ligadura estática (MENOS ACEPTABLE)    
        
        naufragio(v);
        naufragio(y);   
        
    }
    
    
}
