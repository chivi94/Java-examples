package Banco_con programador;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

//La clase que tiene la tarea debe de implementar la clase Job de Quartz
//ya que el programador de la tarea va a buscar una clase que la implemente 
//y buscará el metodo execute para ejecutar la tarea

public class Tarea implements Job {

    //Metodo que se ejecutará cada cierto tiempo (indicado por el Programador)
    @Override
    public void execute(JobExecutionContext jec) throws JobExecutionException {
        //Tarea a automatizar
         AplicacionBanco.calcularIntereses();        
    }
}
