package Excepciones;

public class Coche {
    //Atributos

    private String matricula;
    private String marca;
    private String modelo;
    private double deposito;//cantidad de gasolina del coche en un momento inicial
    private int velocidad;//velocidad del coche en cada momento
    private boolean arrancado;//indica si el coche está arrancado o no
    private int VELOCIDAD_MAX;//velocidad maxima del coche
    private double DEPOSITO_MAX;//capacidad maxima del deposito del coche
    //Contructor parametrizado

    public Coche(String matricula, int vel_max, double dep_max) {
        if (matricula.isEmpty()) {//el método isEmpty se usa para indentificar cadenas vacías
            System.out.println("Error.Coche sin matrícula");
        } else {
            this.matricula = matricula;
            this.marca = "";
            this.modelo = "";
            this.deposito = 25.0;
            this.velocidad = 0;
            this.arrancado = false;

            VELOCIDAD_MAX = vel_max;
            DEPOSITO_MAX = dep_max;
        }
    }

    public boolean isArrancado() {
        return arrancado;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Coche{" + "velocidad=" + this.velocidad + " Km/h, deposito=" + this.deposito + " litros}";
    }

    public void arrancar() throws Exception  {

        if (this.arrancado == true) {
            throw new Exception("Error,el coche ya está arrancado");
        } else if (this.deposito == 0) {
            throw new Exception("Error,el coche no tiene gasolina");
        } else {
            this.arrancado = true;
            System.out.println("El coche está arrancado");
            System.out.println(this.toString());
        }
    }

    public void parar() throws Exception {
        if (this.arrancado == false) {
            throw new Exception("Error,el coche ya está parado");
        } else if (this.velocidad > 0) {
            throw new Exception("El coche está en marcha,no se puede parar");

        } else {
            this.arrancado = false;
            System.out.println("El coche está parado");
        }
    }

    public void acelerar() throws Exception {

        if (this.arrancado == false) {
            throw new Exception("El coche está parado,no se puede acelerar");

        } else if (this.deposito < 0.5) {
            throw new Exception("No queda gasolina suficiente para acelerar el coche");
        } else {

            if (this.velocidad >= this.VELOCIDAD_MAX) {
                throw new Exception("Error,el coche no se puede acelerar más,ha alcanzado su velocidad máxima " + this.VELOCIDAD_MAX + " Km/h");
            } else {
                System.out.println("Ha comenzado la aceleración del vehículo");
                this.velocidad += 10;
                this.deposito -= 0.5;

                System.out.println("La velocidad actual es:" + this.velocidad + " Km/h");
                System.out.println("La gasolina del depósito es:" + this.deposito + " litros");
            }
        }
        if (this.deposito == 0) {
            this.arrancado = false;
        }
    }

    public void decelerar() throws Exception {
        if (this.arrancado == false) {
           throw new Exception("No se puede decelerar,el coche no está arrancado");
        } else if (this.velocidad == 0) {
            throw new Exception("No se puede decelerar,el coche no tiene velocidad");
        } else {
            System.out.println("El coche ha decelerado");
            this.velocidad -= 5;
            System.out.println("Velocidad actual:" + this.velocidad + " Km/h");
        }
    }

    public void repostar(double litros) throws Exception {
        if (this.velocidad > 0) {
            throw new Exception("No se puede repostar,el coche está en marcha");
        }

        this.deposito += litros;
        if (this.deposito > this.DEPOSITO_MAX) {
            throw new Exception("No se puede repostar gasolina,se ha alcanzado la capacidad máxima:" + this.DEPOSITO_MAX + " litros");
            
        } else {
            System.out.println("La gasolina actual del depósito es:" + this.deposito + " litros");
        }
    }
}
