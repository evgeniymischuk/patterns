package strategy;

import java.util.ArrayList;
import java.util.List;

public class GravityMain {
    public static void main(String[] args) {
        GravityStrategy gravityStrategy = new GravityStrategy();

        // moon
        gravityStrategy.setGravityAction(new GravityMoon());
        List<Double> items = getItems();
        gravityStrategy.modify(items);
        System.out.println("Moon : " + items);
        // earth
        gravityStrategy.setGravityAction(new GravityEarth());
        items = getItems();
        gravityStrategy.modify(items);
        System.out.println("Earth : " + items);
        // sun
        gravityStrategy.setGravityAction(new GravitySun());
        items = getItems();
        gravityStrategy.modify(items);
        System.out.println("Sun : " + items);

    }

    private static List<Double> getItems() {
        List<Double> items = new ArrayList<>();

        items.add(3.14);
        items.add(11.21);
        items.add(12.25);
        items.add(24.48);

        return items;
    }
}
