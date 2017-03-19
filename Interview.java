/**
 * Created by baizhongzhang on 2016-10-22.
 */
public class Interview {

    public static void main(String[] args){
        System.out.print(times(2));
    }

    public static int times(int n){
        if(n == 4){
            return n=2;
        }
        else {
            return 2*times(n+1);
        }
    }
}
