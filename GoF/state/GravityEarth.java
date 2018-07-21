package state;

public class GravityEarth implements GravityAction {

    @Override
    public void modify(ForkState forkState) {
        System.out.println("Earth gravity activated");
    }
}
