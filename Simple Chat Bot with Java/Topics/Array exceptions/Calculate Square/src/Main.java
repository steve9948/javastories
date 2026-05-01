class FixingExceptions {

    public static void calculateSquare(int[] array, int index) {
        // write your code here

        try {
            int element = array[index];
            System.out.println(element * element);
        }catch (Exception e) {
            System.out.println("Exception!");
        }

    }
}