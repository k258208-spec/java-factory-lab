public class FactoryPatternDemo {
    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape s1 = factory.create(ShapeType.CIRCLE);
        s1.draw();

        Shape s2 = factory.create(ShapeType.SQUARE);
        s2.draw();

        Shape s3 = factory.create(ShapeType.TRIANGLE);
        s3.draw();
    }
}
