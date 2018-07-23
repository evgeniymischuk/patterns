package flyweight;

public class Knife implements GravityObject {
    private static final int height = 40;
    private static final int weight = 4;
    private static final int depth = 4;

    @Override
    public void activate() {
        System.out.println(String.format("Knife %dx%dx%d attack spoon", height, weight, depth));
    }
}
