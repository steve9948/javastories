package Array_Lists;

import java.util.ArrayList;

public class cloneAndCompare {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 10; i++){
            numbers.add(i);
        }
        System.out.println(numbers);

        //Cloning an arrayList
        ArrayList<Integer> clonedNumbers = (ArrayList<Integer>)numbers.clone();
        System.out.println(clonedNumbers);
        //use equals() t check if the two arrayLists are equal
        System.out.println(clonedNumbers.equals(numbers));
    }
}
