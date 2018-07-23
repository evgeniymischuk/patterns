package flyweight;

public class Spoon implements GravityObject {
    private static final int height = 40;
    private static final int weight = 4;

    @Override
    public void activate() {
        System.out.println(String.format("Spoon %dx%d fly", height, weight));
    }
}
