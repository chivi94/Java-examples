package ejercicio1;

public abstract class Barco { //podría ser abstracta
    
    protected String matricula;
    protected double eslora;
    protected int anioFab;

    //Constructor
    public Barco(String matricula, double eslora, int anioFab){
        this.matricula=matricula;
        this.eslora=eslora;
        this.anioFab=anioFab;
    }

    //Métodos genéricos para todos los barcos
    public double getModulo(){
        return this.eslora * 10;
    }
}
