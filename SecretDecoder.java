import java.util.HashMap;
import java.util.Map;


/**
 * Created by baizhongzhang on 2016-09-29.
 */
public class SecretDecoder {
    public static void main(String[] arg){
        String a = "Z-A G-B K-C B-D R-E L-F A-G U-H T-I E-J J-K V-L H-M Q-N S-O M-P W-Q N-R I-S C-T Y-U P-V F-W D-X X-Y O-Z";
        String message = "Z vtarn... tc'i mnrccx hyku hx lzpsntcr zqthzv. Tc'i vtjr z vtsq zqb z ctarn htdrb - gnrb lsn tci ijtvvi tq hzatk.";
        String x = result(a,message);
        System.out.print(x);
    }
    public static String result(String code, String message){
        Map<String, String> coder = new HashMap<String, String>();
        String x = "";
        for(int i=0; i<code.length(); i++){
            String dash = String.valueOf(code.charAt(i));
            if(dash.equalsIgnoreCase("-")){
                String key1 = String.valueOf(code.charAt(i-1));
                String value1 = String.valueOf(code.charAt(i+1));
                if(!coder.containsKey(key1)){
                    coder.put(key1, value1);
                }
            }
        }
        for(int i=0; i<message.length(); i++){

            if(Character.isLetter(message.charAt(i))){
                if(Character.isUpperCase(message.charAt(i))){
                    String ele = String.valueOf(message.charAt(i));
                    String value = coder.get(ele.toUpperCase());
                    x = x.concat(value);
                }
                else {
                    String ele = String.valueOf(message.charAt(i));
                    String value = coder.get(ele.toUpperCase());
                    x = x.concat(value.toLowerCase());
                }


            }
            else {
                String ele = String.valueOf(message.charAt(i));
                x = x.concat(ele);
            }
        }
        return x;
    }
}

