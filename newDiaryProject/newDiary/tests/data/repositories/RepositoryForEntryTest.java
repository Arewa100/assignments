package data.repositories;

import data.models.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}