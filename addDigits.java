/**
 * Created by baizhongzhang on 2017-01-03.
 */
public class addDigits {

    public int addDigits(int num) {
        int result = num - 9*((num-1)/9);
        return result;
    }
}
