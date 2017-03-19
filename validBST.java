import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Stack;

/**
 * Created by baizhongzhang on 2017-03-03.
 */
public class validBST {
    public static void main(String[] args) {

    }

    public static boolean isValidBST(int[] treeArray) {
        Stack<Integer> stack = new Stack<>();
        int root = 0;
        for (int i=0; i<treeArray.length; i++) {
            if(treeArray[i] < root) {
                return false;
            }
            while(!stack.isEmpty() && stack.peek() < treeArray[i]){
                root = stack.peek();
                stack.pop();
            }
            stack.push(treeArray[i]);
        }
        return true;
    }
}
