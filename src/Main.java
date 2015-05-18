import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("Books.txt");
        Library.writeBook(new Book("Gamlet", "William Shakespeare", 1600));
        Library.readBooks(file);
    }
}
