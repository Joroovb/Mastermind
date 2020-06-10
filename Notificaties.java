public class Notificaties {

    void spelStart() {
        System.out.println( "\nWelcome to Mastermind!\n" +
                "In this game you have to crack a code!\n" +
                "You will see a four letter code.\n" +
                "This code will consist of the letters a, b, c, d, e & f.\n" +
                "You have infinite attempts, so GLHF!\n");
    }

    void raden() {
        System.out.println("Please enter the four letter code:\n");
    }

    void gewonnen() {
        System.out.println("You have beaten the computer! Hackerman!\n");
    }

    void nietGewonnen() {
        System.out.println("Incorrect code! Try Again!\n");
    }

    void badInput() {
        System.out.println("\nThis is not a correct input! Please enter a 4 letter code consisting of the letters a, b, c, d, e or f!\n");
    }

    void correctPosition(int x) {
        String letter = "letters";
        if (x == 1) {
            letter = "letter";
        }
        System.out.println("You have put " + x + " " + letter + " in the correct position!\n");
    }

    void charInCode (int x) {
        String letter = "letters";
        if (x == 1) {
            letter = "letter";
        }
        System.out.println("You have guessed " + x + " " + letter + " correctly, but not in the correct position!\n");
    }
}