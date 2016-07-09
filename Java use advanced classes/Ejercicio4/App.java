package Ejercicio4_bis;

public class App {

    public static void facturar(Cliente c){
        System.out.println("Cliente: " + c.getNombre() + "  " + c.getDNI());
        System.out.println("Segundos conectado: " + c.seg + " a " + c.precioSeg + " €");
        System.out.println("Factura: " + c.importe());         
    }
    
    public static void main(String[] args) {

        Cliente1 cli1 = new Cliente1("Luis", "71111000Z", 0.1);
        cli1.conexion(360); //se conecta 6 minutos
        cli1.conexion(60); //se concecta 1 minuto

        Cliente2 cli2 = new Cliente2("Maria", "12345678A", 0.1, 0.05);
        cli2.conexion(360); //se conecta 6 minutos
        cli2.conexion(60); //se concecta 1 minuto

        GranCliente gC = new GranCliente("Tomas", "09888777B", 0.1, 0.05);
        gC.conexion(360); //se conecta 6 minutos
        gC.conexion(60); //se concecta 1 minuto

        facturar(cli1);
        facturar(cli2);
        facturar(gC);        
    }
}
