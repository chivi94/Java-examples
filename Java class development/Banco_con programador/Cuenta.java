package Banco;


import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class Cuenta {

    private String numCuenta;
    private Date fechaApertura;
    private double saldo;
    private Cliente cli; //Cliente asociado a la cuenta
    private DateFormat df;

    //Constructor
    public Cuenta(Cliente cli, String numCuenta) throws Exception {
        if (cli == null || numCuenta.isEmpty()){
            throw new Exception("Error al crear cuenta");
        } else {
            this.cli = cli;
            this.fechaApertura = new Date();
            this.saldo = 0;
            df=DateFormat.getInstance();
            this.numCuenta = numCuenta;
        }
    }

    //Metodos get y set
    public String getNumeroCuenta() {
        return this.numCuenta;
    }

    public String getFecha() {
        return df.format(this.fechaApertura);
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Cliente getCliente() {
        return this.cli;
    }

    public void setFecha(String fecha) throws ParseException {
        this.fechaApertura = df.parse(fecha); //String -> Date
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Cliente cli) {
        this.cli = cli;
    }

    //Métodos de utilidad
    @Override
    public String toString() {
        String msg;
        msg = "Nº cuenta: " + this.numCuenta + "\n";
        msg += "\tFecha apertura: " + df.format(this.fechaApertura) + "\t";
        msg += "Saldo: " + this.saldo + "\n";
        msg += "\tTitular-> " + this.cli.toString();

        return msg;
    }    
    
    public void ingreso(double cantidad) {
        this.saldo = this.saldo + cantidad;
    }

    public void reintegro(double cantidad) throws Exception {
        if (this.saldo < cantidad) {
            throw new Exception("Saldo insuficiente");
        } else {
            this.saldo = this.saldo - cantidad;
        }
    }
    
    public void sumarInteres(){
        this.saldo=1.02*this.saldo;
    }
    
}
