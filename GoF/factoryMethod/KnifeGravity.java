package factoryMethod;

public class KnifeGravity implements GravityObject {
    @Override
    public void activate() {
        System.out.println("Knife activated, go eating gravity");
    }
}
