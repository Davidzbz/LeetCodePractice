/**
 * Created by baizhongzhang on 2016-09-22.
 */
public class Zigzag {
    public static void main(String[] args){
        String x = "PAYPALISHIRING";
        //System.out.print("run");
        System.out.print(convert(x,4));
    }
    public static String convert(String s, int numRows){
        String zig = "";
        int j = 0;
        boolean valid = false;
        if(s.length() <= 2 || numRows == 1){
            zig = zig.concat(s);
        }
        else {
            for(int i=0; i<numRows;i++){
                int index = i;
                int index2 = (numRows*2-2)-i*1;
                j = 0;
                while(index < s.length()){
                    String temp = String.valueOf(s.charAt(index));
                    zig = zig.concat(temp);
                    if((i != 0 && i != numRows-1) && (index2 < s.length())){
                        String temp2 = String.valueOf(s.charAt(index2));
                        zig = zig.concat(temp2);
                    }
                    j++;
                    index = i+(numRows*2-2)*j;
                    index2 = index2 + (numRows*2-2);

                }
            }
        }
        return  zig;
    }
}
