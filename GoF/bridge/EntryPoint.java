package bridge;

public class EntryPoint {
    public static void main(String[] args) {
        Atom atom = new Gaseous(new O2());
        atom.detect();
        atom = new Solid(new Zi());
        atom.detect();
    }
}
