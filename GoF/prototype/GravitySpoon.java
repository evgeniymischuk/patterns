package prototype;

public class GravitySpoon implements Gravity {

    @Override
    public Object addGravity() {
        return new GravitySpoon();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " is abstract";
    }
}
