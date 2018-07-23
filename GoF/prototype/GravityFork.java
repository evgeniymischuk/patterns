package prototype;

public class GravityFork implements Gravity {
    private int gravity;
    private int weight;

    @Override
    public Object addGravity() {
        GravityFork gravityFork = new GravityFork();

        gravityFork.setGravity(24);
        gravityFork.setWeight(24);

        return gravityFork;
    }

    public int getGravity() {
        return gravity;
    }

    public void setGravity(int gravity) {
        this.gravity = gravity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "\ngravity\t" + getGravity() + "\nweight\t" + getGravity();
    }
}
