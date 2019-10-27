package chainOfResponsibility;

public class SilverProducerHandler extends SilverHandler {
    public SilverProducerHandler(SilverHandler silverHandler) {
        super(silverHandler);
    }

    @Override
    void silverPlated(Object o) {
        System.out.println("produced " + o.getClass().getSimpleName());
    }
}
