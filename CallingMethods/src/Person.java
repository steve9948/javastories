import java.util.Scanner;

public class Person {
    Scanner sc = new Scanner(System.in);

    void generalPerson(){
        System.out.println("Please input your name");
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);

        sc.close();
    }

}
