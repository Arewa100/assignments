package data.repositories;

import data.models.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class RepositoryForEntryTest {

     private EntryRepository entryRepository;
     @BeforeEach
     public void setUp() {
         entryRepository = new RepositoryForEntry();
     }

     @Test
     public void testThatEntry_RepositoryIsEmpty_Count_Is_0() {
        assertEquals(0, entryRepository.count());
     }

     @Test
     public void testThatEntry_RepositoryIsNotEmpty_Count_Is_1() {
         Entry entry = new Entry();
         assertEquals(0, entryRepository.count());
         entryRepository.save(entry);
         assertEquals(1, entryRepository.count());
     }
    @Test
    public void testToSaveTwoEntries_Count_Is_Two() {
        Entry entry = new Entry();
        entry.setEntryId(1);
        entry.setTitle("title");
        entry.setBody("body");
        entry.setDiaryId("Sarah");
        entryRepository.save(entry);
        Entry entryTwo = new Entry();
        entryTwo.setEntryId(2);
        entryTwo.setTitle("title2");
        entryTwo.setBody("body2");
        entryTwo.setDiaryId("Micheal");
        entryRepository.save(entryTwo);
        entryRepository.save(entryTwo);
        assertEquals(2, entryRepository.count());
    }

    @Test
    public void testToSaveAnEntryAndCheckIfItExistsById_Result_Is_True() {
         Entry entry = new Entry();
         entry.setEntryId(1);
         entry.setTitle("title");
         entry.setBody("body");
         entry.setDiaryId("Sarah");
         entryRepository.save(entry);
         assertTrue(entryRepository.existsById("Sarah", 1));

    }

    @Test
    public void testToCheckIfAnEntryThatsNotSavedExists_ResultIsFalse() {
        Entry entry = new Entry();
        entry.setEntryId(1);
        entry.setTitle("title");
        entry.setBody("body");
        entry.setDiaryId("Sarah");
        entryRepository.save(entry);
        assertFalse(entryRepository.existsById("Micheal", 1));
    }

    @Test
    public void testToSaveTwoEntryAndCheckIfItExistsS_ResultIstrue() {
        Entry entry = new Entry();
        entry.setEntryId(1);
        entry.setTitle("title");
        entry.setBody("body");
        entry.setDiaryId("Sarah");
        entryRepository.save(entry);
        Entry entryTwo = new Entry();
        entryTwo.setEntryId(2);
        entryTwo.setTitle("title2");
        entryTwo.setBody("body2");
        entryTwo.setDiaryId("Micheal");
        entryRepository.save(entryTwo);
        assertTrue(entryRepository.existsById("Sarah", 1));
        assertTrue(entryRepository.existsById("Micheal", 2));
    }

    @Test
    public void testToSaveEntryAndFindEntryById_Entry_Is_Returned() {
         Entry entry = new Entry();
         entry.setEntryId(1);
         entry.setTitle("title");
         entry.setBody("body");
         entry.setDiaryId("Sarah");
         entryRepository.save(entry);
         Entry foundEntry = entryRepository.findById("Sarah", 1);
         assertEquals(entry, foundEntry);

    }

    @Test
    public void testToSaveTwoEntryAndFindTheSecondEntry() {
         Entry entry = new Entry();
         entry.setEntryId(1);
         entry.setTitle("title");
         entry.setBody("body");
         entry.setDiaryId("Sarah");
         entryRepository.save(entry);
         Entry entryTwo = new Entry();
         entryTwo.setEntryId(2);
         entryTwo.setTitle("title2");
         entryTwo.setBody("body2");
         entryTwo.setDiaryId("Micheal");
         entryRepository.save(entryTwo);
         assertEquals(2, entryRepository.count());
         assertEquals(entryTwo, entryRepository.findById("Micheal", 2));

    }
    @Test
    public void testToSaveAnExistingEntry_EntryIs_Updated_Count_Is_One() {
        Entry entry = new Entry();
        entry.setEntryId(1);
        entry.setTitle("title");
        entry.setBody("body");
        entry.setDiaryId("Sarah");
        entryRepository.save(entry);
        assertEquals("title", entryRepository.findById("Sarah", 1).getTitle());
        assertEquals(1, entryRepository.count());
        Entry entryTwo = new Entry();
        entryTwo.setEntryId(1);
        entryTwo.setTitle("title2");
        entryTwo.setBody("body2");
        entryTwo.setDiaryId("Sarah");
        entryRepository.save(entryTwo);
        assertEquals(1, entryRepository.count());
        assertEquals("title2", entryRepository.findById("Sarah", 1).getTitle());
    }

    @Test
    public void testToFindEntryByTitle() {
         Entry entry = new Entry();
         entry.setEntryId(1);
         entry.setTitle("title");
         entry.setBody("body");
         entry.setDiaryId("Sarah");
         entryRepository.save(entry);
         assertEquals("title", entryRepository.findByTitle("Sarah", "title").getTitle());
    }
    @Test
    public void testToSaveTwoEntries_FindEntryByTitle_FirstEntry_WithTitle_IsReturned() {
        Entry entryTwo = new Entry();
        entryTwo.setEntryId(2);
        entryTwo.setTitle("title");
        entryTwo.setBody("body2");
        entryTwo.setDiaryId("Sarah");
        entryRepository.save(entryTwo);
        Entry entry = new Entry();
        entry.setEntryId(1);
        entry.setTitle("title");
        entry.setBody("body");
        entry.setDiaryId("Sarah");
        entryRepository.save(entry);
        Entry foundEntry = entryRepository.findByTitle("Sarah", "title");
        assertEquals("body2", foundEntry.getBody());
        assertEquals("title", foundEntry.getTitle());
    }

    @Test
    public void testThatSaveEntriesAndFindAll_ListOfEntryIsReturned() {
        Entry entryTwo = new Entry();
        entryTwo.setEntryId(1);
        entryTwo.setTitle("title");
        entryTwo.setBody("body2");
        entryTwo.setDiaryId("Sarah");
        entryRepository.save(entryTwo);
        Entry entry = new Entry();
        entry.setEntryId(2);
        entry.setTitle("title");
        entry.setBody("body");
        entry.setDiaryId("Sarah");
        entryRepository.save(entry);
        Entry  entryThree = new Entry();
        entryThree.setEntryId(1);
        entryThree.setTitle("title");
        entryThree.setBody("body");
        entryThree.setDiaryId("Micheal");
        entryRepository.save(entryThree);
        assertEquals(3, entryRepository.count());
        assertEquals(2, entryRepository.findAll("Sarah").size());
    }

    @Test
    public void testToSaveThreeEntryAndDeleteOne_Count_Is_Two() {
        Entry entryTwo = new Entry();
        entryTwo.setEntryId(1);
        entryTwo.setTitle("title");
        entryTwo.setBody("body2");
        entryTwo.setDiaryId("Sarah");
        entryRepository.save(entryTwo);
        Entry entry = new Entry();
        entry.setEntryId(2);
        entry.setTitle("title");
        entry.setBody("body");
        entry.setDiaryId("Sarah");
        entryRepository.save(entry);
        Entry  entryThree = new Entry();
        entryThree.setEntryId(1);
        entryThree.setTitle("title");
        entryThree.setBody("body");
        entryThree.setDiaryId("Micheal");
        entryRepository.save(entryThree);
        assertEquals(3, entryRepository.count());
        entryRepository.deleteById("Sarah", 2);
        assertEquals(2, entryRepository.count());
    }

    @Test
    public void testToSaveTwoEntryAndDeleteOneCheckIfItExists_Result_IsFalse() {
        Entry entryTwo = new Entry();
        entryTwo.setEntryId(1);
        entryTwo.setTitle("title");
        entryTwo.setBody("body2");
        entryTwo.setDiaryId("Sarah");
        entryRepository.save(entryTwo);
        Entry entry = new Entry();
        entry.setEntryId(2);
        entry.setTitle("title");
        entry.setBody("body");
        entry.setDiaryId("Sarah");
        entryRepository.save(entry);
        assertEquals(2, entryRepository.count());
        assertTrue(entryRepository.existsById("Sarah", 2));
        entryRepository.deleteById("Sarah", 2);
        assertFalse(entryRepository.existsById("Sarah", 2));
        assertEquals(1, entryRepository.count());
    }

    @Test
    public void testToDeleteEntryByPassingInEntryAsArgumentCheckIf_It_Exists_Result_Is_False() {
        Entry entryTwo = new Entry();
        entryTwo.setEntryId(1);
        entryTwo.setTitle("title");
        entryTwo.setBody("body2");
        entryTwo.setDiaryId("Sarah");
        entryRepository.save(entryTwo);
        Entry entry = new Entry();
        entry.setEntryId(2);
        entry.setTitle("title");
        entry.setBody("body");
        entry.setDiaryId("Sarah");
        entryRepository.save(entry);
        assertEquals(2, entryRepository.count());
        assertTrue(entryRepository.existsById("Sarah", 2));
        entryRepository.delete(entry);
        assertFalse(entryRepository.existsById("Sarah", 2));
        assertEquals(1, entryRepository.count());
    }

    @Test
    public void test_ToThreeEntryAndDeleteEntryByDiaryId_AllEntryThatBelongsToTheDiaryIdIsDeleted() {
        Entry entryTwo = new Entry();
        entryTwo.setEntryId(1);
        entryTwo.setTitle("title");
        entryTwo.setBody("body2");
        entryTwo.setDiaryId("Sarah");
        entryRepository.save(entryTwo);
        Entry entry = new Entry();
        entry.setEntryId(2);
        entry.setTitle("title");
        entry.setBody("body");
        entry.setDiaryId("Sarah");
        entryRepository.save(entry);
        Entry  entryThree = new Entry();
        entryThree.setEntryId(1);
        entryThree.setTitle("title");
        entryThree.setBody("body");
        entryThree.setDiaryId("Micheal");
        entryRepository.save(entryThree);
        assertEquals(3, entryRepository.count());
        entryRepository.deleteAll("Sarah");
//        assertEquals(1, entryRepository.count());
        assertFalse(entryRepository.existsById("Sarah", 2));
        assertFalse(entryRepository.existsById("Sarah", 1));
        assertTrue(entryRepository.existsById("micheal", 1));
    }


}