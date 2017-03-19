package AbstractFactoryPattern;

/**
 * Created by baizhongzhang on 2017-02-20.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
