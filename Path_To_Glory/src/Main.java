import ClassesaAndObjects.Book;
import ClassesaAndObjects.User;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new User();

        user.name = "Steve";
        user.birthDay = LocalDate.parse("1998-12-23");

        System.out.printf("%s is %s years old", user.name, user.age());

        user.borrow("Java");
        user.borrow("Low level statics");

        System.out.printf("%n%s has borrowed this books %s", user.name, user.borrowedBooks.toString());

        Book book = new Book();
        book.title = "Carmilla";
        book.authors.add("Sheridan Le Fanu");
        System.out.printf("%n%s is written by %s",book.title, book.authors.toString());


//        for (int i = 1; i < 10; i++){
//            for (int j = 1; j < 10; j++){
//                System.out.print(i * j + "\t");
//            }
//            System.out.println();
//        }


    }
}
