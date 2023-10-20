package Oct17.Media;

public class AudioPlayer extends MediaPlayer{
    @Override
    public void play() {
        System.out.println("Audio is playing.");
    }

    @Override
    public void pause() {
        System.out.println("Audio is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Audio playback is stopped.");
    }
}
