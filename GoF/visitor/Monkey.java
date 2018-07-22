package visitor;

public class Monkey implements Visitor {
    @Override
    public void visit(Knife knife) {
        System.out.println("monkey wounded himself");
    }

    @Override
    public void visit(Fork fork) {
        System.out.println("monkey wounded himself");
    }

    @Override
    public void visit(Spoon spoon) {
        System.out.println("monkey knock and kill himself");
    }
}
