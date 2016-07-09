package Banco;

public class Cliente {

    private int codCli;
    private String NIF;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String tf;
    private static int contCli;

    public Cliente(String dni, String nombre, String apellidos) throws Exception {
        if (dni.isEmpty() || nombre.isEmpty() || apellidos.isEmpty()) {
            throw new Exception("Error al crear cliente");
        } else {
            //generamos el codigo del cliente
            contCli++;
            //asignamos los valores recibidos
            this.codCli = contCli;
            this.NIF = dni;
            this.nombre = nombre;
            this.apellidos = apellidos;
            //inicializamos el resto de los datos
            this.direccion = "";
            this.tf = "";
        }
    }

    //Metodos get y set
    public int getCodCli() {
        return this.codCli;
    }

    public String getNIF() {
        return this.NIF;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getTf() {
        return this.tf;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTf(String tf) {
        this.tf = tf;
    }

    //Metodos de utilidad
    @Override
    public String toString() {
        String msg;
        msg = "Código cliente: " + this.codCli + "\t";
        msg += "NIF: " + this.NIF + "\n";
        msg += "\t" + this.apellidos + ", " + this.nombre + "\n";
        msg += "\tDirección: " + this.direccion + "\t";
        msg += "Tfno.: " + this.tf + "\n";
        return msg;
    }
}
