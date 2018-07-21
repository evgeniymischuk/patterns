package strategy;

import java.util.List;

public class GravitySun implements GravityAction {
    @Override
    public void modify(List<Double> items) {
        for (int i = 0; i < items.size(); i++) {
            items.set(i, items.get(i) * 24.4 * 3.14 * 2.71 / 11.341_344_333);
        }
    }
}
