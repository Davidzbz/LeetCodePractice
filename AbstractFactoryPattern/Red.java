package AbstractFactoryPattern;

/**
 * Created by baizhongzhang on 2017-02-20.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("inside red");
    }
}
