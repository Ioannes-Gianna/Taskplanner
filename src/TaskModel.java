public class TaskModel implements Comparable <TaskModel> {
    private String title;
    private String note;
    private int weight;
    private boolean isDone;

    private int id;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }


    public Integer getId() {
        return this.id;
    }

    /**
     * Compare Interface für die Collections-Klasse. Wenn weight == model.getWeight dann ist das Objekt gleich und ändert seine Position nicht.
     * Wenn weight < model.getWeight dann wird die Position vom Objekt nach vorne geschoben.
     * Wenn weight > model.getWeight dann wird die Position vom Objekt nach hinten geschoben.
     * @param model the object to be compared.
     * @return
     */
    @Override
    public int compareTo(TaskModel model) {
        if (weight == model.getWeight()){
            return 0;
        }
        if (weight < model.getWeight()){
            return -1;
        }
        return 1;
    }
}
