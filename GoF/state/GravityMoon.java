package state;

public class GravityMoon implements GravityAction {
    @Override
    public void modify(ForkState forkState) {
        System.out.println("Moon gravity activated");
    }
}
