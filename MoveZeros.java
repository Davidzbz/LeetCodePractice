/**
 * Created by baizhongzhang on 2017-01-03.
 */
public class MoveZeros {
    public static void main(String[] args){
        int[] x = {1,2,0,0,3,4,0,2,0,4,1,5};
        MoveZeroes(x);
        for(int i=0; i<x.length; i++){
            System.out.print(x[i] + ",");
        }
    }
    public static void MoveZeroes(int[] nums) {
        int temp;
        for(int i= nums.length-1; i>=0; i--){
            if(nums[i] == 0){
                temp = nums[i];
                for(int j=i; j<nums.length-1; j++){
                    nums[j] = nums[j+1];
                }
                nums[nums.length-1] = temp;
            }
        }
    }
}
