import java.util.*;

/**
 * Created by baizhongzhang on 2017-02-05.
 */
public class IntersectionOf2Arrays {
    public static void main(String[] args) {
        int[] a = new int[]{2,1};
        int[] b = new int[]{1,2};
        System.out.println(Arrays.toString(intersection(a,b)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for (int i : nums1) {
            set1.add(i);
        }

        HashSet<Integer> set2 = new HashSet<Integer>();
        for (int i : nums2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }

        int[] result = new int[set2.size()];
        int i = 0;
        for (int n : set2) {
            result[i++] = n;
        }

        return result;
    }
}
