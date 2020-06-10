import java.util.Scanner;

public class Speler {
    // Global notifier
    Notificaties notify = new Notificaties();

    // Boolean om op te slaan of de speler gewonnen heeft
    boolean heeftGewonnen = false;

    // Methode waarmee de speler kan raden
    public char[] raden() {
        // speler wordt gevraagd om code in te geven
        notify.raden();

        // speler voert code in en de code wordt getoont
        Scanner usr = new Scanner(System.in);
        String userInput = usr.nextLine();

        // Maakt de user input lowercase
        userInput = userInput.toLowerCase();

        // code wordt vertaald naar iets wat vergeleken kan worden met de code van de computer
        return userInput.toCharArray();
    }
}
