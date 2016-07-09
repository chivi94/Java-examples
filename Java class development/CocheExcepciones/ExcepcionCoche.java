package CocheExcepciones;

public class ExcepcionCoche extends Exception {

    public ExcepcionCoche(String msg){
        super(msg);//pasar al constructor del padre Exception el mensaje
    }
}
