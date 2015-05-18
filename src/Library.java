import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Library {
    private static final Logger logger = Logger.getLogger(Library.class.getName());

    public static void readBooks(File f) {
        ArrayList<Book> books = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String s = null;
            while ((s = br.readLine()) != null) {
                String[] book = s.split(";");
                books.add(new Book(book[0], book[1], Integer.parseInt(book[2])));
                logger.log(Level.INFO, "read books");
            }
            Collections.sort(books);
            System.out.println(books);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "exception in readBooks()", e);
        }
    }

    public static void writeBook(Book book) {
        File file = new File("Books.txt");
        String title = book.getTitle();
        String autor = book.getAutor();
        int year = book.getYear();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            System.out.println();
            bw.write(title + ";" + autor + ";" + year + ";");
            bw.newLine();
            bw.flush();
            logger.log(Level.INFO, "write books");
        } catch (IOException e) {
            logger.log(Level.SEVERE, "exception in writeBook()", e);
        }
    }
}
