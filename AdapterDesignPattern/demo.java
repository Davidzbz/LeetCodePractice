package AdapterDesignPattern;

/**
 * Created by baizhongzhang on 2017-02-21.
 */
public class demo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "i like mp3");
        audioPlayer.play("mp4", "i like mp4");
    }
}
