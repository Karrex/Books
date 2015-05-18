public class Book implements Comparable<Book> {
    private String title;
    private String autor;
    private int year;

    public Book(String title, String autor, int year) {
        this.title = title;
        this.autor = autor;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "title = " + title + ", autor = " + autor + ", year = " + year + '}' + "\n";
    }

    @Override
    public int compareTo(Book book) {
        return this.getAutor().compareToIgnoreCase(book.getAutor());
    }
}
