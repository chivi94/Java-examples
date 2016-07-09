
package Excepciones;




public class Excepcion4 {
    
    public static void main(String[] args) {
        try {
          int aleatorio=0;
            for (int i = 0; i < 10; i++) {
                aleatorio=(int)(Math.random()*100+1);
                rango(aleatorio);
                System.out.println("El numero generado es: "+aleatorio);
            }
            
        
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        
    }
    public static void rango(int aleatorio) throws Exception{
        if(aleatorio<5||aleatorio>90){
            throw new Exception("Error:"+aleatorio+" fuera de rango");
        }
    }
    
    }
    


