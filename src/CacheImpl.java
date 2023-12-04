import java.util.ArrayList;
import java.util.List;

public class CacheImpl extends TaskBaseImpl {
    private List<TaskModel> tasklist = new ArrayList<>();

    @Override
    public void add(TaskModel model) {
        tasklist.add(model);
    }

    @Override
    public void delete(TaskModel model) {

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
            System.out.println("Tasktitel ist: " + taskModel.getTitle());
        }
    }
}
