package HashMaps;

import java.util.HashMap;

public class Simple_Hash_Map {
    public static void main(String[] args) {
        //A simple fruits hashMap
        HashMap <String, Double> prices = new HashMap<>();

        prices.put("Apple", 2.0);
        prices.put("Oranges", 1.8);
        prices.put("guava", 1.5);
        prices.put("berry", 2.5);
        prices.put("banana", 1.0);

        System.out.println(prices);

        /*
           Methods to a hashMap
           @size: Counts how many entries are present in a hashmap
           @putIfAbsent: Add a key-value pair if it is not present in the hashMap
           @get: Retrieve a key-value pair from the hashMap
           @getOrDefault: Returns a specified default value if key is not found
           @replace: Update the value of a hashMap
           @replaceAll: Update all the values of a hashmap
           @Remove: Removing items in a hashmap
           @contains: Check if a hashMap has a value
           @containsValue: Check if hashMap has a value
         */

        System.out.println("The size of the hashmap is: "+ prices.size());
        prices.putIfAbsent("guava", 2.0);
        prices.putIfAbsent("mango",3.0);
        System.out.println(prices);

        //get()
        System.out.printf("The price of banana is: %s%n", prices.get("banana"));

        //getOrDefault
        System.out.printf("""
                The default value of Jackfruit is: %s%n""",
                prices.getOrDefault("Jackfruit",0.0));

        //Replace
        prices.replace("berry",3.0);
        System.out.println(prices);

        //remove
        prices.remove("banana");
        System.out.println(prices);

        //contains
        System.out.println("ContainsKey: "+prices.containsKey("banana"));

        //containsValue
        System.out.println("Contains value: "+prices.containsValue(2.0));

        //Perform an operation on all elements
        prices.forEach((fruit,price)-> System.out.println(fruit + " - " + (price - 0.5)));

        //ReplaceAll
        prices.replaceAll((fruit, price) -> price * 2);
        System.out.println("The replaceAll prices are:" + prices);
    }
}
