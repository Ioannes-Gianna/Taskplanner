import java.util.ArrayList;
import java.util.List;

public class CacheImpl extends TaskBaseImpl {
    private List<TaskModel> tasklist = new ArrayList<>();

    @Override
    public void add(TaskModel model) {
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

    }

    @Override
    public void setDone(TaskModel model) {

    }

    @Override
    public void list() {
        for (TaskModel taskModel : tasklist) {
            int index = tasklist.indexOf(taskModel);
            System.out.println("ID: " + index + " - Tasktitel ist: " + taskModel.getTitle());
        }
    }
}
