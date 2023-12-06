// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ITask cacheImpl = new CacheImpl();


        //ITask dbImpl = new DBImpl();
        while (true) {
            final Menue menue = new Menue();
            menue.menueAnzeige();
            switch (menue.userEingabe()) {
                case 1: //Alle vorhandenen Tasks auflisten
                    cacheImpl.list();
                    break;
                case 2:  //Einen Task anlegen
                    String titel = menue.userEingabe("Bitte geben Sie den Tasknamen ein: ");

                    final TaskModel taskmodel1 = new TaskModel();
                    taskmodel1.setTitle(titel);
                    cacheImpl.add(taskmodel1);
                    break;
                case 3:
                    break;
                case 4:  //Einen Task löschen
                    System.out.println("Geben Sie die zu löschende ID ein: ");
                    int index = menue.userEingabe();
                    TaskModel taskModel = cacheImpl.getbyID(index);
                    cacheImpl.delete(taskModel);
                    System.out.println("Der Task mit dem Titel " + taskModel.getTitle() + " wurde gelöscht!");
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }


    }

    public void taskAnlegen() {
        //Wie soll der Task heißen über Scannerklasse anzeigen, Objekt(taskModel) übernehmen und hinzufügen.
    }
}