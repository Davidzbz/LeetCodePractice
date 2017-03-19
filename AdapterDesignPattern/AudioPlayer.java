package AdapterDesignPattern;

/**
 * Created by baizhongzhang on 2017-02-21.
 */
public class AudioPlayer implements MediaPlayer {
    MediaPlayer mediaPlayer;

    @Override
    public void play(String audioType, String filename){
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("play mp3 "+filename);
        }

        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType, filename);
        }
    }
}
