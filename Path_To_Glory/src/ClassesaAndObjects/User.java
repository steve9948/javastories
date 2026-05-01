package ClassesaAndObjects;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    public String name;
    public LocalDate birthDay;
    public ArrayList<String> borrowedBooks = new ArrayList<>();

    public int age(){
        return Period.between(this.birthDay, LocalDate.now()).getYears();
    }

    public void borrow(String bookTitle){
        this.borrowedBooks.add(bookTitle);
    }

    void borrow(Book book){
        this.borrowedBooks.add(book.toString());
    }
}
