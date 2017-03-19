package AbstractFactoryPattern;

/**
 * Created by baizhongzhang on 2017-02-20.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("inside square");
    }
}
