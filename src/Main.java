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
                {
                    cacheImpl.list(true);
                }
                break;
                case 2:  //Einen Task anlegen
                {
                    String titel = menue.userEingabe("Bitte geben Sie den Tasknamen ein: ");

                    final TaskModel taskmodel1 = new TaskModel();
                    taskmodel1.setTitle(titel);


                    String isDescriptionRequested = menue.userEingabe("Möchten Sie eine Beschreibung hinzufügen ? [Ja/Nein]: ");
                    if (isDescriptionRequested.toLowerCase().contains("ja")) {
                        String note = menue.userEingabe("Geben Sie nun eine Beschreibung für den Task ein: ");
                        taskmodel1.setNote(note);

                    }
                    cacheImpl.add(taskmodel1);
                }
                break;
                case 3: // Einen vorhandenen Task editieren
                {
                    String taskEditierenAbfrage = menue.userEingabe("Möchten Sie einen Task editieren ? [Ja/Nein]: ");
                    if (taskEditierenAbfrage.toLowerCase().contains("ja")) {
                        System.out.println("Geben Sie nun die zu editierende ID ein: ");
                        int index = menue.userEingabe();
                        TaskModel taskModel = cacheImpl.getbyID(index); // Holen des zu bearbeitenden Tasks anhand der ID

                        if (taskModel != null) {
                            boolean editTitle = menue.userEingabeYesNo("Möchten Sie den Titel bearbeiten? [Ja/Nein]: ");
                            if (editTitle) {
                                String newTitle = menue.userEingabe("Geben Sie den neuen Titel ein: ");
                                taskModel.setTitle(newTitle);
                            }

                            boolean editDescription = menue.userEingabeYesNo("Möchten Sie die Beschreibung bearbeiten? [Ja/Nein]: ");
                            if (editDescription) {
                                String newDescription = menue.userEingabe("Geben Sie die neue Beschreibung ein: ");
                                taskModel.setNote(newDescription);
                            }

                            cacheImpl.edit(taskModel);
                        }
                    }
                }
                break;
                case 4:  //Einen Task löschen
                {
                    System.out.println("Geben Sie die zu löschende ID ein: ");
                    int index = menue.userEingabe();
                    TaskModel taskModel = cacheImpl.getbyID(index);
                    cacheImpl.delete(taskModel);
                    System.out.println("Der Task mit dem Titel " + taskModel.getTitle() + " wurde gelöscht!");
                }
                break;
                case 5: //Einen Task priorisieren
                {
                    cacheImpl.list(true);
                    System.out.println("Geben Sie die zu priorisierende ID ein: ");
                    int index = menue.userEingabe();
                    System.out.println("Geben Sie die neue Gewichtung für Ihren Task ein: ");
                    int weight = menue.userEingabe();
                    TaskModel taskModel = cacheImpl.getbyID(index);
                    taskModel.setWeight(weight);

                }

                break;
                case 6: //Einen Task als abgeschlossen markieren
                {
                    cacheImpl.list(true);
                    System.out.println("Wählen sie aus, welchen Task sie als abgeschlossen markieren möchten: ");
                    int i = menue.userEingabe();
                    TaskModel taskModel1 = cacheImpl.getbyID(i);
                    taskModel1.setDone(true);
                }
                break;
                case 7: // Alle Tasks erledigten Tasks auflisten
                {
                    cacheImpl.list(false);
                }

            }
        }


    }

    public void taskAnlegen() {
        //Wie soll der Task heißen über Scannerklasse anzeigen, Objekt(taskModel) übernehmen und hinzufügen.
    }
}