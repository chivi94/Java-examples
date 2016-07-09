package Ejemplos;

public class Comparaciones {

    public static void main(String[] args) {

        int a = 20;
        int b = 10;
        boolean resultado = a == b;//las comparaciones devuelven cierto o falso,es decir,valores booleanos
        //guardo la comparación en una variable
        System.out.println(resultado);
        System.out.println(a == b);//dice que a es igual a b
        System.out.println(a != b);//dice que a es distinto de b

        boolean mayorDeEdad, menorDeEdad;
        //int edad=21;
        //mayorDeEdad=(edad >=18);//mayor de edad será cierto
        //menorDeEdad=(!mayorDeEdad);//menor de edad será falso
        //System.out.println(mayorDeEdad);//cierto
        //System.out.println(menorDeEdad);//falso

        boolean carnetConducir=false;//boolean carnetConducir = true;
        int edad=10;//int edad = 20;
        boolean puedeConducir=(edad >=18)&&(carnetConducir==true);//boolean puedeConducir = (edad >= 18) && carnetConducir;
                                                                                                   //es lo mismo que decir carnetConducir=true   
                                                                                                //&&(carnetConducir==true);

        boolean noPuedeConducir=(edad<18)||(carnetConducir==false);//es lo mismo que poner boolean noPuedeConducir=!puedeConducir;
                                         //usas la puerta lógica OR porque con que uno sea verdadero
                                        //te dice que no puedes conducir 
        //boolean noPuedeConducir=(edad<18)||(!carnetConducir);
                                            //es lo que mismo que poner carnetConducir=false
                                           //niega la comparación anterior,la de &&carnetConducir,sea lo que sea
        
        int nota=6;
        String calificación;//aprobado o suspenso
        calificación=(nota>=5)?"APROBADO":"SUSPENSO";
        System.out.println(calificación);
        
        
           
        
    }
    
    
}
