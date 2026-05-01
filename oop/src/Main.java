//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Item item1 = new Item("Unsorted", 10);
        Fruit fruit = new Fruit("Apple",20, "Fuji");
        Weapon weapon = new Weapon("Sword", 20, 5,    "Melee");

        inventory.addItem(item1);
        inventory.addItem(fruit);
        inventory.addItem(weapon);

        inventory.displayInventory();



//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
    }
}