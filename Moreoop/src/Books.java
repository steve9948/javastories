import java.util.ArrayList;

public class Books {
    String title;
    ArrayList<String> authors = new ArrayList<>();

    public String toString(){
        return String.format("%s by $s",this.title, this.authors.toString());
    }
}
