package Exercise;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Alquiler {
    
    private String nombreCli;
    private String DNI;
    private Date fechaIni;
    private Date fechaFin;
    private String amarre;
    private Barco b;

    public Alquiler(String dni, Date fechaIni, Date fechaFin, String amarre, Barco b) {
        this.DNI = dni;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.amarre = amarre;
        this.b = b;
    }

    public String getDNI() {
        return DNI;
    }

    public String getAmarre() {
        return amarre;
    }

    public Barco getB() {
        return b;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public String getNombreCli() {
        return nombreCli;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setAmarre(String amarre) {
        this.amarre = amarre;
    }

    public void setB(Barco b) {
        this.b = b;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public void setNombreCli(String nombreCli) {
        this.nombreCli = nombreCli;
    }

    public double totalAlquiler() {
        GregorianCalendar gc1 = new GregorianCalendar();
        GregorianCalendar gc2 = new GregorianCalendar();
        gc1.setTime(fechaIni);
        gc2.setTime(fechaFin);
        int dias = gc2.get(Calendar.DAY_OF_YEAR) - gc1.get(Calendar.DAY_OF_YEAR) + 1;
//        System.out.println("Días " + dias); //Prueba de cáculo de días
        return dias * b.getModulo() * 2;
    }
}
