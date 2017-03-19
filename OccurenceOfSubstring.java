/**
 * Created by baizhongzhang on 2017-02-21.
 */
public class OccurenceOfSubstring {
    public static void main(String[] args){
        String s = "aaaaaaaaaaaa";
        //System.out.println(s.indexOf("abc", 0));
        System.out.println(substring("aaa", s));

    }

    public static int substring(String sub, String str){
        int i = 0;
        int index = 0;
        while(i<str.length()){
            if(str.indexOf(sub, i)!=-1){
                index++;
                i=str.indexOf(sub, i)+1;
            }
            else{
                break;
            }
        }
        return index;
    }
}
