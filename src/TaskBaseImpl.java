import java.util.List;

/**
 * Eine abstrakte Zwischenschicht die alle Implementierungen die identisch sind in CacheImpl und DBImpl können hier hinterlegt werden.
 */
public abstract class TaskBaseImpl implements ITask{

    /**
     * Der outputLog steht somit in der übergeordneten Klasse CacheImpl und DBImpl zur Verfügung und muss nicht doppelt implementiert werden.
     * @param taskModel
     * @param tasklist
     */
    protected void outputLog(TaskModel taskModel, List<TaskModel> tasklist) {
        int index = tasklist.indexOf(taskModel);

        if (taskModel.getNote() == null ){
            System.out.println("ID: " + index + " - Tasktitel ist: " + taskModel.getTitle() +" \n Prio: " + taskModel.getPrio());
        }else{
            System.out.println("ID: " + index + " - Tasktitel ist: " + taskModel.getTitle()+" \n * " + taskModel.getNote() +" \n Prio: " + taskModel.getPrio());
        }


    }
}
