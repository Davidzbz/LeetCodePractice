import java.util.Arrays;

/**
 * Created by baizhongzhang on 2017-01-03.
 */
public class MinMoves {
    public static void main(String[] args){
        int[]x = {1,2,3};
        System.out.println(minMoves(x));
    }
    public static int minMoves(int[] nums) {
        int counter = 0;
        int min = Integer.MAX_VALUE;
        for(int x : nums){
            min = Math.min(x, min);
            counter+= x;
        }
        return counter - nums.length * min;
    }
}
