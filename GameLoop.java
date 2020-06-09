public class GameLoop {

    void start() {
        // Geef het spel hersenen
        Brains brains = new Brains();

        // Speler wordt welkom geheten en de spelregels uit gelegd
        Notificaties notify = new Notificaties();
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

            // Check of de speler gewonnen heeft
            if (brains.playerGewonnen(computerCodeArray, spelerCodeArray)) {
                notify.gewonnen();
                // De speler heeft niet gewonnen
            } else {
                notify.nietGewonnen();
            }

            // Check of de speler letters goed geraden heeft en op de correcte positie heeft staan
            brains.correctPositions(computerCodeArray, spelerCodeArray);

            // Check of de speler letters goed geraden heeft
            brains.correctLetters(computerCodeArray, spelerCodeArray);
        }
    }
}
