import java.util.Arrays;

class Brains {
    // Global notifier
    Notificaties notify = new Notificaties();

    public boolean isInputValid (char[] y) {
        final String s = "abcdef";

        if (y.length != 4) {
            return false;
        }
        for (char c : y) {
            if (s.indexOf(c) == -1) {
                return false;
            }
        }
        for (char c : y) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean playerGewonnen(char[] x, char[] y) {
        // x = computer, y = speler
        // Check of de speler gewonnen heeft
        return Arrays.equals(x, y);
    }

    public int correctLetters(char[] x, char[] y) {
        // x = computer, y = speler
        // reset het aantal correct geraden letters naar 0
        int charInCode = 0;
        //check of de speler letters heeft geraden die in de computercode staan
        for (char c : x) {
            if (Arrays.toString(y).indexOf(c) != -1) {
                ++charInCode;
            }
        }
        notify.charInCode(charInCode);
        return charInCode;
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
}