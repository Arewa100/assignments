package servicesTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.EntryServices;
import services.EntryServicesImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntryServiceTest {
    private EntryServices entryServices;
    @BeforeEach
    public void setUp() {
        entryServices = new EntryServicesImpl();

    }
    @Test
    public void testThatZeroEntryHasBeenCreated() {
        assertEquals(0, entryServices.numberOfCreatedEntry());
    }

    @Test
    public void testToCreateEntry_No_Of_CreatedEntryIsOne() {
        String feedBack = entryServices.createEntry("title", "body");
        assertEquals("Entry created successfully...", feedBack);
        assertEquals(1, entryServices.numberOfCreatedEntry());
    }
    @Test
    public void testToCreateEntry_One_Of_CreatedEntryIsTwo() {
        String feedBack = entryServices.createEntry("title", "body");
        String secondFeedBack = entryServices.createEntry("title2", "body2");
        assertEquals("Entry created successfully...", feedBack);
        assertEquals("Entry created successfully...", secondFeedBack);
        assertEquals(2, entryServices.numberOfCreatedEntry());
    }

}
