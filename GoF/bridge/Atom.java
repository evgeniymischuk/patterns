package bridge;

public abstract class Atom {
    protected Element element;

    public Atom(Element element) {
        this.element = element;
    }

    abstract void detect();
}
