import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to more OOP!");

        User user = new User();
        user.name = "Steve";
        user.birthday = LocalDate.parse("1998-12-24");

        Books books = new Books();
        books.title = "Carmilla";
        user.borrow(books);
        books.authors.add("Sheridan Lee Fanu");
        user.borrow(books);


        System.out.printf("%s was born on %s", user.name, user.birthday);
        System.out.printf("%n%s is %s years old.",user.name, user.age());
        System.out.printf("%n%s has borrowed this books: %s ", user.name, user.borrowedBooks.toString());
        System.out.printf("%n$s is written by %s ", books.title, books.authors);


//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
    }
}