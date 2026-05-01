import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;


public class User {
    String name;
    LocalDate birthday;

    ArrayList<String>borrowedBooks = new ArrayList<>();

    //Method to calculate the users` age
    int age(){
        return Period.between(this.birthday, LocalDate.now()).getYears();
    }

    void borrow(Books books){
        this.borrowedBooks.add(books.toString());

    }
}
