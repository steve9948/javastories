public class Item {
    final String name;
    final int quantity;

    //Call a constructor
    public Item(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    @Override
    public String toString(){
        return "Item: " + name + "Quantity: " + quantity;
    }
}
