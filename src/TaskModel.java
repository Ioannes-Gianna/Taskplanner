public class TaskModel implements Comparable <TaskModel> {
    private String title;
    private String note;
    private int prio;
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

    public int getPrio() {
        return prio;
    }

    public void setPrio(int weight) {
        this.prio = weight;
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
        if (prio == model.getPrio()){
            return 0;
        }
        if (prio < model.getPrio()){
            return -1;
        }
        return 1;
    }
}
