package strategy;

import java.util.List;

public class GravityEarth implements GravityAction {
    @Override
    public void modify(List<Double> items) {
        for (int i = 0; i < items.size(); i++) {
            items.set(i, items.get(i) / 9.8);
        }
    }
}
