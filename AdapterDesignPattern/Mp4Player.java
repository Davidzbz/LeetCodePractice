package AdapterDesignPattern;

/**
 * Created by baizhongzhang on 2017-02-21.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String filename){

    }
    @Override
    public void playMp4(String filename){
        System.out.println("play mp4 "+ filename);
    }
}
