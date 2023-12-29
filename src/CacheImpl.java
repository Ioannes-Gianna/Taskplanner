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
        this.tasklist.add(model);
    }
   @Override
    public TaskModel getbyID(int id){
        return this.tasklist.get(id);
    }

    @Override
    public void delete(TaskModel model) {
        this.tasklist.remove(model);

    }

    @Override
    public void edit(TaskModel model) {
        for (TaskModel task : this.tasklist) {
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
    public void list(boolean onlyOpenTasks) {
        Collections.sort(this.tasklist);
        for (TaskModel taskModel : this.tasklist) {
            if (onlyOpenTasks){
                if (!taskModel.isDone()) {
                    super.outputLog(taskModel, this.tasklist);
                }
            }else{
                if (taskModel.isDone()) {
                    super.outputLog(taskModel, this.tasklist);
                }
            }
        }
    }
}
