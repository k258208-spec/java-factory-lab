public class ShapeFactory {

    public Shape create(ShapeType type) {
        try {
            return type.getClazz()
                       .getDeclaredConstructor()
                       .newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Cannot create shape: " + type, e);
        }
    }
}
