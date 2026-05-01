package Array_Lists;

import java.util.ArrayList;

public class simple_array_list {
    public static void main(String[] args) {
        //Define a new arrayList called oddNumbers
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        //Update the values of the arrayList
        //add
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        oddNumbers.add(7);
        oddNumbers.add(9);
        oddNumbers.add(11);
        oddNumbers.add(13);
        oddNumbers.add(15);

        System.out.printf("ArrayList: %s%n", oddNumbers);

        /*
         * Methods of an array list
         * @add: Add values to the arrayList
         * @set: Change/update value of the added values in the arrayList
         * @get: Get the values of the arrayList at the specified index
         * @size: Get the length of the arrayList
         * @remove: Remove an item from the arrayList
         */

        //set value of index 1 to 2
        oddNumbers.set(1,2);
        System.out.printf("The new arrayList is: %s%n", oddNumbers);

        //get index 1 which now has been updated to 2
        System.out.printf("The new value of index 1 is: %d%n", oddNumbers.get(1));

        //Get the size of the arrayList i.e. 8 indices
        System.out.printf("The size of the arrayList is: %d%n", oddNumbers.size());

        //Remove an index
        oddNumbers.remove(7);
        oddNumbers.remove(6);
        System.out.printf("Arraylist after remove is applied: %s%n", oddNumbers);
    }
}