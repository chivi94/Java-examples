package US;

/**
 *
 * @author Ivan
 */
public class AppCliente {
    
    public static void main(String[] args) {
//        Cliente2 pp= new Cliente2("123456","Pepe",5);
//        pp.conexion(100);
//        pp.importe();
//        System.out.println(pp.toString());
//        pp.reset();
        
//        Cliente1 ps= new Cliente1("123456","Pepe",5);
//        ps.conexion(200);
//        ps.importe();
//        System.out.println(ps.toString());
//        ps.reset();
        
        GranCliente ps= new GranCliente("123456","Pepe",5);
        ps.conexion(200);
        ps.importe();
        System.out.println(ps.toString());
        ps.reset();
    }
}
