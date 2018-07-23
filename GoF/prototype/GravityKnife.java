package prototype;

public class GravityKnife implements Gravity {
    private int gravity;
    private int weight;
    private int depth;

    @Override
    public Object addGravity() {
        GravityKnife gravityFork = new GravityKnife();

        gravityFork.setGravity(24);
        gravityFork.setWeight(24);
        gravityFork.setDepth(4);

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

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "\ngravity\t" + getGravity() + "\nweight\t" + getGravity() + "\ndepth\t" + getDepth();
    }
}
