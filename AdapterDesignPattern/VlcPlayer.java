package AdapterDesignPattern;

/**
 * Created by baizhongzhang on 2017-02-21.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename){
        System.out.println("play vlc" + filename);
    }

    @Override
    public void playMp4(String filename) {
    }
}
