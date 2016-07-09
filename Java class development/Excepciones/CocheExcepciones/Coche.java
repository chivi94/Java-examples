/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones.CocheExcepciones;

/**
 *
 * @author Macarena
 */
public class Coche {

    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private double deposito;
    private int velocidad;
    private boolean arrancado;
    private final int VEL_MAX; //velocidad máxima
    private final double DEP_MAX;  //capacidad del depósito

    public Coche(String matricula, int vel_max, double dep_max) throws ExcepcionCoche {
        if (matricula.isEmpty()) {
            throw new ExcepcionCoche("Error. Coche sin matricula");
        } else {
            this.matricula = matricula;
            this.marca = "";
            this.modelo = "";
            this.velocidad = 0;
            this.deposito = 25.0;
            this.arrancado = false;
            VEL_MAX = vel_max;
            DEP_MAX = dep_max;
        }

    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }
    
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setArrancado(boolean arrancado) {
        this.arrancado = arrancado;
    }

    @Override
    public String toString() {
        return "velocidad=" + velocidad + "\ndeposito=" + deposito;
    }

    public String  arrancar() throws ExcepcionCoche {
        if (this.arrancado) {
            throw new ExcepcionCoche("Ya está arrancado");
        } else {
            if (this.deposito == 0) {
                throw new ExcepcionCoche("No hay gasolina");
            } else {
                this.arrancado = true;
                return "Ruuuuuuuunn!!";                
            }
        }
    }

    public void parar() throws ExcepcionCoche {
        if (!this.arrancado) {
            throw new ExcepcionCoche("Ya está parado");
        } else {
            if (this.velocidad > 0) {
                throw new ExcepcionCoche("No es posible parar con velocidad");
            } else {
                this.arrancado = false;               
            }
        }
    }

    public void repostar(double litros) throws ExcepcionCoche {
        if (this.arrancado) {
            throw new ExcepcionCoche("No es posible repostar en marcha");
        } else {
            if (this.DEP_MAX < deposito + litros) {
                throw new ExcepcionCoche("Demasiados litros. " +
                        "Deposito = " + this.deposito);
            } else {
                deposito += litros;                
            }
        }
    }

    public void acelerar() throws ExcepcionCoche {
        if (!this.arrancado) {
            throw new ExcepcionCoche("Primero debe arrancar");
        } else {
            if (this.velocidad + 10 > this.VEL_MAX) {
                throw new ExcepcionCoche("No es posible acelerar más. Velocidad máxima");
            } else {
                if (this.deposito > 0) {
                    this.velocidad += 10;
                    this.deposito -= 0.5;                    
                } else {
                   throw new ExcepcionCoche("No hay suficiente gasolina");
                    //para coche
                }
            }
        }
    }

    public void decelerar() throws ExcepcionCoche {
        if (!this.arrancado) {
            throw new ExcepcionCoche("Primero debe arrancar");
        } else {
            if (this.velocidad > 0) {
                this.velocidad -= 5;               
            } else {
                throw new ExcepcionCoche("No es posible decelerar. No hay velocidad");
            }
        }
    }
}
