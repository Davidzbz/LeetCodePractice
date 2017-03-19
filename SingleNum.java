import java.util.HashMap;
import java.util.Map;

/**
 * Created by baizhongzhang on 2016-10-31.
 */
public class SingleNum {
    public static void main(String[] arg){
        int[] x =new int[]{1,2,2,1,3,4,4};
        System.out.print(singleNumber(x));
    }
    public static int singleNumber(int[] nums){
        Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(!counter.containsKey(nums[i])){
                int temp = nums[i];
                counter.put(temp, 1);
            }
            else{
                counter.remove(nums[i]);
            }
        }
        int result =0;
        result = (int)counter.keySet().toArray()[0];
        /*
        for(Integer unique : counter.keySet()){
            result = unique;
        }*/
        return result;
    }
}
