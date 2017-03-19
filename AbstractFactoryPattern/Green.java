package AbstractFactoryPattern;

/**
 * Created by baizhongzhang on 2017-02-20.
 */
public class Green implements Color {
    @Override
    public void fill(){
        System.out.println("inside green");
    }
}
