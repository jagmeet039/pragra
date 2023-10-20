package Oct17.Media;

public class Main {
    public static void main(String[] args) {
        MediaPlayer audio = new AudioPlayer();
        audio.play();
        audio.pause();
        audio.stop();

        System.out.println();

        MediaPlayer video = new VideoPlayer();
        video.play();
        video.pause();
        video.stop();
    }
}
