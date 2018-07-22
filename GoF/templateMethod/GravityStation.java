package templateMethod;

abstract class GravityStation {
    void templateMethod() {
        System.out.println("start station");
        System.out.println("injecting object:");
        injectObject();
        System.out.println("mutation");
        System.out.println("object mutation over");
        newFeatures();
    }

    abstract void injectObject();

    abstract void newFeatures();
}
