package facade;

public interface GravityKitchenItem {
    default void gravityEngine() {
        System.out.println(this.getClass().getSimpleName() + " run gravity engine");
    }
}
