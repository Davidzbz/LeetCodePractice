import java.util.Scanner;

/**
 * Created by baizhongzhang on 2016-10-02.
 */
public class RansomAndNote {
    public static void main(String[] args) {
        String note = "give me one grand today night";
        String ranson = "give one grand today";

        Ransom s = new Ransom(note, ranson);

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}
