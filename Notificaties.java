public class Notificaties {

    void spelStart() {
        System.out.println( "\nWelkom bij Mastermind!\n" +
                "In dit spel moet je de code van de computer raden!\n" +
                "Het gaat om een code van vier letters.\n" +
                "Alleen de letters a, b, c, d, e & f zijn toegestaan.\n" +
                "Je hebt oneindig aantal pogingen, dus succes!\n");
    }

    void gewonnen() {
        System.out.println("Je hebt gewonnen van de computer! Hackerman!");
    }

    void nietGewonnen() {
        System.out.println("Helaas, dat was niet het goede antwoord!");
    }

    void badInput() {
        System.out.println("\nThis is not a correct input! Please enter a 4 letter code consisting of the letters a, b, c, d, e or f!\n");
    }
}