/**
 * Created by baizhongzhang on 2016-10-04.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] x = new int[]{6,4,9,2,8,5,1,3,7};

        for(int i=0; i<x.length-1; i++){
            int edge = x[i];
            int iMin = i;
            for(int j=i+1; j<x.length; j++){
                if(x[j] < edge){
                    edge = x[j];
                    iMin = j;
                }
            }
            if(i != iMin){
                int temp = x[i];
                x[i] = x[iMin];
                x[iMin] = temp;
            }
        }

        for(int i=0; i<x.length; i++){
            System.out.print(x[i]);
        }
    }
}
