package templateMethod;

public class KnifeStation extends GravityStation {
    @Override
    void injectObject() {
        System.out.println("knife");
    }

    @Override
    void newFeatures() {
        System.out.println("knife kill all personal");
    }
}
