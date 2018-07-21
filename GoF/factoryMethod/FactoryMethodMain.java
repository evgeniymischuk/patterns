package factoryMethod;

import java.util.Random;

public class FactoryMethodMain {
    public static void main(String[] args) {
        CreatorGravityObject creatorGravityObject = getCreatorByRandom();

        GravityObject gravityObject = creatorGravityObject.createGravityObject();
        gravityObject.activate();
    }

    private static CreatorGravityObject getCreatorByRandom() {
        Random random = new Random();
        return random.nextBoolean() ? new ForkCreatorGravityObject() : new KnifeCreatorGravityObject();
    }
}
