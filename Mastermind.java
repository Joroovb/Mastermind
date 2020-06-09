import java.util.Arrays;

public class Mastermind {

    void start() {
        // Speler wordt welkom geheten en de spelregels uit gelegd
        Notificaties notify = new Notificaties();
        notify.spelStart();

        // Maak nieuwe computer om tegen te spelen
        Computer computer = new Computer();
        //Computer genereert een code
        char[] computerCodeArray = computer.generateCode();

        // Maak nieuwe speler om te spelen
        Speler speler = new Speler();

        while (!speler.heeftGewonnen) {
            // Start een beurt voor de speler
            char[] spelerCodeArray =  speler.raden();

            if (Arrays.equals(computerCodeArray, spelerCodeArray)) {
                System.out.println("wow, dit is cool");
            } else {
                System.out.println("wow dit is niet cool");
            }


            speler.heeftGewonnen = true;
        }
        //for (char letter : userCode) {
        //    if (letter == ) {

        //    }
        //}

        // Speler krijgt feedback of de code overeenkomt met de code van de computer

        // aantal correcte letters op de correcte plaats

        // aantal correcte letters op de verkeerde plaats


    }
}
