package Ejemplos;



public class Bandera {
    public static void main(String[] args) {
        //mostrar números del 1 al 50
        int i=1;
        while(i<=50){
            System.out.println(i);
            i++;
        }
        //con bandera
        boolean bandera=true;
        int j=1;
        while(bandera){
            if(j==51){
                bandera=false;
            }else{
            System.out.println(j);
            j++;
            }
            
        }
//        try {
//            BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
//               System.out.println("Introduce S/N ");
//               char respuesta=teclado.readLine().charAt(0);
//               
//               while(respuesta!='S'&&respuesta!='N'){
//                   System.out.println("Incorrecto.Solo reconozco S/N");
//                   System.out.println("Introduce S o N:");
//                   respuesta=teclado.readLine().charAt(0);
//               }
//        } catch (IOException ex) {
//            System.err.println("Error");
//        }
    }
    
}