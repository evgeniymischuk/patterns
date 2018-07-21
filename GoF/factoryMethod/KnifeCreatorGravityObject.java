package factoryMethod;

public class KnifeCreatorGravityObject implements CreatorGravityObject {
    @Override
    public GravityObject createGravityObject() {
        return new KnifeGravity();
    }
}
