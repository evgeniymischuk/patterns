package prototype;

public class PrototypeMain {
    public static void main(String[] args) {
        Gravity gravityFork = new GravityFork();
        Gravity gravityKnife = new GravityKnife();
        Gravity gravitySpoon = new GravitySpoon();

        gravityFork = (Gravity) gravityFork.addGravity();
        gravityKnife = (Gravity) gravityKnife.addGravity();
        gravitySpoon = (Gravity) gravitySpoon.addGravity();

        System.out.println(gravityFork);
        System.out.println(gravityKnife);
        System.out.println(gravitySpoon);
    }
}
