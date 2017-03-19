package AbstractFactoryPattern;

/**
 * Created by baizhongzhang on 2017-02-21.
 */
public class demo {
    public static void main(String[] args) {
        AbstractFactory shapefactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = shapefactory.getShape("CIRCLE");
        shape1.draw();

        AbstractFactory colorfactory = FactoryProducer.getFactory("COLOR");
        Color color1 = colorfactory.getColor("RED");
        color1.fill();
    }
}
