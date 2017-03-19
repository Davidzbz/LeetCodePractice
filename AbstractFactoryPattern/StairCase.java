package AbstractFactoryPattern;

/**
 * Created by baizhongzhang on 2017-03-04.
 */
public class StairCase {
    public static void main(String[] args) {
        System.out.println(Solution1(7));
    }
    public static int Solution1(int stairs){
        int[] dp = new int[stairs];
        if(stairs<1){
            return 0;
        }
        dp[0] = 1;//1
        dp[1] = 2;//2
        dp[2] = 4;//3
        for (int i=3; i<stairs; i++ ){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[stairs-1];
    }
}
