package facade;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<GravityKitchenItem> gravityKitchenItems;

    Table() {
        gravityKitchenItems = new ArrayList<>();
    }

    void addKitchenItemToTable(GravityKitchenItem gravityKitchenItem) {
        gravityKitchenItems.add(gravityKitchenItem);
    }

    public List<GravityKitchenItem> getGravityKitchenItems() {
        return gravityKitchenItems;
    }
}