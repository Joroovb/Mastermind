import java.util.Arrays;

class Brains {
    // Global notifier
    Notificaties notify = new Notificaties();

    public boolean playerGewonnen(char[] x, char[] y) {
        // x = computer, y = speler
        // Check of de speler gewonnen heeft
        return Arrays.equals(x, y);
    }

    public int correctPositions(char[] x, char[] y) {
        // x = computer, y = speler
        // Reset het aantal correcte posities naar 0 voordat de for loop begint
        int correctPosition = 0;
        // Check of de speler letters op een correcte plek heeft
        for (int i = 0; i < y.length; i++) {
            if (y[i] == x[i]) {
                ++correctPosition;
            }
        }
        notify.correctPosition(correctPosition);
        return correctPosition;
    }

    public int correctLetters(char[] x, char[] y) {
        // x = computer, y = speler
        // reset het aantal correct geraden letters naar 0
        int charInCode = 0;
        //check of de speler letters heeft geraden die in de computercode staan
        for (char c : y) {
            if (Arrays.toString(x).indexOf(c) != -1) {
                ++charInCode;
            }
        }
        notify.charInCode(charInCode);
        return charInCode;
    }
}