/*En un puerto se alquilan amarres para barcos de distinto tipo. Para cada ALQUILER se guarda el nombre y DNI del cliente, las fechas inicial y final de alquiler, la posición del amarre y el barco 
 que lo ocupará. Un BARCO se caracteriza por su matrícula, su eslora en metros y año de fabricación.
 Un alquiler se calcula multiplicando el número de días de ocupación (incluyendo los días inicial y final) por un módulo función de cada barco (obtenido simplemente multiplicando 
 por 10 los metros de eslora) y por un valor fijo (2 en la actualidad).
 Sin embargo ahora se pretende diferenciar la información de algunos tipos de barcos:
 Número de mástiles para veleros
 Potencia en CV para embarcaciones deportivas a motor
 Potencia en CV y número de camarotes para yates de lujo
 El módulo de los barcos de un tipo especial se obtiene como el módulo normal más:
 El número de mástiles para veleros
 La potencia en CV para embarcaciones deportivas a motor
 La potencia en CV más el número de camarotes para yates de lujo
 Utilizando la herencia de forma apropiada, diseña el diagrama de clases y sus relaciones, con detalle de atributos y métodos necesarios. Programa los métodos que permitan calcular el alquiler 
 de cualquier tipo de barco.*/
package Ejercicio1_mio;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Alquiler  {

    protected String dni;
    protected String nombre;
    protected static Date fecha_inicio;
    protected static Date fecha_fin;
    protected int posicion;
    protected Barco b;

    public Alquiler(String dni, Date fecha_inicio, Date fecha_fin, int posicion, Barco b) {
        this.dni = dni;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.posicion = posicion;
        this.b = b;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Date getFecha_inicio() {
        return fecha_inicio;
    }

    public static void setFecha_inicio(Date fecha_inicio) {
        Alquiler.fecha_inicio = fecha_inicio;
    }

    public static Date getFecha_fin() {
        return fecha_fin;
    }

    public static void setFecha_fin(Date fecha_fin) {
        Alquiler.fecha_fin = fecha_fin;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Barco getB() {
        return b;
    }

    public void setB(Barco b) {
        this.b = b;
    }

    public double calcularDias() {
        GregorianCalendar gc1 = new GregorianCalendar();
        GregorianCalendar gc2 = new GregorianCalendar();
        gc1.setTime(fecha_inicio);
        gc2.setTime(fecha_fin);
        int dias = gc2.get(Calendar.DAY_OF_YEAR) - gc1.get(Calendar.DAY_OF_YEAR) + 1;
        return dias * b.getModulo() * 2;

    }

}
