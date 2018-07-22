package factoryMethod;

public class FactoryMethodMain {
    public static void main(String[] args) {
        activateObject("knife");
        activateObject("fork");
    }

    private static void activateObject(String name) {
        CreatorGravityObject creatorGravityObject;
        if ("fork".equalsIgnoreCase(name)) {
            creatorGravityObject = new ForkCreatorGravityObject();
        } else if ("knife".equalsIgnoreCase(name)) {
            creatorGravityObject = new KnifeCreatorGravityObject();
        } else {
            throw new RuntimeException("wtf need object");
        }
        GravityObject gravityObject = creatorGravityObject.createGravityObject();
        gravityObject.activate();
    }
}
