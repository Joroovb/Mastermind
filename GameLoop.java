import java.util.Arrays;

public class GameLoop {

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

            // Reset het aantal correcte posities naar 0 voordat de for loop begint
            int correctPosition = 0;
            // Check of de speler letters op een correcte plek heeft
            for (int i = 0; i < spelerCodeArray.length; i++) {
                if (spelerCodeArray[i] == computerCodeArray[i]) {
                    ++correctPosition;
                }
            }
            System.out.println("You have put " + correctPosition + " letters in the correct position!\n");

            // Check of de speler correcte letters heeft
            //if (new String(computerCodeArray).indexOf('q') == -1) {
                // do something
           // }

            // Check of de speler gewonnen heeft
            if (Arrays.equals(computerCodeArray, spelerCodeArray)) {
                speler.heeftGewonnen = true;
                notify.gewonnen();

            // De speler heeft niks goed
            } else {
                notify.nietGewonnen();
            }
        }
    }
}
