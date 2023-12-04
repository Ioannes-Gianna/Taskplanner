// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        final TaskModel taskmodel1 = new TaskModel();
        taskmodel1.setTitle("Videos drehen");

        ITask cacheImpl = new CacheImpl();
        cacheImpl.add(taskmodel1);
        cacheImpl.list();
        //ITask dbImpl = new DBImpl();


    }
}