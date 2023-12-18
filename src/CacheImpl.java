import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CacheImpl extends TaskBaseImpl {
    private List<TaskModel> tasklist = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void add(TaskModel model) {
        if (model.getPrio() == 0){
            model.setPrio(999);
        }
        tasklist.add(model);
    }
   @Override
    public TaskModel getbyID(int id){
        return tasklist.get(id);
    }

    @Override
    public void delete(TaskModel model) {
        tasklist.remove(model);

    }

    @Override
    public void edit(TaskModel model) {
        for (TaskModel task : tasklist) {
            if (task.getId() == model.getId()) {
                task.setTitle(model.getTitle());
                task.setNote(model.getNote());

                System.out.println("Task erfolgreich bearbeitet.");
                return;
            }
        }
        System.out.println("Der angegebene Task wurde nicht gefunden. Bitte geben Sie eine gültige ID ein.");
    }

    @Override
    public void setDone(TaskModel model) {

    }
    @Override
    public void list(boolean onlyOpenTasks) {
        Collections.sort(tasklist);
        for (TaskModel taskModel : tasklist) {
            if (onlyOpenTasks){
                if (!taskModel.isDone()) {
                    outputLog(taskModel);
                }
            }else{
                if (taskModel.isDone()) {
                    outputLog(taskModel);
                }
            }

            //Taskauflistung die nicht fertig markiert sind


        }


    }

    private void outputLog(TaskModel taskModel) {
        int index = tasklist.indexOf(taskModel);

        if (taskModel.getNote() == null ){
            System.out.println("ID: " + index + " - Tasktitel ist: " + taskModel.getTitle() +" \n Prio: " + taskModel.getPrio());
        }else{
            System.out.println("ID: " + index + " - Tasktitel ist: " + taskModel.getTitle()+" \n * " + taskModel.getNote() +" \n Prio: " + taskModel.getPrio());
        }


    }


}
