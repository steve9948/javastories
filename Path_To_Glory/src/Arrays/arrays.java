package Arrays;

import java.util.Arrays;

public class arrays {
    //Arrays store data of the same type in contiguous memory location
    public static void main(String[] args) {
        //declare a character array vowels
        char[] vowels = {'e', 'u', 'o', 'i', 'a'};
        System.out.println("This are the vowels"+ Arrays.toString(vowels));

        int startIndex = 2;
        int endIndex = 4;

        //Binary search the array
        Arrays.sort(vowels,startIndex,endIndex);
        System.out.println("The sorted array is:" + Arrays.toString(vowels));

        //Perform a binary search from a specified point
        char foundKey = 'i';
        int foundIndex = Arrays.binarySearch(vowels,foundKey);
        System.out.println("The found key is: " + foundIndex);

        //Perform a binary search using the specified point of an array

        int searchedIndex = Arrays.binarySearch(vowels, startIndex, endIndex, foundKey);
        System.out.println("The specified index  is: " + searchedIndex);

    }
}
