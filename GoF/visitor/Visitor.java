package visitor;

public interface Visitor {
    void visit(Knife knife);

    void visit(Fork fork);

    void visit(Spoon spoon);
}
