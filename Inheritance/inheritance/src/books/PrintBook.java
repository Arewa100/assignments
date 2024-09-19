package books;

public class PrintBook extends Book {
    private final String publisher;
    private final String ISBN;

    public PrintBook(String title, int year, String author, String publisher, String ISBN) {
        super(title, year, author);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return String.format("publisher: %s, ISBN: %s", publisher, ISBN);
    }

    public String getAuthor() {
        return super.getAuthor();
    }
}
