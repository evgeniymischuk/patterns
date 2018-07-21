package factoryMethod;

public class ForkGravity implements GravityObject {
    @Override
    public void activate() {
        System.out.println("Fork activated, go eating gravity");
    }
}
