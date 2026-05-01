package Array_Lists;

import java.util.ArrayList;

public class Remove_Add_Multiple {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);

        evenNumbers.forEach(number ->{
            number = number * 2;
            System.out.printf("%d \n",number);
                });
        //System.out.println(evenNumbers);

        ArrayList<Integer> moreEvenNumbers = new ArrayList<>();
        moreEvenNumbers.add(8);
        moreEvenNumbers.add(10);
        moreEvenNumbers.add(12);

        //Combine the arrayList using addAll()
        evenNumbers.addAll(moreEvenNumbers);
        System.out.println(evenNumbers);


        //use removeAll()
        evenNumbers.removeAll(moreEvenNumbers);
        System.out.println(evenNumbers);

        //Use contains() to check if the arrayList has an element
        System.out.printf("ArrayList contains? %s%n", evenNumbers.contains(4));

        //Let's clear all
        evenNumbers.clear();
        //Prints an empty list
        System.out.println(evenNumbers);

        //Check if arrayList is empty
        System.out.printf("Is arrayList empty? %s%n", evenNumbers.isEmpty());

    }
}
