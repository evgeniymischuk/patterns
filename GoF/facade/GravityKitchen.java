package facade;

public class GravityKitchen {
    private Table table = new Table();
    private Spoon spoon = new Spoon();
    private Knife knife = new Knife();
    private Fork fork = new Fork();


    public void arrangeKitchenItems() {
        spoon.gravityEngine();
        fork.gravityEngine();
        knife.gravityEngine();

        table.addKitchenItemToTable(spoon);
        table.addKitchenItemToTable(fork);
        table.addKitchenItemToTable(knife);

        System.out.println(String.format("go eating, %s items on table", table.getGravityKitchenItems().size()));
    }
}
