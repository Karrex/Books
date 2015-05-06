import java.io.*;
import java.util.ArrayList;

public class Library {
    public static void readBooks(File f) {
        ArrayList<Book> books = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String s = null;
            while ((s = br.readLine()) != null) {
                String[] book = s.split(";");
                books.add(new Book(book[0], book[1], Integer.parseInt(book[2])));
            }
            System.out.println(books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeBook(Book book) {
        File file = new File("Books.txt");
        String title = book.getTitle();
        String autor = book.getAutor();
        int year = book.getYear();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            bw.write(title + ";" + autor + ";" + year + ";");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
