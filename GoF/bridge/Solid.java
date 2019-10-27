package bridge;

public class Solid extends Atom {
    public Solid(Element element) {
        super(element);
    }

    @Override
    void detect() {
        element.detect("solid");
    }
}
