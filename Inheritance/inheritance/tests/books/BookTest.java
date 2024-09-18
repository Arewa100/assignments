package books;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BookTest {
    @Test
    public void testing_That_Book_Class_Exists() {
        assertNotNull(new Book("Puple Hibiscus", 2019, "Ngozi Chimamanda"));;
    }
    @Test
    public void testing_That_Book_Can_Initialise_Its_Instance_Variables() {
        Book book = new Book("Puple Hibiscus", 2019, "Ngozi Chimamanda");
       assertEquals(book.toString(), "title: Puple Hibiscus, year: 2019, author: Ngozi Chimamanda");
    }
}
