package bridge;

public class Gaseous extends Atom {

    public Gaseous(Element element) {
        super(element);
    }

    @Override
    void detect() {
        element.detect("gaseous");
    }
}
