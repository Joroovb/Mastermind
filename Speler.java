import java.util.Scanner;

public class Speler {

    public char[] raden() {
        // speler wordt gevraagd om code in te geven
        System.out.println("Please enter the four letter code:");

        // speler voert code in en de code wordt getoont
        Scanner usr = new Scanner(System.in);
        String userInput = usr.nextLine();
        System.out.println(userInput);

        // code wordt vertaald naar iets wat vergeleken kan worden met de code van de computer
        char[] userCode = userInput.toCharArray();
        for (char letter : userCode) {
            System.out.println(letter);
        }

        // als de speler niet een vier letterig woord in vult krijgt de speler een try again bericht
        if (userCode.length > 4) {
            System.out.println("Try Again!");
            // loop de speel methode
            raden();
            // als de speler niet een vier letterig woord in vult krijgt de speler een try again bericht
        } else if (userInput.length() < 4) {
            System.out.println("Please try again!");
            raden();

        } else {

        }
        return userCode;
    }
}
