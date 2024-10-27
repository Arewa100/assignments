package ofofoTest;

import models.Entry;
import org.junit.jupiter.api.Test;
import repositories.EntryRepository;
import repositories.RepositoryForEntry;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class EntryTest {
    private  final EntryRepository entryRepository = new RepositoryForEntry();

    @Test
    public void test_That_Entry_Is_Empty() {
        assertEquals(0, entryRepository.count());
    }

    @Test
    public void test_That_Entry_Can_Save_Count_Is_1() {
        Entry entry = new Entry("title" , "body", 1);
        entryRepository.save(entry);
        assertEquals(1, entryRepository.count());
    }

    @Test
    public void test_To_Save_Entry_And_Find_The_Entry_By_Id() {
        Entry entry = new Entry("title" , "body", 1);
        entryRepository.save(entry);
        Entry foundEntry = entryRepository.findById(1);
        assertEquals("title", foundEntry.getTitle());
    }

    @Test
    public void test_To_Save_Two_Entry_And_Find_The_Entries_By_Id() {
        Entry entry = new Entry("title" , "body", 1);
        entryRepository.save(entry);
        Entry newEntry = new Entry("title2" , "body", 2);
        entryRepository.save(newEntry);
        assertEquals(2, entryRepository.count());
        Entry foundEntryOne = entryRepository.findById(1);
        Entry foundEntryTwo = entryRepository.findById(2);
        assertEquals("title", foundEntryOne.getTitle());
        assertEquals("title2", foundEntryTwo.getTitle());
    }

    @Test
    public void testTo_Save_One_EntryAnd_Find_The_Entry_By_title() {
        Entry entry = new Entry("title" , "body", 1);
        entryRepository.save(entry);
        Entry foundEntry = entryRepository.findByTitle("title");
        assertEquals("title", foundEntry.getTitle());
    }

    @Test
    public void testTSave_TwoEntryAndFind_The_Entries_By_title() {
        Entry entry = new Entry("title" , "body", 1);
        Entry newEntry = new Entry("title2" , "body", 2);
        entryRepository.save(entry);
        entryRepository.save(newEntry);
        assertEquals(2, entryRepository.count());
        Entry foundEntryOne = entryRepository.findByTitle("title");
        Entry foundEntryTwo = entryRepository.findByTitle("title2");
        assertEquals("title", foundEntryOne.getTitle());
        assertEquals("title2", foundEntryTwo.getTitle());

    }

    @Test
    public void testToSaveAnEntryAnd_Delete_EntryBy_Title_Number_Of_Entries_Would_Be_Zero() {
        Entry entry = new Entry("title" , "body", 1);
        entryRepository.save(entry);
        entryRepository.delete("title");
        assertEquals(0, entryRepository.count());
    }

    @Test
    public void testToAddEntryAndDeleteItByTitle_EntryShouldBeNull() {
        Entry entry = new Entry("title" , "body", 1);
        entryRepository.save(entry);
        entryRepository.delete("title");
        assertNull(entryRepository.findByTitle("title"));
    }
    @Test
    public void testToAddEntryAnd_Delete_Entry_By_DeletedById() {
        Entry entry = new Entry("title" , "body", 1);
        entryRepository.save(entry);
        entryRepository.delete(1);
        assertEquals(0, entryRepository.count());
    }
    @Test
    public void testToAddEntryAndDeleteItById_EntryShouldBeNull() {
        Entry entry = new Entry("title" , "body", 1);
        entryRepository.save(entry);
        entryRepository.delete(1);
        assertNull(entryRepository.findById(1));
    }

    @Test
    public void testToGetDateEntryWasCreated() {
        Entry entry = new Entry("title" , "body", 1);
        entryRepository.save(entry);
        System.out.println(entryRepository.getDate(1));
    }


}
