import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

// Code by Rinse Willet at https://github.com/RinseWillet/Stringfuncties

public class Sound {

     void lost() {
        File bad = new File("lost.wav");
        PlaySound(bad);
    }

    void badInput() {
         File input = new File("bad.wav");
         PlaySound(input);
    }

    void won() {
        File good = new File("won.wav");
        PlaySound(good);
    }

    static void PlaySound(File Sound) {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();

            Thread.sleep(clip.getMicrosecondLength()/1000);

        } catch (Exception e) {
            System.out.println("Audio not available!");
        }
    }
}