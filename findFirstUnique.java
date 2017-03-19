import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by baizhongzhang on 2017-02-17.
 */
public class findFirstUnique {
    public static void main(String[] arg){
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        int index = -1;
        Map<String, Integer> counter = new LinkedHashMap<>();
        if(s.length() == 1){
            index = 0;
        }
        for(int i=0; i<s.length(); i++){
            String temp = String.valueOf(s.charAt(i));
            if(counter.containsKey(temp)){
                Integer num = counter.get(temp);
                num++;
                counter.put(temp,num);
            } else {
                counter.put(temp,1);
            }
        }
        for (Map.Entry<String, Integer> entry : counter.entrySet()) {
            if(entry.getValue() == 1){
                index = s.indexOf(entry.getKey());
                break;
            }
        }
        return index;
    }
}
