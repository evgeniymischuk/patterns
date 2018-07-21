package state;

public class GravitySun implements GravityAction {
    @Override
    public void modify(ForkState forkState) {
        System.out.println("Sun gravity activated");
    }
}
