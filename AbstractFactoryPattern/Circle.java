package AbstractFactoryPattern;

/**
 * Created by baizhongzhang on 2017-02-20.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("inside circle");
    }
}
