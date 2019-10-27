package chainOfResponsibility;

import facade.Knife;

public class SilverKnifeHandler extends SilverHandler {
    public SilverKnifeHandler(SilverHandler silverHandler) {
        super(silverHandler);
    }

    @Override
    void silverPlated(Object o) {
        if (o instanceof Knife) {
            System.out.println("knife magic work");
        }
        silverHandler.silverPlated(o);
    }
}
