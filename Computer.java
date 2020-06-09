import org.jetbrains.annotations.NotNull;

import java.util.Random;

class Computer {

    // Methode om vier karakters te kiezen
    public char[] generateCode() {
        // De karakters die in de computer code gebruikt kunnen worden
        String s = "abcdef";
        // Random generator voor de computercode
        Random rand = new Random();

        // String die de gegenereerde String van de computercode bewaard
        StringBuilder computerCodeGenerate = new StringBuilder();

        // Generate vier letter code
        while (computerCodeGenerate.length() < 4) {
            char character = s.charAt(rand.nextInt(s.length()));
            computerCodeGenerate.append(character);
        }

        // Stop deze in array en return het array
        char[] computerCode = computerCodeGenerate.toString().toCharArray();
        System.out.println(computerCode);
        return computerCodeGenerate.toString().toCharArray();
    }
}
