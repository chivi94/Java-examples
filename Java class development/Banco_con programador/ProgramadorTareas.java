package Banco_con programador;

import java.text.ParseException;
import java.util.Date;
import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.helpers.TriggerUtils;
//import org.quartz.TriggerUtils;
import org.quartz.impl.StdSchedulerFactory;

public class ProgramadorTareas {

    private SchedulerFactory sf = new StdSchedulerFactory();
    private Scheduler planificador;

    //Metodo que crea el horario
    private void crearProgramacion() {
        try {
            //Obteniendo el horario
            planificador = sf.getScheduler();
            //Damos inicio al horario
            planificador.start();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    //Metodo que programa más detalladamente el horario de la tarea: 
    //hora de inicio de la tarea y cada cuanto tiempo queremos que se ejecute la tarea
    public void iniciarTarea() throws ParseException {
        if (this.planificador == null) {
            this.crearProgramacion();
        }

        //Creamos la tarea/job
        //La informacion que se pide es un nombre, a que grupo pertenece
        //y la clase que implemente el Job
        JobDetail job = new JobDetail("TareaAutomatizar", Scheduler.DEFAULT_GROUP, Tarea.class);

        //Creamos un trigger y le decimos cada cuanto queremos que se invoque la tarea o Job
        //Tenemos metodos como los siguientes:
        //TriggerUtils.makeSecondlyTrigger(tiempo) --> Para invocar una tarea cada cierto nº de segundos
        //TriggerUtils.makeMinutelyTrigger(tiempo) --> Para invocar una tarea cada cierto nº de minutos
        //TriggerUtils.makeHourlyTrigger(tiempo) --> Para invocar una tarea cada cierta hora
        //TriggerUtils.makeWeeklyTrigger(TriggerUtils.FRIDAY, 10, 30); --> Los viernes a las 10:30
        //Hay muchos más...
        
        //También se pueden utilizar expresiones CRON (CronExpressions)para determinar el momento de la ejecución de la tarea
        //(para nuestro caso, el job se ejecutara a las 9:00pm el último día de cada mes).
        //En este caso tenemos que utilizar un objeto CronTrigger
        //CronTrigger crTrigger = new CronTrigger("Final de mes",Scheduler.DEFAULT_GROUP,"0 0 9 L * ?"); 
        
        //Este sería el trigger que queremos (al final de cada mes, a las 9:00)
        Trigger trigger = TriggerUtils.makeMonthlyTrigger(TriggerUtils.LAST_DAY_OF_MONTH, 9, 0);

        //Momento en el que se va a iniciar la tarea
        trigger.setStartTime(new Date());
        //El nombre del trigger que debe ser unico
        trigger.setName("Final de mes");
        //Finalmente se asignan estos dos objetos a la variable scheduler (planificador) para programar la tarea
        try {
            this.planificador.scheduleJob(job, trigger);
        } catch (SchedulerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
