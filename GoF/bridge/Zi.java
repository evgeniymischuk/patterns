package bridge;

public class Zi implements Element {

    @Override
    public void detect(String type) {
        System.out.println("Zi detect as " + type);
    }
}
