package factoryMethod;

public class ForkCreatorGravityObject implements CreatorGravityObject {
    @Override
    public GravityObject createGravityObject() {
        return new ForkGravity();
    }
}
