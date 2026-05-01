package Arrays;

import java.util.Arrays;

public class offset {
    public static void main(String[] args) {
        int[] evenNumbers = {2, 4, 6, 8, 10, 12, 14};

        int startIndex = 2;
        int endIndex = 6;
        int[] newEvens = Arrays.copyOfRange(evenNumbers, startIndex, endIndex);
        System.out.println("The indexed array offset values are: " + Arrays.toString(newEvens));
    }
}
