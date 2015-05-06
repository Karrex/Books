import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("Books.txt");
        Library.readBooks(file);
        Library.writeBook(new Book("Romeo and Juliet", "William Shakespeare", 1597));
        Library.readBooks(file);
    }
}
