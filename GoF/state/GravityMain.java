package state;

public class GravityMain {
    public static void main(String[] args) {
        ForkState forkState = new ForkState();

        // moon
        forkState.setGravityAction(new GravityMoon());
        forkState.modify();
        // earth
        forkState.setGravityAction(new GravityEarth());
        forkState.modify();
        // sun
        forkState.setGravityAction(new GravitySun());
        forkState.modify();

    }
}
