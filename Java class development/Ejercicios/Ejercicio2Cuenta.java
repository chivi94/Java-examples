package Ejercicios;

import java.util.Date;

public class Ejercicio2Cuenta {
    //Atributos

    private String numero;
    private double saldo;
    private Date fecha;
    private String dni;
    //Constructor parametrizado

    public Ejercicio2Cuenta(String dni,int numero) {
        this.numero = "";
        this.saldo = 0.0;
        this.fecha = new Date();
        this.dni=dni;

    }
    public double ingresar(double dinero){
        return this.saldo=+dinero;
    }
    public double reintegrar(double dinero) throws Exception{
        
        if(dinero>saldo){
            throw new Exception("El dinero que se quiere retirar supera el saldo");
        }
        return this.saldo=dinero;
    }
    public double incremento(int saldo){
        this.saldo=this.saldo+((saldo*2)/100);
                return this.saldo;
        
        
        
    }

//    public void asociar(String dni) {
//    }

    @Override
    public String toString() {
        return "Ejercicio2Cuenta{" + "numero=" + numero + ", saldo=" + saldo + ", fecha=" + fecha + ", dni=" + dni + '}';
    }
    
}
