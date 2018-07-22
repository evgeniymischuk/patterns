package visitor;

public class Human implements Visitor {
    @Override
    public void visit(Knife knife) {
        System.out.println("human go cut fish");
    }

    @Override
    public void visit(Fork fork) {
        System.out.println("human go eat fish");
    }

    @Override
    public void visit(Spoon spoon) {
        System.out.println("human go eat soup with fish");
    }
}
