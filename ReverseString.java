import java.util.Arrays;

/**
 * Created by baizhongzhang on 2016-10-30.
 */
public class ReverseString {
    public static void main(String[] arg){
        String x = "Marge let's \"went.\" I await news telegram.";
        System.out.println(reverseString(x));
        System.out.print("\"w\"");

    }
    public static String reverseString(String s) {
        char[] temp = s.toCharArray();

        for(int i=0; i<temp.length; i++){
            System.out.print(temp[i]);
        }
        System.out.println("         ");
        StringBuilder sb = new StringBuilder();
        if (s == null || s.length() == 0) {
            sb.append("");
        }
        else{
            for(int i=temp.length-1; i>=0; i--){
                sb.append(temp[i]);
            }
        }
        String result = sb.toString();
        return result;
    }
}
