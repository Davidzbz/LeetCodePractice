/**
 * Created by baizhongzhang on 2016-10-04.
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] x = new int[]{6,4,9,2,8,5,1,3,7};

        for(int i= 1; i<x.length; i++){
            int current = x[i];
            int index = i;
            while(index>0 && x[index-1] > current){
                x[index] = x[index -1];
                index--;
            }
            x[index] = current;
        }
        for(int i=0; i<x.length; i++){
            System.out.print(x[i]);
        }
    }
}
