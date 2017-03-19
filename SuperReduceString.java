import java.util.Iterator;
import java.util.Stack;

/**
 * Created by baizhongzhang on 2017-03-04.
 */
public class SuperReduceString {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String input = "aacccscs";
        Stack<String> s = new Stack<String>();
        for(int i=0; i<input.length(); i++){
            String singleCharacter =  String.valueOf(input.charAt(i));
            if(!s.isEmpty() && singleCharacter.equalsIgnoreCase(s.peek()) ){
                s.pop();
            }
            else{
                s.push(singleCharacter);
            }
        }
        Iterator<String> iter = s.iterator();
        String result = "";
        while (iter.hasNext()){
            result = result.concat(iter.next());
        }
        System.out.print(result);
    }
}
