package books;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PrintBookTest {
    @Test
    public void testIfPrintBookExists() {
        new PrintBook("49 laws of Power", 2004, "Robert Greene", "joost effer", "1233");
    }

    @Test
    public void testThatPrintBookInheritsFromBookSuperClass() {
        PrintBook printBook = new PrintBook("49 laws of Power", 2004, "Robert Greene", "joost effer", "1233");
        assertEquals(printBook.toString(), "publisher: joost effer, ISBN: 1233");
    }

    @Test
    public void testToGetTheAuthorNameFromPrintBook() {
        PrintBook printBook = new PrintBook("49 laws of Power", 2004, "Robert Greene", "joost effer", "1233");
        String author = printBook.getAuthor();
        assertEquals("Robert Greene", author);
    }
}
