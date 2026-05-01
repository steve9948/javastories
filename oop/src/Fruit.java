public class Fruit extends Item {
     String type;


    public Fruit(String name, int quantity, String type ){
        super(name, quantity);
        this.type = type;
    }
    @Override
    public String toString(){
        return "Fruit: " + getName() + ", Quantity: " + getQuantity() +
                ", Type" + type;
    }
}
