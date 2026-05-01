package Array_Lists;

import java.util.ArrayList;
import java.util.Comparator;

public class sort {
    public static void main(String[] args) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        //Add elements to the arraylist without following the natural number ordering

        oddNumbers.add(0);
        oddNumbers.add(3);
        oddNumbers.add(1);
        oddNumbers.add(7);
        oddNumbers.add(5);
        oddNumbers.add(11);
        oddNumbers.add(9);

        System.out.println(oddNumbers);

        //Sorting an arrayList with the natural order
        oddNumbers.sort(Comparator.naturalOrder());
        System.out.println(oddNumbers);

        //Sorting the arrayList with the reverse naturalOrder

        oddNumbers.sort(Comparator.reverseOrder());
        System.out.println(oddNumbers);

    }
}
