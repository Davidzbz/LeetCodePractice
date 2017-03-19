/**
 * Created by baizhongzhang on 2017-01-01.
 */
public class HammingDistance {

    public static void main(String[] args) {
        int x = 0;
        int y = 4;
        System.out.println(hammingDistance2(x,y));
    }
    public static int hammingDistance2(int x, int y) {
        int xor = x^y;
        int counter = 0;
        while(xor != 0){
            counter = counter + (xor&1);
            xor >>= 1;
        }
        return counter;
    }
    public static int hammingDistance(int x, int y) {
        String xs = Integer.toBinaryString(x);
        String ys = Integer.toBinaryString(y);
        int counter = 0;
        if(xs.length() > ys.length()){
            int gap = xs.length() - ys.length();
            for(int i=0; i<gap; i++){
                String zero = "0";
                ys = zero.concat(ys);
            }

        }
        else if(xs.length() < ys.length()){
            int gap = ys.length() - xs.length();
            for(int i=0; i<gap; i++){
                String zero = "0";
                xs = zero.concat(xs);
            }
        }
        for(int i=0; i< ys.length(); i++){
            String temp1 = String.valueOf(xs.charAt(i));
            String temp2 = String.valueOf(ys.charAt(i));
            if(!temp1.equalsIgnoreCase(temp2)){
                counter++;
            }
        }
        return counter;
    }
}
