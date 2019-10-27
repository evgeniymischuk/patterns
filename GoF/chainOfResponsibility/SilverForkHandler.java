package chainOfResponsibility;

import facade.Fork;

public class SilverForkHandler extends SilverHandler {
    public SilverForkHandler(SilverHandler silverHandler) {
        super(silverHandler);
    }

    @Override
    void silverPlated(Object o) {
        if (o instanceof Fork) {
            System.out.println("fork magic work");
        }
        silverHandler.silverPlated(o);
    }
}
