package bridge;

public class O2 implements Element {
    @Override
    public void detect(String type) {
        System.out.println("O2 detect as " + type);
    }
}
