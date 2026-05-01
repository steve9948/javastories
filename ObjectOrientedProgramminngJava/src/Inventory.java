import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();

    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("Override method");
    }

    //display items by their type

    public void displayItems(String type) {
        for (Item item : items) {
            if (item instanceof Fruit && ((Fruit) item).getType().equalsIgnoreCase(type)) {
                item.displayItems();
            } else if (item instanceof Weapon && ((Weapon) item).getType().equalsIgnoreCase(type)) {
                item.displayItems();
            }
        }
    }
}
