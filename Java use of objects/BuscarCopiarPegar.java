/*
 * 
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuscarCopiarPegar {

    public static void main(String[] args) {
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            int inicio = 0;//Variable que indica la posicion de inicio para la copia

            int fin = 0;//Variable que indica la posicion para finalizar la copia

            String copia = "";//Cadena donde se guarda la subcadena copiada
            

            boolean continua = true;/*
             * Cuando este valor es falso,el programa termina.Termina cuando
             * introduces algo fuera de lo especificado en el menú mostrado al usuario
             */

            System.out.print("Introduce una frase:");
            String frase = teclado.readLine();
            //Este bucle repetirá el menú para el usuario mientras el booleano "continua" sea cierto
            while (continua) {
                //Menú que muestra las opciones al usuario
                System.out.print("\n¿Qué opcíón deseas?\n"
                        + "C-Copiar.\n"
                        + "V-Pegar.\n"
                        + "B-Buscar.\n"
                        + "Introduce cualquier otra cosa para salir(también puedes salir con un intro).\n"
                        + "Opcion: ");
                String opcion = teclado.readLine();
                //Si el usuario introduce cualquiera de estas opciones,el programa copia
                if (opcion.equals("c") || opcion.equals("C")) {
                    System.out.print("HAS ELEGIDO COPIAR\n"
                            + "-----------------------------------------\n"
                            + "Ten en cuenta que se copia el texto que hay entre las posiciones que vas a indicar a continuación "
                            + "y que el rango de copia está entre 0 y " + (frase.length() - 1)
                            + "\nSeleccione la posición para iniciar la copia:");
                    //Aquí empieza la posición inicial de la copia
                    String posicion_inicio = teclado.readLine();
                    if(!"".equals(posicion_inicio)){
                        inicio=Integer.parseInt(posicion_inicio);
                    }
                    
                    //Los dos bucles siguientes vuelven a pedir las posiciones al usuario en caso de superar el rango de caracteres
                    while (inicio > frase.length() - 1) {/*
                         * En el caso de que el usuario meta una posición de
                         * inicio de copiado no válida, vuelve a pedir que
                         * introduzcaposición de pegado
                         */
                        System.out.print("Has seleccionado un rango no válido.Seleccione la posición para iniciar la copia:");
                        posicion_inicio = teclado.readLine();
                        if(!"".equals(posicion_inicio)){
                        inicio=Integer.parseInt(posicion_inicio);
                    }else{
                            inicio=0;
                        }

                    }//Aquí empieza la posición final de la copia
                    System.out.print("Seleccione la posición para finalizar la copia:");
                    String posicion_fin = teclado.readLine();
                    if(!"".equals(posicion_fin)){
                        fin=Integer.parseInt(posicion_fin);
                    }
                    //Si el usuario introduce una posición de fin de copiado no valida,vuelve a pedir que la introduzca
                    while (fin > frase.length() - 1 || fin < inicio) {
                        System.out.print("Has seleccionado un rango no válido.Seleccione para posición para finalizar la copia:");
                        posicion_fin = teclado.readLine();
                        if(!"".equals(posicion_fin)){
                        fin=Integer.parseInt(posicion_fin);
                    }else{
                            fin=0;
                        }
                        
                    }
                    copia = frase.substring(inicio, fin);
                    System.out.println("(Portapapeles '" + copia+"')");
                    /*
                     * Si el usuario introduce cualquiera de estas opciones,el
                     * programa pega la cadena anteriormente copiada. Si no se
                     * ha copiado nada anteriormente,"pega" lo que el usuario ha
                     * introducido anteriormente por teclado
                     */
                } else if (opcion.equals("v") || opcion.equals("V")) {
                    System.out.println("HAS ELEGIDO PEGAR");
                    System.out.println("-----------------------------------------");
                    System.out.print("Introduce posicion de pegado:");
                    int pegado = Integer.parseInt(teclado.readLine());
                    while (pegado > frase.length()) {/*
                         * En el caso de que el usuario meta una posición no
                         * válida,vuelve a pedir que introduzca posición de pegado
                         */
                        System.out.print("Introduce posicion de pegado:");
                        pegado = Integer.parseInt(teclado.readLine());


                    }
                    //aquí se guarda todo lo pegado en la variable frase,se modifica el valor de esta variable.
                    frase=frase.substring(0, pegado) + copia + frase.substring(pegado);
                    //imprime la cadena que se ha pegado
                    System.out.println("El texto pegado es el siguiente: " + frase);

                    //Si el usuario introduce cualquiera de estas opciones,el programa busca la cadena que se especifique en el menú
                } else if (opcion.equals("b") || opcion.equals("B")) {
                    System.out.println("HAS ELEGIDO BUSCAR");
                    System.out.println("-----------------------------------------");
                    System.out.print("Introduce palabra a buscar:");
                    String palabra = teclado.readLine();
                    int pos = frase.indexOf(palabra, 0);
                    while (pos > -1) {
                        //Imprime las posiciones en las que se encuentra la subcadena a buscar
                        System.out.print("Posicion: " + pos + " ");
                        pos = frase.indexOf(palabra, pos + palabra.length());
                    }


                } else {//Cuando el booleano indicado al principio es falso,el programa termina
                    continua = false;
                    System.out.println("Final del Programa");

                }
            }
        } catch (IOException ex) {
            Logger.getLogger(BuscarCopiarPegar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
