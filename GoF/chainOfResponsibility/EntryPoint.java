package chainOfResponsibility;

import facade.Fork;

public class EntryPoint {

    public static void main(String[] args) {
        SilverHandler silverHandler = new SilverForkHandler(
                new SilverKnifeHandler(
                        new SilverProducerHandler(null)
                )
        );

        silverHandler.silverPlated(new Fork());
    }
}
