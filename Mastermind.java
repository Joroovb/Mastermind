public class Mastermind {

    void start() {
        // Speler wordt welkom geheten en de spelregels uit gelegd

        // Maak nieuwe computer om tegen te spelen
        Computer computer = new Computer();
        //Computer genereert een code
        computer.generateCode();

        // Maak nieuwe speler om te spelen
        Speler speler = new Speler();
        // Start een beurt voor de speler
        speler.raden();

        //for (char letter : userCode) {
        //    if (letter == ) {

        //    }
        //}

        // Speler krijgt feedback of de code overeenkomt met de code van de computer

        // aantal correcte letters op de correcte plaats

        // aantal correcte letters op de verkeerde plaats


    }
public class Notificaties {

        void spelStart() {
            System.out.println( "Welkom bij Mastermind!\n" +
                                "In dit spel moet je de code van de computer raden!\n" +
                                "Het gaat om een code van vier letters.\n" +
                                "Alleen de letters a, b, c, d, e & f zijn toegestaan.\n" +
                                "Je hebt oneindig aantal pogingen, dus succes!");
        }

}
}
