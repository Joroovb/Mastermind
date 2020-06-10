import java.util.Random;

class Computer {

    // Methode om vier karakters te kiezen
    public char[] generateCode() {
        // De karakters die in de computer code gebruikt kunnen worden
        final String s = "abcdef";
        // Random generator voor de computercode
        Random rand = new Random();

        // String die de gegenereerde String van de computercode bewaard
        String computerCodeGenerate = "";

        // Generate vier letter code
        StringBuilder sb = new StringBuilder();
        while (computerCodeGenerate.length() < 4) {
            sb.append(s.charAt(rand.nextInt(s.length())));
            computerCodeGenerate = sb.toString();
        }

        // Stop deze in array en return het array
        char[] computerCode = computerCodeGenerate.toCharArray();
        return computerCodeGenerate.toCharArray();
    }
}
