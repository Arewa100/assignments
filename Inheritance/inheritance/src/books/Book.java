package books;

public class Book {
    private final String title;
    private final int year;
    private final String author;

    public Book(String title, int year, String author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("title: %s, year: %d, author: %s", title, year, author);
    }
}
