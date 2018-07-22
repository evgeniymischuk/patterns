package visitor;

public class Fork implements GravityObject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
