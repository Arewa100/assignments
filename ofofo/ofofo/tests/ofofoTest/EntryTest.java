package ofofoTest;

import models.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import repositories.EntryRepository;
import repositories.RepositoryForEntry;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntryTest {
    private EntryRepository entryRepository;

    @BeforeEach
    public void setUp() {
        entryRepository = new RepositoryForEntry();
    }

    @Test
    public void testThatEntryRepositoryIsEmpty() {
        assertEquals(0, entryRepository.countNumberOfEntries());
    }

    @Test
    public void testToSaveEntryToEntryRepositoryCountShouldBeOne() {
        Entry entry = new Entry("firstUser", 1, "title", "body");
        entryRepository.save(entry);
        assertEquals(1, entryRepository.countNumberOfEntries());
    }

    @Test
    public void testToSaveEntryAndFindEntryByIdAndUserName() {
        Entry entry = new Entry("firstUser", 1, "title", "body");
        entryRepository.save(entry);
        assertEquals("title", entryRepository.findById("firstUser", 1).getTitle());
    }

    @Test
    public void test_ToSaveTwoEntryAnd_FindThemById () {
        Entry entry = new Entry("firstUser", 1, "title", "body");
        Entry seondEntry = new Entry("firstUser", 2, "title2", "body2");
        entryRepository.save(entry);
        entryRepository.save(seondEntry);
        assertEquals("title", entryRepository.findById("firstUser", 1).getTitle());
        assertEquals("title2", entryRepository.findById("firstUser", 2).getTitle());

    }
    @Test
    public void testToSaveEntryAndFindEntryByTitle() {
        Entry entry = new Entry("firstUser", 1, "title", "body");
        entryRepository.save(entry);
        assertEquals("body", entryRepository.findByTitle("firstUser", "title").getBody());
    }

    @Test
    public void testToSaveTwoEntryWithSameTitleAndFindByTitle_Output_Is_FirstTitle() {
        Entry entry = new Entry("firstUser", 1, "title", "body");
        Entry secondEntry = new Entry("firstUser", 2, "title", "body2");
        entryRepository.save(entry);
        entryRepository.save(secondEntry);
        assertEquals("body", entryRepository.findByTitle("firstUser", "title").getBody());
        assertEquals("body", entryRepository.findByTitle("firstUser", "title").getBody());

    }

    @Test
    public void testToFindAllEntriesThatBelongToAParticularADiary() {
        Entry entry = new Entry("firstUser", 1, "firstUserTitle", "body");
        Entry secondEntry = new Entry("firstUser", 2, "firstUserTitleTwo", "body2");
        Entry secondUserEntryOne = new Entry("secondUser", 1, "secondUserTitle", "body");
        Entry secondUserEntryTwo  = new Entry("secondUser", 2, "secondUserTitleTwo", "body2");
        entryRepository.save(entry);
        entryRepository.save(secondEntry);
        entryRepository.save(secondUserEntryOne);
        entryRepository.save(secondUserEntryTwo);
        assertEquals(4, entryRepository.countNumberOfEntries());

        assertEquals(2, entryRepository.findAll("firstUser").size());
        assertEquals("firstUserTitle", entryRepository.findAll("firstUser").getFirst().getTitle());

        assertEquals("secondUserTitle", entryRepository.findAll("secondUser").getFirst().getTitle());

    }

    @Test
    public void testToSaveTwoEntryAndDeleteOne_One_Entry_IsRemaining() {
        Entry entry = new Entry("firstUser", 1, "firstUserTitle", "body");
        Entry secondEntry = new Entry("firstUser", 2, "firstUserTitleTwo", "body2");
        entryRepository.save(entry);
        entryRepository.save(secondEntry);
        assertEquals(2, entryRepository.countNumberOfEntries());
        entryRepository.delete("firstUser", 1);
        assertEquals(1, entryRepository.findAll("firstUser").size());
        assertEquals(1, entryRepository.countNumberOfEntries());
    }

    @Test
    public void testThatWeCanUpdateEntryTitleAndBody() {
        Entry entry = new Entry("firstUser", 1, "title", "body");
        entryRepository.save(entry);
        assertEquals("title", entryRepository.findById("firstUser", 1).getTitle());
        entryRepository.update("firstUser", 1, "newTitle", "newBody");
        assertEquals("newTitle", entryRepository.findById("firstUser", 1).getTitle());
    }

}
