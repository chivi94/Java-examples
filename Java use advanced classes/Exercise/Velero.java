package Exercise;

public class Velero extends Barco {
   
    private int numMastiles;
   
    public Velero(String matricula, double eslora, int anioFabrica) {
        super(matricula, eslora, anioFabrica);
    }

    public int getNumMastiles() {
        return numMastiles;
    }
  
    public void setNumMastiles(int n) {
        this.numMastiles = n;
    }

    @Override
    public double getModulo() {
        return super.getModulo() + this.numMastiles;
    }
}
