/*
Name: Lê Nguyễn Thành Long - ITDSIU21097
Purpose: Represents a sound clip that can be played back. It loads an audio file and provides functionality to play the sound.
*/

package sound;

import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SoundClip {

    private Clip audioClip;
    private AudioInputStream audioStream;

    public SoundClip(String path) {
        try {
            audioStream = AudioSystem.getAudioInputStream(getClass().getResource(path));
            audioClip = AudioSystem.getClip();
            audioClip.open(audioStream);
        }
        catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            e.printStackTrace();
        }

    }

    public void play() {
        new Thread( () -> {
            audioClip.setFramePosition(0);
            audioClip.start();
        }){}.start();
    }
}
