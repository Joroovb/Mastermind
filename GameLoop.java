public class GameLoop {

    void start() {
        // Geef het spel hersenen
        Brains brains = new Brains();

        // Global notifier
        Notificaties notify = new Notificaties();
        // Speler wordt welkom geheten en de spelregels uit gelegd
        notify.spelStart();

        // Maak nieuwe computer om tegen te spelen
        Computer computer = new Computer();

        // Maak nieuwe speler om te spelen
        Speler speler = new Speler();

        // Computer genereert een code
        char[] computerCodeArray = computer.generateCode();

        // Begin de Gameloop
        while (!speler.heeftGewonnen) {
            // Start een beurt voor de speler
            char[] spelerCodeArray = speler.raden();

            // Checkt of de input valid is
            if (!brains.isInputValid(spelerCodeArray)) {
                notify.badInput();
                continue;
            }

            // Check of de speler gewonnen heeft
            if (brains.playerGewonnen(computerCodeArray, spelerCodeArray)) {
                notify.gewonnen();
                break;
                // De speler heeft niet gewonnen
            } else {
                notify.nietGewonnen();
            }

            // Check of de speler letters goed geraden heeft
            brains.correctLetters(computerCodeArray, spelerCodeArray);

            // Check of de speler letters goed geraden heeft en op de correcte positie heeft staan
            brains.correctPositions(computerCodeArray, spelerCodeArray);
        }
    }
}
