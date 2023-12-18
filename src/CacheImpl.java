import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CacheImpl extends TaskBaseImpl {
    private List<TaskModel> tasklist = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void add(TaskModel model) {
        System.out.println("Geben Sie die Gewichtung für Ihren Task ein: ");
        int weight = scanner.nextInt();
        model.setWeight(weight);

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
                    int index = tasklist.indexOf(taskModel);
                    System.out.println("ID: " + index + " - Tasktitel ist: " + taskModel.getTitle()+" \n * " + taskModel.getNote() +" \n Gewichtung: " + taskModel.getWeight() );
                }
            }else{
                if (taskModel.isDone()) {
                    int index = tasklist.indexOf(taskModel);
                    System.out.println("ID: " + index + " - Tasktitel ist: " + taskModel.getTitle()+" \n * " + taskModel.getNote()+" \n Gewichtung: " + taskModel.getWeight());
                }
            }

            //Taskauflistung die nicht fertig markiert sind


        }


    }


}
