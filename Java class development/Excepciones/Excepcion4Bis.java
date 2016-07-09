package Excepciones;

public class Excepcion4Bis {

    public static void main(String[] args) {
        
            int aleatorio = 0;
            
            for (int i = 0; i < 10; i++) {
                try {
                aleatorio = (int) (Math.random() * 100 + 1);

                if (aleatorio > 5 && aleatorio < 90) {
                    System.out.println("El numero generado es"+'('+i+"):" + aleatorio);
                } else {
                    throw new Exception("Error:" + aleatorio + " fuera de rango");
                }
            
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

    }
}
}