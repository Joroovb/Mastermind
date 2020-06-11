public class Notificaties {

    void spelStart() {
        System.out.println( "                                                                                                                            \n" +
                "88b           d88                                                                             88                        88  \n" +
                "888b         d888                           ,d                                                \"\"                        88  \n" +
                "88`8b       d8'88                           88                                                                          88  \n" +
                "88 `8b     d8' 88  ,adPPYYba,  ,adPPYba,  MM88MMM  ,adPPYba,  8b,dPPYba,  88,dPYba,,adPYba,   88  8b,dPPYba,    ,adPPYb,88  \n" +
                "88  `8b   d8'  88  \"\"     `Y8  I8[    \"\"    88    a8P_____88  88P'   \"Y8  88P'   \"88\"    \"8a  88  88P'   `\"8a  a8\"    `Y88  \n" +
                "88   `8b d8'   88  ,adPPPPP88   `\"Y8ba,     88    8PP\"\"\"\"\"\"\"  88          88      88      88  88  88       88  8b       88  \n" +
                "88    `888'    88  88,    ,88  aa    ]8I    88,   \"8b,   ,aa  88          88      88      88  88  88       88  \"8a,   ,d88  \n" +
                "88     `8'     88  `\"8bbdP\"Y8  `\"YbbdP\"'    \"Y888  `\"Ybbd8\"'  88          88      88      88  88  88       88   `\"8bbdP\"Y8  \n" +
                "                                                                                                                            \n" +
                "                                                                                                                            ");
        System.out.println( "\n\n\nWelcome to Mastermind!\n" +
                "In this game you have to crack a code!\n" +
                "You will see a four letter code.\n" +
                "This code will consist of the letters a, b, c, d, e & f.\n" +
                "You can always enter q to exit the program!\n" +
                "You have infinite attempts, so GLHF!\n");
    }

    void raden() {
        System.out.println("Please enter the four letter code:\n");
    }

    void gewonnen() {
        System.out.println("You have beaten the computer! Hackerman!\n");
        Sound sound = new Sound();
        sound.won();
    }

    void nietGewonnen() {
        System.out.println("Incorrect code! Try Again!\n");
    }

    void badInput() {
        System.out.println( "\nThis is not a correct input! Please enter a 4 letter code consisting of the letters a, b, c, d, e or f!\n" +
                            "If you want to quit, enter q.\n");
        Sound sound = new Sound();
        sound.badInput();
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
        System.out.println("You have guessed " + x + " " + letter + " correctly!\n");
    }
}