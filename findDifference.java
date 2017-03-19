import java.util.HashMap;

/**
 * Created by baizhongzhang on 2017-01-01.
 */
public class findDifference {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'c';

        System.out.println(b^a);
    }
    public static char findTheDifference(String s, String t) {
        char ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            ans ^= t.charAt(i);
        }
        return ans;
    }
}
