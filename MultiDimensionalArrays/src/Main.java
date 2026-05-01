import java.util.Arrays;

class Main{
    public static void main(String[] args) {

        //2 dimensions
        int[][] twoDArray = new int[2][10];
        for  (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] ++;
                System.out.println(twoDArray[i][j] + " ");
            }
        }
        for (int[] ints : twoDArray) {
            System.out.println(Arrays.toString(ints));
        }

    }
}

