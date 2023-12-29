public interface ITask {
    /**
     * Wir fügen einen neuen Task hinzu
     * @param model
     */
    void add(TaskModel model);

    /**
     * Wir löschen einen bestehenden Task
     * @param model
     */
    void delete(TaskModel model);

    /**
     * Wir editieren einen bestehenden Task
     * @param model
     */
    void edit(TaskModel model);

    /**
     * Wir listen alle Tasks auf
     */
    void list(boolean isOpen);
    public abstract TaskModel getbyID(int id);
}
