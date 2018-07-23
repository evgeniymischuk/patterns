package flyweight;

public class FlyweightMain {
    public static void main(String[] args) {
        GravityObjectContainer container = new GravityObjectContainer();

        for (int i = 0; i < 24; i++) {
            container.activateGravityObjectByName("fork");
            container.activateGravityObjectByName("knife");
            container.activateGravityObjectByName("spoon");
            container.activateGravityObjectByName(null);
        }

        container.printState();
    }
}
