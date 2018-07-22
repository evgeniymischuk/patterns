package visitor;

public class VisitorMain {
    public static void main(String[] args) {
        GravityObject knife = new Knife();
        GravityObject fork = new Fork();
        GravityObject spoon = new Spoon();
        //human
        knife.accept(new Human());
        fork.accept(new Human());
        spoon.accept(new Human());
        //monkey
        knife.accept(new Monkey());
        fork.accept(new Monkey());
        spoon.accept(new Monkey());
    }
}
