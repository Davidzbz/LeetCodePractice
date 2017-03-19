/**
 * Created by baizhongzhang on 2016-09-27.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int numberNeeded(String first, String second) {


        Map<String, Integer> one  = new HashMap<String, Integer>();
        Map<String, Integer> two = new HashMap<>();
        for(int i=0; i<first.length(); i++){
            String temp = String.valueOf(first.charAt(i));
            if(!one.containsKey(temp)){
                one.put(temp, 1);
            }
            else{
                int count = one.get(temp);
                count = count +1;
                one.put(temp, count );
            }
        }
        for(int i=0; i<second.length(); i++){
            String temp = String.valueOf(second.charAt(i));
            if(!two.containsKey(temp)){
                two.put(temp, 1);
            }
            else{
                int count = two.get(temp);
                count = count +1;
                two.put(temp, count );
            }
        }

        int delete = 0;
            for(Map.Entry<String, Integer> entry : two.entrySet()){
                if(one.containsKey(entry.getKey())){
                    int value1 = one.get(entry.getKey());
                    int value2 = entry.getValue();
                    if(value1 != value2){
                        if(value1 > value2){
                            delete = delete + value1-value2;
                        }
                        else {
                            delete = delete + value2 - value1;
                        }
                    }
                    one.put(entry.getKey(), 0);
                }
                else{
                    int value2 = entry.getValue();
                    delete = delete + value2;
                }

            }
            for(Map.Entry<String, Integer> entry : one.entrySet()){
                int value = entry.getValue();
                delete = delete + value;
            }


        return delete;
    }

    public static void main(String[] args) {
        String a = "abcdeff";
        String b = "abcssssh";
        System.out.println(numberNeeded(a, b));
    }

}
