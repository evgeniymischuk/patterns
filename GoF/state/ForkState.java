package state;

public class ForkState {
    private GravityAction gravityAction;

    public void setGravityAction(GravityAction gravityAction) {
        this.gravityAction = gravityAction;
    }

    public void modify() {
        gravityAction.modify(this);
    }
}
