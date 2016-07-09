package ejercicio1;

public class Yate extends AMotor {
   
    private int camarotes;

    public Yate(String matricula, double eslora, int anioFabrica) {
        super(matricula, eslora, anioFabrica);
    }

    public int getCamarotes() {
        return camarotes;
    }
    
    public void setCamarotes(int n) {
        this.camarotes = n;
    }

    //Métodos
    @Override
    public double getModulo() {
        return super.getModulo() + this.camarotes;
    }
}
