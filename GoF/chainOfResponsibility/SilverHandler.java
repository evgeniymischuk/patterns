package chainOfResponsibility;

public abstract class SilverHandler {
    protected SilverHandler silverHandler;

    public SilverHandler(SilverHandler silverHandler) {
        this.silverHandler = silverHandler;
    }

    abstract void silverPlated(Object o);
}
