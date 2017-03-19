/**
 * Created by baizhongzhang on 2016-10-04.
 */
public class BubbleSort {
    public static void main(String[] args) {
       int[] x = new int[]{6,4,2,5,1,3};

       for(int i=0; i<x.length; i++){
           for(int j=0; j<x.length-1;j++){
               if(x[j] > x[j+1]){
                   int temp = x[j];
                   x[j] = x[j+1];
                   x[j+1] = temp;
               }
           }
       }

       for(int i=0; i<x.length; i++){
           System.out.print(x[i]);
       }
    }
}
