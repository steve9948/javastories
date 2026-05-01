package Arrays;

import java.util.Arrays;

public class fill {
    public static void main(String[] args) {

        //Making a copy pf the array
        int[] oddNumbers = {1, 3, 5, 7, 9, 11, 13, 15};
        int[] copyOfOddNumbers = oddNumbers;
        int[] oddNumbers2 = {1, 3, 5, 7, 9, 11, 13, 15};

        //Compare the arrays(with the same data)
        // == compares the reference of the two arrays even though the data is the same
        System.out.println(oddNumbers == oddNumbers2);//Prints false as memory reference is different

        //To properly compare two arrays use the Arrays.equals()
        System.out.println(Arrays.equals(oddNumbers, oddNumbers2));//true

        //Let's use the Arrays.copyOf()
        // Use the .length to copy the entire array
        int[] newCopyOfOddNumbers = Arrays.copyOf(oddNumbers, oddNumbers.length);
        System.out.println("The new copy of the array is : " + Arrays.toString(newCopyOfOddNumbers));

        //The .length gives a thought of copying from a given offset
        int startIndex = 2;
        int endIndex = 7;
        int[] copyOfOddNumbers3 =  Arrays.copyOfRange(oddNumbers,startIndex, endIndex);
        System.out.println("The new given index range is" + Arrays.toString(copyOfOddNumbers3));

        //Fill an array offset replacing all the values with a given new value
        Arrays.fill(oddNumbers, 0);
        System.out.println("The copy of the array is: " + Arrays.toString(copyOfOddNumbers));


    }
}
