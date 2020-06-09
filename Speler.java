import java.util.Scanner;

public class Speler {
    // Global notifier
    Notificaties notify = new Notificaties();

    // Boolean om op te slaan of de speler gewonnen heeft
    boolean heeftGewonnen = false;

    // Toegestane letters
    String s = "abcdef";

    // Methode waarmee de speler kan raden
    public char[] raden() {
        // speler wordt gevraagd om code in te geven
        System.out.println("Please enter the four letter code:");

        // speler voert code in en de code wordt getoont
        Scanner usr = new Scanner(System.in);
        String userInput = usr.nextLine();
        System.out.println(userInput);

        // code wordt vertaald naar iets wat vergeleken kan worden met de code van de computer
        char[] userCode = userInput.toCharArray();

        // als de speler niet een vier letterig woord in vult krijgt de speler een try again bericht
        if (userCode.length > 4) {
            notify.badInput();
            // loop de speel methode
            raden();
            // als de speler niet een vier letterig woord in vult krijgt de speler een try again bericht
        } else if (userInput.length() < 4) {
            notify.badInput();
            raden();
        }
            return userCode;
    }
}
