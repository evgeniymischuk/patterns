package templateMethod;

public class ForkStation extends GravityStation{

    @Override
    void injectObject() {
        System.out.println("fork");
    }

    @Override
    void newFeatures() {
        System.out.println("fork now run from station");
    }
}
