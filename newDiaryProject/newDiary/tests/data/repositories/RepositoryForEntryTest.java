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
         entryRepository.save(entry);
         Entry entryTwo = new Entry();
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
    public testToSaveAnExistingEntry_EntryIs_Updated_Count_Is_One() {
        Entry entry = new Entry();
        entry.setEntryId(1);
        entry.setTitle("title");
        entry.setBody("body");
        entry.setDiaryId("Sarah");
        entryRepository.save(entry);
        Entry entryTwo = new Entry();
        entryTwo.setEntryId(1);
        entryTwo.setTitle("title2");
        entryTwo.setBody("body2");
        entryTwo.setDiaryId("Sarah");
        entryRepository.save(entryTwo);
        assertEquals(1, entryRepository.count());
        assertEquals(entryTwo.getTitle(), entryRepository.findById("Sarah", 1).getTitle());
    }


//    private int entryId;
//    private String title;
//    private String body;
//    private String diaryId;
//    private LocalDate dateOfCreation;
}