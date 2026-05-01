import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        char [] characters = {'a', 'b', 'c', 'd', 'e'};

        Scanner scanner = new Scanner(System.in);

        int index = scanner.nextInt();

        if  (index < 0 || index > characters.length -1) {
            System.out.println("The array is out of bounds.");
        }
        else {
            System.out.println(characters[index]);
        }



    }
}