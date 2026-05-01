package Array_Lists;

import java.util.ArrayList;

public class conditionalsUse {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        //Use a conditional to update values to an arrayList
        for (int i = 0; i <= 10; i++){
            numbers.add(i);
        }
        System.out.println(numbers);

        //use remove in a conditional lambda
        numbers.removeIf(number -> number % 2 == 1);
        System.out.printf("The even numbers are: %s%n", numbers);
    }
}
