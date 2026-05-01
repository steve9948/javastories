import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        char smallLetter = 'a';
        char capitalLetter = 'A';

        System.out.println(smallLetter > capitalLetter);
        System.out.println(smallLetter - capitalLetter);

        boolean isSchoolStudent = true;
        boolean isLibraryMember = false;
        int age = 10;

        System.out.println(isSchoolStudent || isLibraryMember && age > 18);

        int score = 95;


        System.out.println(score++); // 95
        System.out.println(score); // 96

        int Score = 95;


        System.out.println(++Score); // 96
        System.out.println(Score); // 96

        String name = "Farhan";
        int agen = 27;

        String formattedString = String.format("My name is %s and I'm %d years old.", name, agen);

        System.out.println(formattedString);

        System.out.printf("The length of name is: %d%n", name.length());

        String myName = "Stephen Mbugua Gichimu";

        System.out.println(Arrays.toString(myName.split(" ")));
    }
}