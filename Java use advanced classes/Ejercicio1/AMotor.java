package ejercicio1;

public class AMotor extends Barco {
    
    protected double cv;
    
    public AMotor(String matricula, double eslora, int anioFabrica) {
        super(matricula, eslora, anioFabrica);
    }

    public double getCv() {
        return cv;
    }
    
    public void setCv(double n) {
        this.cv = n;
    }

    @Override
    public double getModulo() {
        return super.getModulo() + this.cv;
    }
}
