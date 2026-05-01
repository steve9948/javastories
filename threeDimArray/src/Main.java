import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [][][] threeDimArray = new int[2][3][4];

        int element = 0;

        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray.length; j++) {
                for (int k = 0; k < threeDimArray.length; k++) {
                    threeDimArray[i][j][k] = element;
                }
                element++;
            }

        }
        for (int i = 0; i < threeDimArray.length; i++) {
            for (int j = 0; j < threeDimArray.length; j++) {
                System.out.println(Arrays.toString(threeDimArray[i][j])+ " ");
            }

            System.out.println();
        }

    }
}