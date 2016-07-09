package Ejercicios;

public class NombreApellidos2 {

    public static void main(String[] args) {
        //Declaramos 3 variables de tipo "String".Para declarar una variable ponemos el tipo de la variable y 
        //el nombre de dicha variable

//String nombre = "Ivan";
//String apellido1 = "Gonzalez";
//String apellido2 = "Rincon";
        //String mynameis;
        String nombre;              //cabe destacar que se puede hacer de la
        String apellido1;           //forma anterior y de la hecha a continuación
        String apellido2;

        //Damos valor a las variables
        //mynameis="Mi nombre es";
        nombre = "Ivan";//Si se cambia el nombre de la variable,por consola se muestra el último valor dado a la misma
        apellido1 = "Gonzalez";
        apellido2 = "Rincon";
        //nombre="Pepe";
        //Usamos el valor de las variables
        //mostrando su contenido

        System.out.println("Mi nombre es" + " " + nombre + " " + apellido1 + " " + apellido2);//Símbolo + sirve para enlazar variables

    }
}
