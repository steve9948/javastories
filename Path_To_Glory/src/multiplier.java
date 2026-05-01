public class multiplier {
    public static void main(String[] args) {
        for(int num = 1; num < 10; num++){
            System.out.printf("\nmultiplication table of %d%n", num);
            for (int multiple = 0; multiple < 10; multiple++){
                System.out.printf("%d * %d = %d%n",num, multiple,num*multiple);
            }
        }
    }
}
