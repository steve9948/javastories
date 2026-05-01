package Arrays;
import java.util.Arrays;

public class multiDimensional {
    public static void main(String[] args) {
        int[][] medicineRoutine = {
                {1, 2, 3, 4, 5, 6, 7},
                {0, 1, 1, 0, 1, 1, 0},
                {1, 0, 1, 0, 1, 0, 0},
                {0, 0, 1, 1, 0, 1, 0},
        };

        int[][] medicineRoutine2 = {
                {1, 2, 3, 4, 5, 6, 7},
                {0, 1, 1, 0, 1, 1, 0},
                {1, 0, 1, 0, 1, 0, 0},
                {0, 0, 1, 1, 0, 1, 0},
        };

        System.out.println(Arrays.deepEquals(medicineRoutine, medicineRoutine2)); // true

    }
}
