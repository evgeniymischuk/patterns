package strategy;

import java.util.List;

public class GravityStrategy {
    private GravityAction gravityAction;

    public void setGravityAction(GravityAction gravityAction) {
        this.gravityAction = gravityAction;
    }

    public void modify(List<Double> items) {
        if (items != null) {
            gravityAction.modify(items);
        }
    }
}
