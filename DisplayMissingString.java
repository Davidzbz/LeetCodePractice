import java.util.*;

/**
 * Created by baizhongzhang on 2017-03-04.
 */
public class DisplayMissingString {
    public static void main(String[] args) {
        String s = "how are you doing today";
        String t = "are you today";
        System.out.println(display(s,t));
    }

    public static String display(String whole, String part){
        String[] s = whole.split(" ");
        Set<String> counter = new HashSet<>(Arrays.asList(s));
        String[] t = part.split(" ");
        ArrayList<String> collectiong = new ArrayList<>();
        for(String eachWord : t){
            if(!counter.contains(eachWord)){
                collectiong.add(eachWord);
            }
        }
        String result = "";
        for(String each : collectiong){
            result = result.concat(each + " ");
        }
        return result;
    }
}
