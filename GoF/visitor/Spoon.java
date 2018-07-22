package visitor;

public class Spoon implements GravityObject {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
