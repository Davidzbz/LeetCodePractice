/**
 * Created by baizhongzhang on 2016-09-24.
 */
public class ReverseInteger {
    public static void main(String[] args){
        int x = -999;
        System.out.print(reverse(x));
    }
    public static int reverse(int n){
        int result = 0;
        if(n > -10 && n < 10){
            result = n;
        }
        else if(n>999999999 || n<=-2147483648){
            result = 0;
        }
        else{
            while(n >= 10|| n<=-10){
                int temp = n % 10;
                if(result == 0){
                    result = temp;
                }
                else {
                    result = result*10 + temp;
                }
                n = n/10;
            }
            result = result*10 + n;
        }
        return result;
    }

}
