package visitor;

public class Knife implements GravityObject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
