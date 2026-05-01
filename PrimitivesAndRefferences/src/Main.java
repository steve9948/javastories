import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        Understanding the key differences between primitive and reference types
        Primitives are int, double, boolean, char, byte, short, long, float.
        Primitives are stored in the stack memory
        */

        int a = 10;                // primitive
        int b = a;                 // copy the value
        b = 20;                    // change b

        System.out.println(a);     // still 10, because it's independent


        /*
         *Reference types have their addresses stored in the stack pointing to their values
         *in the heap
         * They include the Strings, Arrays, Scanner, custom classes, collections like ArrayList
         * */

        String x = "Hello";        // reference
        String y = x;              // copy the address
        y = "World";               // y now points to a new object

        System.out.println(x);     // still "Hello"

        //Where reference types show their behavior
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        System.out.println("Array one: "+ list1);

        //Now the behavior time
        ArrayList<String>list2 = list1;
        list2.add("B");
        System.out.println("List1 is; "+ list1); //outputs [A, B] on both cases
        System.out.println("Haha a reference"+list2);

    }
}