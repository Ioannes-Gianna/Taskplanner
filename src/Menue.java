import java.util.Scanner;

public class Menue {
    public void menueAnzeige() {
        final StringBuilder sb = new StringBuilder();
        sb.append("--TaskPlanner:-- \n")
                .append("Menue: \n")
                .append("1.: Alle vorhandenen Tasks auflisten \n")
                .append("2.: Einen Task anlegen \n")
                .append("3.: Einen Task bearbeiten \n")
                .append("4.: Einen Task löschen \n")
                .append("5.: Einen Task priorisieren \n")
                .append("6.: Einen Task als abgeschlossen markieren \n")
                .append("7.: Alle Tasks auflisten die als abgeschlossen sind \n");

        System.out.println(sb);
    }

    public int userEingabe(){
        System.out.println("Bitte wähle einen Menuepunkt aus [1-6]");
        Scanner scanner1 = new Scanner(System.in);
        return scanner1.nextInt();
    }

    public String userEingabe(String message){
        System.out.println(message);
        Scanner scanner1 = new Scanner(System.in);
        return scanner1.nextLine();
    }

    public boolean userEingabeYesNo(String message){
        System.out.println(message);
        Scanner scanner1 = new Scanner(System.in);
        String input = scanner1.nextLine().toLowerCase(); // Eingegebene Zeichenfolge in Kleinbuchstaben konvertieren

        return input.equals("ja"); // Prüfen, ob die Eingabe "Ja" ist
    }

}
