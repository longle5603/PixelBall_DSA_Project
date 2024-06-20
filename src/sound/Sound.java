package sound;

public class Sound {
    private SoundClip move;
    private SoundClip point;
    private SoundClip finish;
    private SoundClip level;
    private SoundClip pause;

    public Sound() {
        move = new SoundClip("/assets/sound/move.wav");
        point = new SoundClip("/assets/sound/point.wav");
        finish = new SoundClip("/assets/sound/lose_sound.wav");
        level = new SoundClip("/assets/sound/level.wav");
        pause = new SoundClip("/assets/sound/pause.wav");
    }

    public void moveSound() {
        move.play();
    }

    public void pointSound() {
        point.play();
    }

    public void finishSound() {
        finish.play();
    }

    public void levelSound() {
        level.play();
    }

    public void pauseSound() {
        pause.play();
    }
}
